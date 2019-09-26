package com.sparta.sn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {10, 15, 22, 80};
        int[] arr2 = {5, 8, 11, 15, 70, 90};
        int[] mergedArr = new ArrayMerger().mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArr));
    }
}
