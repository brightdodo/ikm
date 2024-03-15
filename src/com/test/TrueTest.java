package com.test;

public class TrueTest {

    public static void main(String[] args) {
        Double d = null;
        System.out.println((d instanceof Double)?"true":"false");

        String e ="1";
        System.out.println(("1"!=e)?"true":"false");
        int c = 0;
        System.out.println((0==c++)?"true":"false");
        System.out.println(4/0);
    }
}
