package com.company.service;

import java.util.LinkedList;

public class Parsing {
    static boolean isWhitespace(char c) {
        return c == ' ';
    }

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static int priority(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public static String parseExpression(String expression) {
        LinkedList<Double> numbers = new LinkedList<Double>();
        LinkedList<Character> operator = new LinkedList<Character>();
        String expressionRPN = "";

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (isWhitespace(c)) {
                continue;
            }

            if (isOperator(c)) {
                while (!operator.isEmpty() && priority(operator.getLast()) >= priority(c)) {
                expressionRPN += operator.removeLast();
                }
                operator.add(c);
            } else {
                while (i < expression.length() && Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.') {
                expressionRPN += expression.charAt(i);
                }
            }            
        }
        return expressionRPN;
    }
}
