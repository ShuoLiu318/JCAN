package com.uog.can;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.uog.can.antlr4.out.CANLexer;
import com.uog.can.antlr4.out.CANParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.*;

public class Can {
    // ensure we don’t try to execute code that has a known error
    static boolean hadError = false;

     /** start the jlox from the command line
     * give it a path to a file
     * read the file and executes it
     * */

    private static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        run(new String(bytes, Charset.defaultCharset()));
    }

     /** enter and execute the code one line at a time
     * read a line of input from the user on the command line
     * return the result
     * when readLine() returns null
     * check for that to exit the loop
     * */

    private static void runPrompt() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        for (;;) {
            System.out.print("> ");
            String line = reader.readLine();
            if (line == null) break;
            run(line + '\n');
            hadError = false;
        }
    }


    private static void run(String source) {


        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream input = new ANTLRInputStream(source);
        // 用 in 构造词法分析器 lexer，词法分析的作用是将字符聚集成单词或者符号
        CANLexer lexer = new CANLexer(input);
        // 用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        CANParser parser = new CANParser(tokens);
        // 最终调用语法分析器的规则c_text（这个是我们在CAN.g4里面定义的那个规则），完成对表达式的验证
        ParseTree tree = parser.c_text();

        ParseTreeWalker walker = new ParseTreeWalker();		//创建分析树的遍历器
        walker.walk(new Interpreter(), tree);

        // System.out.println(tree.toStringTree(parser));



        /*Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();*/

        /*// For now, just print the tokens.
        for (Token token : tokens) {
            System.out.println(token);
        }

        // Indicate an error in the exit code.
        if (hadError) System.exit(65);*/
    }


     /** tell the user some syntax error occurred on a given line
     */

    static void error(int line, String message) {
        report(line, "", message);
    }

     /** show the user the offending line
     */

    private static void report(int line, String where, String message) {
        System.err.println(
                "[line " + line + "] Error" + where + ": " + message);
        hadError = true;
    }


    public static void main(String[] args) throws IOException {
       /* if (args.length > 1) {
            System.out.println("Usage: jcan [script]");
            System.exit(64);
        } else if (args.length == 1) {
            runFile(args[0]);
        } else {
            runPrompt();
        }*/

        runFile( "src/main/java/com/uog/can/test/demo");
    }
}
