package com.test.hackerrank;

import java.util.List;

public class BalancedArray {
    public static void main(String[] args) {
        int[] array = {2,4,7,4,9,10,5,12,3};
        var array2 = List.of(1,2,3,4,6);
        System.out.println(isBalanced(array2));
    }

    public static int isBalanced(List<Integer> values) {
        int leftToRightLeftSum = 0;
        int leftToRightRightSum = 0;

        int rightToLeftRightSum = 0;
        int rightToLeftLeftSum = 0;

        for (int i = 0; i < values.size(); i++) {
            int j = values.size() - 1 - i;

            if (i < j) {
                leftToRightRightSum += values.get(j);
                rightToLeftLeftSum += values.get(i);
            } else if (i > j) {
                leftToRightRightSum -= values.get(i);
                rightToLeftLeftSum -= values.get(j);
            }

            if (leftToRightLeftSum == leftToRightRightSum || rightToLeftLeftSum == rightToLeftRightSum) {
                System.out.println(i);
                return i;
            }

            leftToRightLeftSum += values.get(i);
            rightToLeftRightSum += values.get(j);
        }

        return values.size()/2;
    }
}
