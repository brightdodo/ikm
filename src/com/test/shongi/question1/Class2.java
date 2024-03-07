package com.test.shongi.question1;

public class Class2 {
    public Class2() {
    }

    public int countWords(String str){
        String[] strArray = str.trim().split(" ");
        return strArray.length;
    }
}
