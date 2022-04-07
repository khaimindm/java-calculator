package com.company;

import com.company.exception.NotCorrectCharacterInExpressionException;
import com.company.exception.NotCorrectExpressionException;
import com.company.service.Calculations;

public class main {
    //Calculations calculations;

    /*public main(Calculations calculations) {
        this.calculations = calculations;
    }*/

    public static void main(String[] args) throws NotCorrectExpressionException, NotCorrectCharacterInExpressionException {
        Calculations calculations = new Calculations();
        calculations.run();
    }
}
