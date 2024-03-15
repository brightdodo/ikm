package com.test;

public class MyException extends Exception{
    public String getReason() throws Exception{
        throw new Exception();
    }
}
