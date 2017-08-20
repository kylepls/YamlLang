package in.kyle.yaml;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.IOException;

import in.kyle.yaml.antlr.YAMLLexer;
import in.kyle.yaml.antlr.YAMLParser;
import in.kyle.yaml.api.ApiUtils;
import in.kyle.yaml.api.SystemApi;
import in.kyle.yaml.internal.Function;
import in.kyle.yaml.internal.Scope;

public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream ais = new ANTLRInputStream(new FileInputStream("test.yml"));
        YAMLLexer lexer = new YAMLLexer(ais);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        YAMLParser parser = new YAMLParser(cts);
        parser.removeErrorListeners();
        parser.addErrorListener(new UnderlineListener());
        YAMLParser.FileContext file = parser.file();
        Constructor constructor = new Constructor();
        Function function = constructor.visitFile(file);
    
        Scope root = new Scope(null);
        ApiUtils.registerMethods(SystemApi.class, root);
    
        function.evaluate(root);
    }
}
