package com.test.temp;

public class Runn {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("HI");
        new Thread(r).start();
    }
}
