package antlr4.custom;

import antlr4.generated.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class WavelusLang {

    public static void main(String[] args) {
        ANTLRInputStream inputStream = new ANTLRInputStream(
                        "run " +
                        "print ();\n" +
                        "print (54);\n" +
                        " number liczba; \n" +
                        "print (true !! false);\n" +
                        "print ( 'asd' ); \n"  +
                        "while  a > 4  \n" +
                        "do\n" +
                        "a=5;\n" +
                        "phone=null;\n" +
                        "end "
        );
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
