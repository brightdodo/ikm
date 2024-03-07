package com.test;

public class IkmTest6 {
    private static int count;
    static {
        System.out.println("In block 1");
        count=10;
    }

    private int[] data;
    {
        System.out.println("In block 2");
        data=new int[count];
        for (int i = 0; i < count; i++) {
            data[i]=i;
        }
    }

    public static void main(String[] args) {
        System.out.println("Count = " + count);
        System.out.println("Before 1st call to new");
        IkmTest6 test1 = new IkmTest6();
        System.out.println("Before 2nd call to new");
        IkmTest6 test2 = new IkmTest6();
    }
}
