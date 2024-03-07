package com.test;

import java.util.Optional;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String a  = null;
        Optional<String> b = Optional.empty();
        try {
            System.out.println("A: " + a.length());
            System.out.println("B: " + b.orElse(" ").length());
        }catch (Exception e) {
            System.out.println("Exception: " + a);
        }finally {
            a= "String";
            System.out.println(a.length());
            b = Optional.ofNullable("");
            System.out.println(b.get().length());
        }
    }
}
