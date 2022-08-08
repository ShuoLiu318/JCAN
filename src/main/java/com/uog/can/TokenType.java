package com.uog.can;

public enum TokenType {
    // Single-character tokens
    COLON, SEMICOLON, COMMA, NEGATION, SLASH,
    AND, OR, GREATER, LEFT_BRACE, RIGHT_BRACE,
    LESS, LEFT_PAREN, RIGHT_PAREN,

    // Double-character tokens
    LEFT_ARROW, PARALLEL,

    // Atoms
    ATOM,

    // Keywords
    TRUE, FALSE, NIL, GOAL, INIT_BELIEF,
    EXTERNAL_EVENT, PLAN, ACTION,

    EOF
}
