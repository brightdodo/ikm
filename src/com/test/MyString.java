package com.test;

import java.util.Arrays;
import java.util.List;

interface SelectString { boolean select(MyString s);}
public class MyString {
    String string;

    @Override
    public String toString() {
        return string;
    }

    MyString(String s){
        string = s;
    }
}

class MyStringList {
    static List<MyString> list = Arrays.asList(new MyString("CAR"), new MyString("TRUCK"));
    public static void printSelectedString(SelectString selectString){
        for (MyString s: list){
            if (selectString.select(s)){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        /*printSelectedString(
            @Override public boolean select(MyString s) {return s.string.length() < 4;}
        );*/

        printSelectedString(new SelectString() {
            @Override
            public boolean select(final MyString s) {
                return false;
            }
        });
    }
}