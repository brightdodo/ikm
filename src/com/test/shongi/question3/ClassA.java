package com.test.shongi.question3;

public class ClassA {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        double investmentAmount = args.length > 0 ? Double.parseDouble(args[0]) : 28000;
        double interestRate = args.length > 1 ? Double.parseDouble(args[1]) : 7;
        int years = args.length > 2 ? Integer.parseInt(args[2]) : 6;
        classB.futureInvestmentValue(investmentAmount, interestRate, years);
    }
}
