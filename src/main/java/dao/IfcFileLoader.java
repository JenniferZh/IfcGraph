package dao;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.STEPGrammarBaseVisitor;
import parser.STEPGrammarLexer;
import parser.STEPGrammarParser;
import util.*;


import java.io.*;
import java.util.*;

public class IfcFileLoader extends STEPGrammarBaseVisitor<Void> {
    private Element curElement = null;
    private List<Element> elementList = new ArrayList<>();
    private String modelName;
    private IfcVersion schemaType;
    private List<Entity> entityList;
    private Map<String, Entity> entityMap = new HashMap<String, Entity>();
    private Set<String> exclude;

    public int cnt = 0;

    public IfcFileLoader() throws IOException{

        exclude = ConfigReader.readExcluded();

    }

    public static IfcFile loadIFC(String filePath) throws IOException{

        String header = getStepHeader(filePath);

        CharStream input = CharStreams.fromString(header);
        STEPGrammarLexer lexer = new STEPGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        STEPGrammarParser parser = new STEPGrammarParser(tokens);
        ParseTree tree = parser.header();

        IfcFileLoader loader = new IfcFileLoader();
        loader.visit(tree);
        parseDataLine(filePath, loader);
        IfcFile file = new IfcFile(loader.modelName, loader.schemaType, loader.elementList, loader.entityMap);

        return file;
    }

    public static void parseDataLine(String filePath, IfcFileLoader loader) throws IOException {
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null)
        {
            line = line.trim();
            if(line.startsWith("#")) {
                CharStream input = CharStreams.fromString(line);
                STEPGrammarLexer lexer = new STEPGrammarLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                STEPGrammarParser parser = new STEPGrammarParser(tokens);
                ParseTree tree = parser.dataLine();
                loader.visit(tree);
            }
        }
    }

    public static String getStepHeader(String filePath) throws IOException {

        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String header = "";
        while ((line = reader.readLine()) != null)
        {
            line = line.trim();
            if (line.endsWith("ENDSEC;"))
                break;
            header += line;
        }
        int startIndex = header.indexOf("HEADER;");
        header = header.substring(startIndex);
        header = header + "ENDSEC;";
        return header;
    }



    @Override
    public Void visitFilename(STEPGrammarParser.FilenameContext ctx) {
        modelName = ctx.STRING().getText();
        return null;
    }

    @Override
    public Void visitFileschema(STEPGrammarParser.FileschemaContext ctx) {
        String schemaName = ctx.STRING().getText().toUpperCase();
        if (schemaName.equals("\'IFC2X3\'")) {
            entityList = SchemaFileLoader.getEntityList("src\\main\\resources\\IFC2X3.exp");
            schemaType = IfcVersion.IFC2X3;
        }
        if (schemaName.equals("\'IFC4\'")) {
            entityList = SchemaFileLoader.getEntityList("src\\main\\resources\\ifc4.exp");
            schemaType = IfcVersion.IFC4;
        }
        if (schemaName.equals("\'IFC4X1\'")) {
            entityList = SchemaFileLoader.getEntityList("src\\main\\resources\\IFC4X1.exp");
            schemaType = IfcVersion.IFC4X1;
        }
        for (Entity entity: entityList) {
            entityMap.put(entity.getName().toUpperCase(), entity);
        }
        return null;
    }

    @Override
    public Void visitDataLine(STEPGrammarParser.DataLineContext ctx) {

        int lineId = Integer.parseInt(ctx.INT().getText());
        String type = ctx.typedListArgument().NAME().getText();

        if (exclude.contains(type)) return null;

        cnt++;
        curElement = new Element(type, lineId);

        int childCnt = ctx.typedListArgument().argumentList().getChildCount();
        for (int i = 0; i < childCnt; i++) {
            String attr = ctx.typedListArgument().argumentList().getChild(i).getText();
            if (!attr.equals(",")) {
                //unwrap IFCTEXT, IFCREAL等基本类型
                if (attr.startsWith("IFC")) {
                    attr = StringConverter.unwrap_primitive(attr);
                } else if (attr.startsWith("'")) {
                    try {
                        attr = attr.substring(1, attr.length() - 1);
                        attr = StringConverter.decode(attr);
                    } catch (Exception e) {

                    }
                }
                curElement.addAttribute(attr);
            }
        }

        Entity entity = entityMap.get(type);
        if (!curElement.isValid(entity)) {
            System.out.println("lineID:"+curElement.getLineID()+" type:"+curElement.getIfcType());
            System.out.println("elementAttrCount:"+curElement.getAttrs().size()+" entityAttrCount:"+entity.getAttributes().size());
        } else {
            elementList.add(curElement);
        }
        return null;
    }



    public static void main(String[] args) throws IOException {
        IfcFile file = loadIFC("E:\\1labdata\\IFC文件\\us.ifc");
        System.out.println();

    }

}
