package com.test;

public class IkmTest5 {
    private int data;
    public IkmTest5(){
        this(10);
    }

    public IkmTest5(final int data) {
        this.data = data;
    }

    public void display(){
        class Decrementer {
            public void decrement(){
                data--;
            }
        }
        Decrementer d = new Decrementer();
        d.decrement();
        System.out.println("data= " +data);
    }

    public static void main(String[] args) {
        int data = 0;
        IkmTest5 test5 = new IkmTest5();
        test5.display();
        System.out.println("data= "+data);
    }

}
