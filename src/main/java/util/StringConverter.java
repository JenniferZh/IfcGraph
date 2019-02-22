/**
 * Copyright:    CCPL BY-NC-SA 3.0 (cc) 2008 Eike Tauscher, Jan Tulke <br>
 *               Creative Commons Public Licence. Some Rights Reserved.<br>
 *               http://creativecommons.org/licenses/by-nc-sa/3.0/de/ <br>
 *               If you use this code, please send a message to one of the<br>
 *               authors: eike.tauscher@uni-weimar.de<br>
 *                        jan.tulke@hochtief.de<br>
 */

package util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class is a service class providing methods for decoding and encoding
 * strings according to ISO-10303-21.
 * This class is provided as-is with no warranty.<br>
 * <br>
 * The class GuidCompressor is part of the OPEN IFC JAVA TOOLBOX package.
 * Copyright: CCPL BY-NC-SA 3.0 (cc) 2008 Eike Tauscher, Jan Tulke <br>
 * <br>
 * The OPEN IFC JAVA TOOLBOX package itself (except this class) is licensed
 * under <br>
 * <a rel="license"
 * href="http://creativecommons.org/licenses/by-nc-sa/3.0/de/">Creative Commons
 * Attribution-Non-Commercial- Share Alike 3.0 Germany</a>.<br>
 * Please visit <a
 * href="http://www.openifctools.com">http://www.openifctools.com</a> for more
 * information.<br>
 * 
 * @author Jan Tulke
 * @version 1.0 - 24.07.2009
 * 
 */
public class StringConverter
{
	private static final String codePage = "ABCDEFGHI";

	/**
	 * Decodes a given string. All mechanisms according to ISO-10303-21
	 * (�6.3.3.1-�6.3.3.3) are supported and are selected automatically.
	 * 
	 * @param string
	 *            String to be decoded
	 * @return decoded string
	 * @throws CharacterCodingException
	 */
	public static String decode(String string) throws CharacterCodingException
	{
		// Beim decoden eine eigene Exception werfen
		// Testen ob bei decoding von 8859 character auch in einem der Bereiche
		// 32/126 160/254 liegt
		// sonst exception werfen

		CharsetDecoder decoderIso8859_1 = Charset.forName("ISO-8859-1").newDecoder();
		CharsetDecoder decoderUTF16 = Charset.forName("UTF-16BE").newDecoder();
		CharsetDecoder decoderUTF32 = Charset.forName("UTF-32").newDecoder();
		CharsetDecoder decoder = null;
		boolean extendedCodePage = false;
		String decodedString = new String();
		char[] characterArray = string.toCharArray();
		int codePoint;
		int index = -1;
		while (index < characterArray.length - 1)
		{
			index++;
			codePoint = Character.codePointAt(characterArray, index);
			if (codePoint < 32 || codePoint > 126){ 
				CharacterCodingException e =  new CharacterCodingException();
				throw e;
			}

			// single apostroph is encoded as two consecutive apostrophes
			if (characterArray[index] == '\'')
			{
				decodedString += "\'";
				index++;
			} else if (characterArray[index] == '\\')
			{
				index++;
				if (characterArray[index] == '\\')
				{ // not a control sequence but a normal back slash
					decodedString += "\\";
				} else if (characterArray[index] == 'S')
				{
					index++;
					if (extendedCodePage)
						decodedString = decodedString.concat(decoder.decode(buffer("" + characterArray[++index]))
								.toString());
					else
						decodedString = decodedString.concat(new String(Character.toChars(Character.codePointAt(
								characterArray, ++index) + 128)));
				} else if (characterArray[index] == 'P')
				{
					index++;
					int page = codePage.indexOf(characterArray[index]) + 1;
					Charset charset = Charset.forName("ISO-8859-" + page);
					decoder = charset.newDecoder();
					extendedCodePage = true;
					index++;
				} else if (characterArray[index] == 'X')
				{
					index++;
					if (characterArray[index] == '\\')
					{
						int[] codePoints = new int[1];
						codePoints[0] = Integer.decode("0x" + characterArray[++index] + characterArray[++index]);
						decodedString = decodedString.concat(decoderIso8859_1.decode(buffer(codePoints)).toString());
					} else if (characterArray[index] == '2')
					{
						index++;
						// UTF-16BE (UCS-2)
						int[] codePoints;
						do
						{
							codePoints = new int[2];
							codePoints[0] = Integer.decode("0x" + characterArray[++index] + characterArray[++index]);
							codePoints[1] = Integer.decode("0x" + characterArray[++index] + characterArray[++index]);
							decodedString = decodedString.concat(decoderUTF16.decode(buffer(codePoints)).toString());
						} while (characterArray[index + 1] != '\\'); // \X0\ is
						// the
						// end
						// signal
						index += 4; // . Second HEX-number is optional.
					} else if (characterArray[index] == '4')
					{
						index++;
						// UTF32 (UCS-4)
						int[] codePoints;
						do
						{
							codePoints = new int[4];
							codePoints[0] = Integer.decode("0x" + characterArray[++index] + characterArray[++index]);
							codePoints[1] = Integer.decode("0x" + characterArray[++index] + characterArray[++index]);
							codePoints[2] = Integer.decode("0x" + characterArray[++index] + characterArray[++index]);
							codePoints[3] = Integer.decode("0x" + characterArray[++index] + characterArray[++index]);
							decodedString = decodedString.concat(decoderUTF32.decode(buffer(codePoints)).toString());
						} while (characterArray[index + 1] != '\\'); // \X0\ is
						// the
						// end
						// signal
						index += 4;
					}
				}
			} else
				decodedString = decodedString.concat(new String(Character.toChars(characterArray[index])));
		}
		return decodedString;
	}

	/**
	 * Converts the given string into a ByteBuffer
	 * 
	 * @param string
	 *            String to be converted
	 * @return ByteBuffer representing the given String
	 */
	private static ByteBuffer buffer(String string)
	{
		byte[] bytes = string.getBytes();
		bytes[0] += 128;
		ByteBuffer buffer = ByteBuffer.allocate(bytes.length);
		buffer.put(bytes);
		buffer.rewind();
		return buffer;
	}

	/**
	 * Converts an array of int into a ByteBuffer.
	 * 
	 * @param numbers
	 *            array of int to be converted
	 * @return ByteBuffer �quivalent to the input int[]
	 */
	private static ByteBuffer buffer(int[] numbers)
	{
		ByteBuffer buffer = ByteBuffer.allocate(numbers.length);
		for (int n : numbers)
		{
			byte b = (byte) n;
			buffer.put(b);
		}
		buffer.rewind();
		return buffer;
	}

	/**
	 * Converts a byte value into an int
	 * 
	 * @param b
	 *            byte value to be conerted
	 * @return �quivalent int value
	 */
	private static int byteToInt(byte b)
	{
		return b & 0xFF;
	}

	/**
	 * Encodes the given string with the basic alphabet according to
	 * ISO-10303-21. The encoding mechanismen is chosen automatically in the
	 * following order: ISO-8859-1, -2, ... , -9, UTF-16BE, UTF-32 In addition
	 * apostrophs and backslaches are doubled. Encoding according to
	 * ISO-10303-21 $6.3.3.3 is not supported.
	 * 
	 * @param string
	 *            String to be encoded
	 * @return endcoded string
	 */
	public static String autoencode(String string)
	{
		CharsetDecoder decoder8859_1 = Charset.forName("ISO-8859-1").newDecoder();

		CharsetEncoder encoder8859_1 = Charset.forName("ISO-8859-1").newEncoder();
		CharsetEncoder encoder8859_2 = Charset.forName("ISO-8859-2").newEncoder();
		CharsetEncoder encoder8859_3 = Charset.forName("ISO-8859-3").newEncoder();
		CharsetEncoder encoder8859_4 = Charset.forName("ISO-8859-4").newEncoder();
		CharsetEncoder encoder8859_5 = Charset.forName("ISO-8859-5").newEncoder();
		CharsetEncoder encoder8859_6 = Charset.forName("ISO-8859-6").newEncoder();
		CharsetEncoder encoder8859_7 = Charset.forName("ISO-8859-7").newEncoder();
		CharsetEncoder encoder8859_8 = Charset.forName("ISO-8859-8").newEncoder();
		CharsetEncoder encoder8859_9 = Charset.forName("ISO-8859-9").newEncoder();
		CharsetEncoder encoderUTF16 = Charset.forName("UTF-16BE").newEncoder();

		CharsetEncoder encoder = encoder8859_1;

		final int _ISO8859_1 = 1;
		final int _ISO8859_2 = 2;
		final int _ISO8859_3 = 3;
		final int _ISO8859_4 = 4;
		final int _ISO8859_5 = 5;
		final int _ISO8859_6 = 6;
		final int _ISO8859_7 = 7;
		final int _ISO8859_8 = 8;
		final int _ISO8859_9 = 9;
		final int _UTF16 = 11;
		final int _UTF32 = 12;
		int status = _ISO8859_1; // thus if only _ISO8859_1 is used there will
		// be no opening clause

		String openingClause = "";
		String closingClause = "";

		boolean encodingFailed;
		String encodedString = new String();

		CharBuffer charBuffer;
		ByteBuffer byteBuffer;
		byte _byte;
		int codePoint;
		char[] characterArray = string.toCharArray();
		char[] currentCharacter;
		int index = -1;
		while (index < characterArray.length - 1)
		{
			encodingFailed = false;
			index++;

			codePoint = Character.codePointAt(characterArray, index);
			if (codePoint > 65535)
			{
				// 4 byte encoding is necessary
				if (status == _UTF32)
				{
					openingClause = "";
				} else
				{
					status = _UTF32;
					encodedString += closingClause;
					openingClause += "\\X4\\";
					closingClause = "\\X0\\";
				}
				encodedString += openingClause;
				encodedString += String.format("%1$08X", codePoint);
				index++; // because two characters are used for the encoding of
				// supplementary characters
				continue;
			}

			// single apostrophe is encoded as two consecutive apostrophes
			if (characterArray[index] == '\'')
				encodedString += "\'\'";
			// a single backslash is encoded as two consecutive backslashes
			else if (characterArray[index] == '\\')
				encodedString += "\\\\";
			// do encoding for other characters
			else
			{
				try
				{
					currentCharacter = new char[] { characterArray[index] };
					charBuffer = CharBuffer.wrap(currentCharacter);

					if (status <= _ISO8859_9 && encoder.canEncode(currentCharacter[0]))
					{
						openingClause = "";
					} else if (encoder8859_1.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_1;
						encodedString += closingClause;
						openingClause = "\\PA\\";
						closingClause = "";
						encoder = encoder8859_1;
					} else if (encoder8859_2.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_2;
						encodedString += closingClause;
						openingClause = "\\PB\\";
						closingClause = "";
						encoder = encoder8859_2;
					} else if (encoder8859_3.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_3;
						encodedString += closingClause;
						openingClause = "\\PC\\";
						closingClause = "";
						encoder = encoder8859_3;
					} else if (encoder8859_4.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_4;
						encodedString += closingClause;
						openingClause = "\\PD\\";
						closingClause = "";
						encoder = encoder8859_4;
					} else if (encoder8859_5.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_5;
						encodedString += closingClause;
						openingClause = "\\PE\\";
						closingClause = "";
						encoder = encoder8859_5;
					} else if (encoder8859_6.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_6;
						encodedString += closingClause;
						openingClause = "\\PF\\";
						closingClause = "";
						encoder = encoder8859_6;
					} else if (encoder8859_7.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_7;
						encodedString += closingClause;
						openingClause = "\\PG\\";
						closingClause = "";
						encoder = encoder8859_7;
					} else if (encoder8859_8.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_8;
						encodedString += closingClause;
						openingClause = "\\PH\\";
						closingClause = "";
						encoder = encoder8859_8;
					} else if (encoder8859_9.canEncode(currentCharacter[0]))
					{
						status = _ISO8859_9;
						encodedString += closingClause;
						openingClause = "\\PI\\";
						closingClause = "";
						encoder = encoder8859_9;
					} else
					{
						encodingFailed = true;
					}

					if (!encodingFailed && status <= _ISO8859_9) // ISO 8859
					// encoding
					// may be
					// possible
					// accoriding
					// to
					// ISO-10303-21
					// �6.3.3.1
					{
						// System.out.println(encoder.charset().displayName());

						byteBuffer = encoder.encode(charBuffer);
						_byte = byteBuffer.get();

						if (byteToInt(_byte) >= 31 && byteToInt(_byte) <= 126)
						{
							encodedString += currentCharacter[0]; // no opening
							// clause
							// needed
							// because
							// ISO8859_1
							// is
							// default
						} else if (byteToInt(_byte) >= 160 && byteToInt(_byte) <= 254)
						{ // what about 255? can't be encoded!
							byteBuffer = ByteBuffer.allocate(1);
							_byte -= 128;
							byteBuffer.put(_byte);
							byteBuffer.rewind();
							// characters for code point 32-126 are the same for
							// all parts of ISO 8859
							encodedString += openingClause;
							encodedString += "\\S\\" + decoder8859_1.decode(byteBuffer);
						} else
						{
							encodingFailed = true; // to be encoded as 2 or 4
							// byte
						}
					}

					if (encodingFailed)
					{
						// encoding with 2 byte (UTF16)
						charBuffer.rewind();
						if (status == _UTF16)
						{
							openingClause = "";
						} else
						{
							status = _UTF16;
							encodedString += closingClause;
							openingClause += "\\X2\\";
							closingClause = "\\X0\\";
							encoder = encoderUTF16;
						}
						byteBuffer = encoder.encode(charBuffer);
						encodedString += openingClause;
						for (byte b : byteBuffer.array())
						{
							encodedString += String.format("%1$02X", b);
						}
					} // EOIF
				}// EOTry
				catch (CharacterCodingException e)
				{
					e.printStackTrace();
				}
			}// EOElse
		}// EOWhile
		encodedString += closingClause;
		return encodedString;
	}

//	/**
//	 * Encodes the given string according to ISO-10303-21 $6.3.3.1. All
//	 * characters must be included in the character set of the selected part of
//	 * ISO-8859.
//	 *
//	 * @param string
//	 *            String to be encoded
//	 * @param part
//	 *            Part of ISO-8859 which contains all characters of the given
//	 *            string (one of 1-9)
//	 * @return encoded string
//	 * @throws CharacterCodingException
//	 */
//	public static String encode_ISO8859(String string, int part) throws CharacterCodingException
//	{
//		if (part < 1 || part > 9)
//			return null;
//		CharsetEncoder encoder = Charset.forName("ISO-8859-" + part).newEncoder();
//		CharsetDecoder decoder = Charset.forName("ISO-8859-1").newDecoder();
//
//		String encodedString = "";
//		char[] characterArray = string.toCharArray();
//		ByteBuffer byteBuffer;
//		CharBuffer charBuffer;
//		char[] currentCharacter;
//		int index = -1;
//		byte _byte;
//
//		encodedString += "\\P" + codePage.charAt(part - 1) + "\\";
//		while (index < characterArray.length - 1)
//		{
//			index++;
//			currentCharacter = new char[] { characterArray[index] };
//			charBuffer = CharBuffer.wrap(currentCharacter);
//			byteBuffer = encoder.encode(charBuffer);
//			_byte = byteBuffer.get();
//
//			if (byteToInt(_byte) >= 31 && byteToInt(_byte) <= 126)
//			{
//				encodedString += currentCharacter[0];
//			} else if (byteToInt(_byte) >= 160 && byteToInt(_byte) <= 254)
//			{ // what about 255? can't be encoded!
//				byteBuffer = ByteBuffer.allocate(1);
//				_byte -= 128;
//				byteBuffer.put(_byte);
//				byteBuffer.rewind();
//				// characters for code point 32-126 are the same for all parts
//				// of ISO 8859
//				encodedString += "\\S\\" + decoder.decode(byteBuffer);
//			}
//		}
//		return encodedString;
//	}

	/**
	 * Encodes the given string as two-octet representation (2byte) according to
	 * ISO-10303-21 $6.3.3.2 Only Unicode characters contained in the Basic
	 * Multilingual Plane (BMP) can be encoded.
	 * 
	 * @param string
	 *            String to be encoded
	 * @return encoded string
	 * @throws CharacterCodingException
	 */
	public static String encode_2byte(String string) throws CharacterCodingException
	{
		CharsetEncoder encoder = Charset.forName("UTF-16BE").newEncoder();
		String encodedString = "";
		char[] characterArray = string.toCharArray();
		ByteBuffer byteBuffer;
		CharBuffer charBuffer;
		char[] currentCharacter;
		int index = -1;

		encodedString += "\\X2\\";
		while (index < characterArray.length - 1)
		{
			index++;
			currentCharacter = new char[] { characterArray[index] };
			charBuffer = CharBuffer.wrap(currentCharacter);
			byteBuffer = encoder.encode(charBuffer);
			for (byte b : byteBuffer.array())
			{
				encodedString += String.format("%1$02X", b);
			}
		}
		encodedString += "\\X0\\";
		return encodedString;
	}

	/**
	 * Encodes the given string as four-octet representation (4byte) according
	 * to ISO-10303-21 $6.3.3.2 All Unicode characters can be encoded
	 * 
	 * @param string
	 *            String to be encoded
	 * @return encoded string
	 * @throws CharacterCodingException
	 */
	public static String encode_4byte(String string) throws CharacterCodingException
	{
		String encodedString = "";
		char[] characterArray = string.toCharArray();
		int index = -1;
		int codePoint;
		encodedString += "\\X4\\";

		while (index < characterArray.length - 1)
		{
			index++;
			codePoint = Character.codePointAt(characterArray, index);
			if (codePoint > 65535)
				index++;
			// 4 byte encoding
			encodedString += String.format("%1$08X", codePoint);
		}
		encodedString += "\\X0\\";

		return encodedString;
	}

	/**
	 * Encodes the given character as one byte with a value between 0 and 255
	 * according to ISO-10303-21 $6.3.3.3 All Unicode characters can be encoded
	 * 
	 * @param c
	 *            character to be encoded
	 * @return encoded string
	 */
	public static String encode_8bit(char c)
	{
		char[] _char = new char[] { c };
		int i = Character.codePointAt(_char, 0);
		if (i > 255)
			return null;
		return "\\X\\" + String.format("%1$02X", i);
	}

	public static String unwrap_primitive(String str) {
		Pattern pattern = Pattern.compile("^IFC[A-Z]+\\((.*)\\)$");
		Matcher matcher = pattern.matcher(str);
		if (matcher.find()) {
			String content = matcher.group(1);
			if (content.startsWith("'")) {
				content = content.substring(1, content.length() - 1);
				try {
					content = decode(content);
				}catch (Exception e) {

				}
			}
			return content;
		}
		return str;
	}


	public static void main(String[] args) {
		String result = unwrap_primitive("IFCLENGTHMEASURE(0.)");
		System.out.println(result);
	}


}
