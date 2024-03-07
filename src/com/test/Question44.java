package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Question44 {
    public static void main(String[] args) {
        var list = new ArrayList<>(Arrays.asList(1,2,3));
        for (int i = 1; i < 3; i++) {
            list.add(1);
            var split = list.spliterator();
            split.forEachRemaining(z -> System.out.print(z + " "));
        }
    }
}
