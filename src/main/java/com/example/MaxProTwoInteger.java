package com.example;

import java.util.Arrays;

public class MaxProTwoInteger {

    private void findMaxProductOfTwoInteger(int[] arr) {
        int[] array = Arrays.stream(arr).sorted().toArray();
        int max = array[array.length-1];
        int min = array[array.length-2];
        System.out.println(max * min);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 8, 7};
        MaxProTwoInteger m = new MaxProTwoInteger();
        m.findMaxProductOfTwoInteger(arr);
        }
}
