package com.company.service;

import com.company.exception.NotCorrectCharacterInExpressionException;
import com.company.exception.NotCorrectExpressionException;
import com.company.exception.NotCorrectOperationException;

public class Calculations {

    public void run() throws NotCorrectCharacterInExpressionException, NotCorrectExpressionException, NotCorrectOperationException {
		WorkingWithTheConsole workingWithTheConsole = new WorkingWithTheConsole();
		ValidationCheck validationCheck = new ValidationCheck();
		String expression = workingWithTheConsole.getExpression();
		if (validationCheck.checkValidity(expression) && validationCheck.checkCorrectness(expression)) {
			workingWithTheConsole.print(Parsing.parseExpression(expression));
		}
	}
}
