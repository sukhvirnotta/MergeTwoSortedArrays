package com.sparta.sn;

public class ArrayMerger {
    public int[] mergeArrays(int[] sortedArray1, int[] sortedArray2) {
        int[] mergedArray = new int[sortedArray1.length + sortedArray2.length];
        int i = 0, j = 0, k = 0;

        while (i < sortedArray1.length && j < sortedArray2.length) {
            if (sortedArray1[i] < sortedArray2[j]) {
                mergedArray[k] = sortedArray1[i];
                i++;
            } else {
                mergedArray[k] = sortedArray2[j];
                j++;
            }
            k++;
        }

        while (i < sortedArray1.length) {
            mergedArray[k] = sortedArray1[i];
            k++;
            i++;
        }

        while (j < sortedArray2.length) {
            mergedArray[k] = sortedArray2[j];
            k++;
            j++;
        }
        return mergedArray;
    }
}
