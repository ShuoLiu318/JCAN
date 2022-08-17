package com.uog.can;

import com.uog.can.antlr4.out.CANBaseVisitor;
import com.uog.can.antlr4.out.CANParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Interpreter extends CANBaseVisitor<String> {

    ArrayList<String> beliefs = new ArrayList<>();
    ArrayList<String> externalEvents = new ArrayList<>();
    ArrayList<String> internalEvents = new ArrayList<>();

    Interpreter interpreter = new Interpreter();


}
