package com.test;

public class TestType {
    public static void main(String[] args) {
        Object x = 1.0;
        Boolean b  = false;
        Double d = 0.0;

        if(x instanceof Boolean) {
            b = (Boolean) x;
            System.out.println("Instance is Boolean");
        }else {
            d = (Double) x;
            System.out.println("Instance is Double");
        }

        boolean condition1 = (d==2) ? true : false;
        if(condition1)
            System.out.println("Perform action1");
        double e = 1.0;
        if ((Double) e instanceof Double | d++ == e++)
            d += d;
        boolean condition2 = (d>2) ? true : false;
        if(!condition2)
            System.out.println("Perform action2");
        boolean condition3 = condition1 ^ condition2;
        if (condition3)
            System.out.println("Perform action3");
    }
}
