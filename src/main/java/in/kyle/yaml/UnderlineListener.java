package in.kyle.yaml;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class UnderlineListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        System.out.println("Line " + line + ":" + charPositionInLine + " " + msg);
        underlineError(recognizer, (Token) offendingSymbol, line, charPositionInLine);
    }
    
    protected void underlineError(Recognizer recognizer,
                                  Token offendingToken,
                                  int line,
                                  int charPosition) {
        CommonTokenStream cts = (CommonTokenStream) recognizer.getInputStream();
        String input = cts.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.out.println(errorLine);
        for (int i = 0; i < charPosition; i++) {
            System.out.print(" ");
        }
        boolean ran = false;
        for (int i = offendingToken.getStartIndex(); i < offendingToken.getStopIndex(); i++) {
            System.out.print("^"); 
            ran = true;
        }
        if (!ran) {
            System.out.print("^");
        }
        System.out.println();
    }
}
