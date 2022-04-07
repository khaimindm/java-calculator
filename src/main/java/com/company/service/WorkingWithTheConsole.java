package com.company.service;

import java.util.Scanner;

public class WorkingWithTheConsole {
    public String getExpression() {
        Scanner in = new Scanner(System.in);
        String inputExpression = in.nextLine();
        return inputExpression;
    }
    
    public void print(Double number) {
        int intTypeNumber;
        if (number % 1 == 0) {
            intTypeNumber = (int)number;
            System.out.println(intTypeNumber);
        } else {
            System.out.println(number);
        }        
    }
}
