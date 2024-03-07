package com.test.shongi.question1;

public class Class1 {
    public static void main(String[] args) {
        String sentence = "my placeholder sentence";
        if (args.length > 0) {
            sentence = args[0];
        }
        Class2 class2 = new Class2();
        int numOfWords = class2.countWords(sentence);
        System.out.println("The provided string has " + numOfWords + " words");
    }
}
