package com.test;

public class IkmTest4 {
    public static void main(String[] args) {
        int a=9, b=2;
        float f;
        f=a/b;
        System.out.println("f= "+f);
        f=f/2;
        System.out.println("f= "+f);
        f =a+b/f;
        System.out.println("f= "+f);

        double x1= 0.3;
        double x2 = 0.1 + 0.1 +0.1;
        System.out.println(x1 == x2);
        System.out.println(x2);

        double y1 = 0.5;
        double y2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(y1 == y2);
        System.out.println(y2);
    }
}
