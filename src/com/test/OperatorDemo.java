package com.test;

public class OperatorDemo {
    public static void main(String[] args) {
        int x =3;
        boolean b1 = true;
        boolean b2 = false;
        if((b1 | b2) || (x++>4))
            System.out.println("x1: "+x++);
        if((!b1 & b2) && (++x<4))
            System.out.println(" x2: "+x);
    }
}
