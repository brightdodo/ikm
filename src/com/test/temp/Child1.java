package com.test.temp;
class Parent1 {
    protected static int count = 0;

    public Parent1() {
        count++;
    }

    static int getCount() {
        return count;
    }
}
public class Child1 extends Parent1{
    public Child1() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Count = "+ getCount());
        Child1 obj = new Child1();
        System.out.println("Count = "+ getCount());
    }

    public void printMyName() {
        //something
    }
}
