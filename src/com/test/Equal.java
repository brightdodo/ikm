package com.test;

import java.text.ChoiceFormat;

public class Equal {
    public static void main(String[] args) {
        Long l = new Long(1234);
        Long ll = l;
        if (l==ll)
            System.out.println("zvakaenzana");
        l++;
        if (l==ll)
            System.out.println("zvakaenzana");
        else
            System.out.println("hazvina");
    }
}
