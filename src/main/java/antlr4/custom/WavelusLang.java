package antlr4.custom;

import antlr4.generated.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;

public class WavelusLang {

    public static void main(String[] args) throws IOException {
        String pathToFile;
        ANTLRInputStream inputStream;
        if (args.length>0){
            pathToFile = args[0];
//            File file = new File(pathToFile);
            inputStream = new ANTLRFileStream(pathToFile);
        }else{
            inputStream = new ANTLRInputStream(

                    "run\n" +
                            "number a;\n" +
                            "a = 12;\n" +
                            "while a > 4\n" +
                            "do\n" +
                            "a=1;\n" +
                            "end"
            );
        }
        WavelusLexer wavelusLexer = new WavelusLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(wavelusLexer);
        WavelusParser wavelusParser = new WavelusParser(commonTokenStream);

        ParseTree tree = wavelusParser.program();
        ParseTreeWalker walker = new ParseTreeWalker();

        WavelusParserListenerImpl listener = new WavelusParserListenerImpl();
//        WavelusParserBaseListener listener = new WavelusParserBaseListener();

        walker.walk(listener, tree);

        System.out.println(listener.finalCode);
    }
}
