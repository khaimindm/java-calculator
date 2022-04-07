package com.company.service;

import com.company.exception.NotCorrectCharacterInExpressionException;
import com.company.exception.NotCorrectExpressionException;
import com.company.service.Parsing;
import com.company.service.ValidationCheck;
import com.company.service.WorkingWithTheConsole;

import java.util.LinkedList;

public class Calculations {
	/*private WorkingWithTheConsole workingWithTheConsole;
	private ValidationCheck validationCheck;*/
	
	/*public Calculations(WorkingWithTheConsole workingWithTheConsole, ValidationCheck validationCheck) {
        this.workingWithTheConsole = workingWithTheConsole;
	this.validationCheck = validationCheck;
	}*/

    public void run() throws NotCorrectCharacterInExpressionException, NotCorrectExpressionException {
		WorkingWithTheConsole workingWithTheConsole = new WorkingWithTheConsole();
		ValidationCheck validationCheck = new ValidationCheck();
		String expression = workingWithTheConsole.getExpression();
		LinkedList<Double> numbers = new LinkedList<Double>();
		String expressionRPN = null;
		if (validationCheck.checkValidity(expression) && validationCheck.checkCorrectness(expression)) {
			expressionRPN = Parsing.parseExpression(expression);
			for (int i = 0; i < expressionRPN.length(); i++) {
				char c = expressionRPN.charAt(i);
				if (isOperator(c)) {
					calculate(numbers, c);
				} else {
					String operand = "";
					while (i < expressionRPN.length() && Character.isDigit(expressionRPN.charAt(i)) || expressionRPN.charAt(i) == '.') {
						operand += expressionRPN.charAt(i++);
					}
					--i;
					numbers.add(Double.parseDouble(operand));
				}
			}
			workingWithTheConsole.print(numbers.get(0));
		}
	}
	
	static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
	}
	
	static void calculate(LinkedList<Double> numbers, char currentCharacter) { 
    double r = numbers.removeLast();
    double l = numbers.removeLast(); 
    switch (currentCharacter) {
    case '+':
      numbers.add(l + r);
      break;
    case '-':
      numbers.add(l - r);
      break;
    case '*':
      numbers.add(l * r);
      break;
    case '/':
      numbers.add(l / r);
      break;
    //case '%':
      //numbers.add(l % r);
      //break;
    }
  }
}
