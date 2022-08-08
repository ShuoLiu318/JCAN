package com.uog.antlr4.test;

import out.CANLexer;
import out.CANParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void run(String expr) throws Exception{
        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream input = new ANTLRInputStream(expr);
        // 用 in 构造词法分析器 lexer，词法分析的作用是将字符聚集成单词或者符号
        CANLexer lexer = new CANLexer(input);
        // 用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        CANParser parser = new CANParser(tokens);
        // 最终调用语法分析器的规则 r（这个是我们在Hello.g4里面定义的那个规则），完成对表达式的验证
        parser.expr();
    }

    public static void main(String[] args) throws Exception{
        String[] testStr={
                "InitBeliefs{a,!b};",
                "Event{e1,e2};",
                "Plan p:c&d<-goal(e,p1,x);ee;",
                "Action a : true <- <{nil},{uu}>;"
        };
        for(String s : testStr){
            System.out.println("Input: " + s);
            run(s);
        }
    }
}
