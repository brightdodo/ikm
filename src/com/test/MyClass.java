package com.test;

import java.lang.reflect.Method;

public class MyClass {
    public String getMessage(String name){
        return "Hello "+name;
    }
}

class MyTest{
    public static void main(String[] args) {
        String message = "";

        Object obj  = new MyClass();
        Method method;
        try {
            method = obj.getClass().getMethod("getMessage", String.class);
            message = (String) method.invoke(obj, "World");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(message);
        var e1 = new Employee<Integer, String>(1,"One");
        System.out.println(e1);
    }
}

class Employee<T1, T2>{
    public Employee(int id, String name){}
}
