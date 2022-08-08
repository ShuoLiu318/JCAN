package com.uog.can;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
            run(line);
            hadError = false;
        }
    }


    private static void run(String source) {
        Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();

        // For now, just print the tokens.
        for (Token token : tokens) {
            System.out.println(token);
        }

        // Indicate an error in the exit code.
        if (hadError) System.exit(65);
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
        if (args.length > 1) {
            System.out.println("Usage: jcan [script]");
            System.exit(64);
        } else if (args.length == 1) {
            runFile(args[0]);
        } else {
            runPrompt();
        }
    }
}
