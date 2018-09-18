import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        String path = "/home/ggfl/Github/aulaANTLR/Feito/testeANTLR/src/teste.txt";
        CharStream charstream = CharStreams.fromFileName(path);
        guiLexer lexer = new guiLexer(charstream);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        guiParser parser = new guiParser(cts);

        parser.goal();
    }
}
