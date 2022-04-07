package com.company.service;

import com.company.exception.NotCorrectCharacterInExpressionException;
import com.company.exception.NotCorrectExpressionException;

public class ValidationCheck {
    //private WorkingWithTheConsole workingWithTheConsole;

    //public ValidationCheck(WorkingWithTheConsole workingWithTheConsole) {
        //this.workingWithTheConsole = workingWithTheConsole;
    //}

    public boolean checkValidity(String expression) throws NotCorrectCharacterInExpressionException {
        //String expression = workingWithTheConsole.getExpression();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c) || c == ' ' || c == '+' || c == '-' || c == '*' || c == '/' || c == '.') {
                throw new NotCorrectCharacterInExpressionException("В введенном выражении используются недопустимые символы." +
                        "Допустимые символы: '0-9', '+', '-', '*', '/', '.'. Введите корректное выражение.");
            }
        }
        return true;
    }

    public boolean checkCorrectness(String expression) throws NotCorrectExpressionException {
        if (Parsing.isOperator(expression.charAt(0)) || Parsing.isOperator(expression.charAt(
                expression.length() - 1))) {
            throw new NotCorrectExpressionException("Введено некорректное выражение. В выражении не должно быть" +
                    " дублирующихся символов операций. В выражении нельзя использовать отрицательные числа.");
        }

        for (int i = 0; i < expression.length() - 1; i++) {
            if (Parsing.isOperator(expression.charAt(i)) && Parsing.isOperator(expression.charAt(i + 1))) {
                throw new NotCorrectExpressionException("Введено некорректное выражение. В выражении не должно быть" +
                        " дублирующихся символов операций. В выражении нельзя использовать отрицательные числа.");
            }
        }

        return true;
    }
}
