package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Question44 {
    public static void main(String[] args) {
        List list = new ArrayList<>(Arrays.asList(1,2,3));
        for (int i = 1; i < 3; i++) {
            list.add(1);
            Spliterator split = list.spliterator();
            split.forEachRemaining(z -> System.out.print(z + " "));
        }
    }
}
