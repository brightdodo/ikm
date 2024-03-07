package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodRefCtor {
    static void populate(Supplier<List> s, String ...stuff){
        List l = s.get();
        for (int i = 0; i < stuff.length; i++) {
            l.add(stuff[i]);
        }
        System.out.println(l);
    } // works

/*    static void populate(Supplier s, String... stuff) {
        List l = s.get();
        for (int i = 0; i < stuff.length; i++) {
            l.add(stuff[i]);
        }
        System.out.println(l);
    }*/ // doesnt work

//    static void populate(Consumer<String> c, String... stuff) {
////        List l = s.get();
//        for (int i = 0; i < stuff.length; i++) {
//            c.accept(stuff[i]);
//        }
//        System.out.println(c);
//    }

    public static void main(String[] args) {
        MethodRefCtor methodRefCtor = new MethodRefCtor();
        populate(ArrayList::new, "Red", "Green", "Blue");
    }
}
