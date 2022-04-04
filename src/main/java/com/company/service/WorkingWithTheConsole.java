package com.company.service;

import java.util.Scanner;

public class WorkingWithTheConsole {
    public String getExpression() {
        Scanner in = new Scanner(System.in);
        String inputExpression = in.nextLine();
        return inputExpression;
    }
}
