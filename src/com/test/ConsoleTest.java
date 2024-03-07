package com.test;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console cons = System.console();
        cons.printf("Hey");
    }
}
