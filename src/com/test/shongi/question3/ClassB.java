package com.test.shongi.question3;

public class ClassB {
    public void futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        System.out.println("Years   Future Value");
        for(int i= 1; i <=years; i++){
            double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate / 100), i);
            System.out.printf(i + "     %.2f %n", futureValue);
        }
    }
}
