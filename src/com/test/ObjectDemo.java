package com.test;

import java.util.Optional;

public class ObjectDemo {
    @Override
    public String toString() {
        return "ObjectDemo";
    }

    public static void main(String[] args) {
        Optional<Object> o = Optional.of(new ObjectDemo());
        System.out.println(o.get().toString());
    }
}
