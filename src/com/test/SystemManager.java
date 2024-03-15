package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SystemManager {
    private static String initString;
    static {
        String currentString = null;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("initconfig.txt"));
            initString = reader.lines().findFirst().orElse(null);
        } catch (IOException e) {
            System.out.println("Paita error");
            e.printStackTrace();
        }
    }

    public SystemManager() {
        if(initString.length() == 0){
            throw new IllegalArgumentException("length is 0");
        }
        System.out.println("it works");
    }

    public static void main(String[] args) {
        SystemManager myClass = new SystemManager();
    }
}
