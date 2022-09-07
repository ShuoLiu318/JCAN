package com.uog.can;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.uog.can.TokenType.*;

class Scanner {
    private final String source;
    private final List<Token> tokens = new ArrayList<>();
    private int start = 0;
    private int current = 0;
    private int line = 1;

    private static final Map<String, TokenType> keywords;
    static {
        keywords = new HashMap<>();
        keywords.put("true", TRUE);
        keywords.put("false", FALSE);
        keywords.put("nil", NIL);
        keywords.put("goal", GOAL);
        keywords.put("InitBeliefs", INIT_BELIEF);
        keywords.put("Event", EXTERNAL_EVENT);
        keywords.put("Plan", PLAN);
        keywords.put("Action", ACTION);
    }
    Scanner(String source) {
        this.source = source;
    }
    List<Token> scanTokens() {
        while (!isAtEnd()) {
            // We are at the beginning of the next lexeme.
            start = current;
            scanToken();
        }

        tokens.add(new Token(EOF, "", line));
        return tokens;
    }
    private void scanToken() {
        char c = advance();
        switch (c) {
            case '(': addToken(LEFT_PAREN); break;
            case ')': addToken(RIGHT_PAREN); break;
            case '{': addToken(LEFT_BRACE); break;
            case '}': addToken(RIGHT_BRACE); break;
            case ',': addToken(COMMA); break;
            case ';': addToken(SEMICOLON); break;
            case '!': addToken(NEGATION); break;
            case '&': addToken(AND); break;
            case '>': addToken(GREATER); break;

            case '<':
                addToken(match('-') ? LEFT_ARROW : LESS);
                break;
            case '|':
                addToken(match('|') ? PARALLEL : OR );
                break;

            // when we find a second '/'
            // we don't end the token yet.
            // keep consuming characters until we reach the end of the line
            case '/':
                if (match('/')) {
                    // A comment goes until the end of the line.
                    while (peek() != '\n' && !isAtEnd()) advance();
                } else {
                    addToken(SLASH);
                }
                break;

            case ' ':
            case '\r':
            case '\t':
                // Ignore whitespace.
                break;

            case '\n':
                line++;
                break;

            //for those unexpected characters
            default:
                if (isAlpha(c)) {
                    atom();
                } else {
                    Can.error(line, "Unexpected character.");
                }
                break;
        }
    }
    private void atom() {
        while (isAlphaNumeric(peek())) advance();

        String text = source.substring(start, current);
        TokenType type = keywords.get(text);
        if (type == null) {
            type = ATOM;
            addToken(type, text);
        }else {
            addToken(type);
        }

    }
    private boolean match(char expected) {
        if (isAtEnd()) return false;
        if (source.charAt(current) != expected) return false;

        current++;
        return true;
    }
    /*
     * lookahead
     * it doesn't consume the character
     * */
    private char peek() {
        if (isAtEnd()) return '\0';
        return source.charAt(current);
    }
    /*
     * 判断是否是字母
     * 如果是就返回字母值
     * 如果不是就返回 _
     * */
    private boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                c == '_';
    }
    private boolean isAlphaNumeric(char c) {
        return isAlpha(c) || isDigit(c);
    }
    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
    /*
     * if we’ve consumed all the characters.
     * */
    private boolean isAtEnd() {
        return current >= source.length();
    }
    /*
     * consume the next character in the source file
     * return the next character
     *
     * for input
     * */
    private char advance() {
        return source.charAt(current++);
    }

    /*
     * for output
     *
     * grab the text of the current lexeme
     * create a new token for it
     * */
    private void addToken(TokenType type) {
        addToken(type, null);
    }
    private void addToken(TokenType type, String atom) {
        tokens.add(new Token(type, atom, line));
    }
}
