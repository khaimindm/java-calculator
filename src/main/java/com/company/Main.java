package com.company;

import com.company.exception.NotCorrectCharacterInExpressionException;
import com.company.exception.NotCorrectExpressionException;
import com.company.exception.NotCorrectOperationException;
import com.company.service.Calculations;

public class Main {
    public static void main(String[] args) throws NotCorrectExpressionException, NotCorrectCharacterInExpressionException, NotCorrectOperationException {
        Calculations calculations = new Calculations();
        calculations.run();
    }
}
