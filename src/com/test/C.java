package com.test;

import java.util.stream.Stream;

public class C {
    public void m1() {
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        Stream<C> s = Stream.of(new C(), new C());
        s.forEach(x -> {
            try {
                x.m1();
            }catch (Exception e) {
                System.out.println("Exception");
            }
        }
        );
    }
}
