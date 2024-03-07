package com.test.streamss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);

        // {1,2}

        // station 1 - pour 500ml of water
        // station 2 - put a bottle cap
        // station 3 - put a label
        // station 4 - print batch and expiry date
        // station 5 - pack

        Integer[] arrInt = new Integer[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        Stream<Integer> myStream = Stream.of(arrInt);
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Stream.of(integerList);

        Stream<Integer> integerStream = integerList.stream();

//        Stream.Builder<Integer> builder = Stream.Builder();
//        builder.accept(1);
//        builder.accept(2);
//        builder.accept(3);
//
//        Stream build = builder.build();

        //Operations

        //forEach - Iterable
        integerStream.forEach(integer -> {
            System.out.println();
            System.out.print(integer*2);
            System.out.print(" "+integer*3);
            System.out.print(" " +integer*4);
        });

        //map
        //collect
        //filter
        //findFirst
    }
}
