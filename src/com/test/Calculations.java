package com.test;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score");
        float iMark = scanner.nextInt();

        System.out.println("Enter total");
        float iTotal = scanner.nextInt();

        var avg = iMark/iTotal;
        System.out.println(avg);

        double percent = avg * 100;
        System.out.println("You obtained "+ percent);
    }
}
