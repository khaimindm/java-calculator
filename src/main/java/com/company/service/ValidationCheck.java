package com.company.service;

import com.company.exception.NotCorrectExpressionException;

public class ValidationCheck {
    private WorkingWithTheConsole workingWithTheConsole;

    public ValidationCheck(WorkingWithTheConsole workingWithTheConsole) {
        this.workingWithTheConsole = workingWithTheConsole;
    }

    public String checkValidity() throws NotCorrectExpressionException {
        String expression = workingWithTheConsole.getExpression();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c) || c == ' ' || c == '+' || c == '-' || c == '*' || c == '/' || c == '.') {
                throw new NotCorrectExpressionException("В введенном выражении используются недопустимые символы." +
                        "Допустимые символы: '0-9', '+', '-', '*', '/', '.'. Введите корректное выражение.");
            }
        }
        return expression;
    }
}
