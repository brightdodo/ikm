package com.test.shongi.question2;

public class PentagonalNumbers {
    public static void main(String[] args) {
        // formula is n(3n-1)/2
        for (int i = 0; i <4; i++){
            for(int j = 1; j<=10; j++){
                int n = i * 10 + j;
                int pentagonalNum = n*(3*n - 1) /2;
                System.out.print(pentagonalNum + " ");
            }
            System.out.println();
        }
    }
}
