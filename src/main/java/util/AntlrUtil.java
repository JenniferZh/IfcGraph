package util;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.STEPGrammarLexer;
import parser.STEPGrammarParser;

public class AntlrUtil {
    public static STEPGrammarParser getSTEPGrammarParser(String text) {
        CharStream input = CharStreams.fromString(text);
        STEPGrammarLexer lexer = new STEPGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        STEPGrammarParser parser = new STEPGrammarParser(tokens);
        return parser;
    }

}
