package org.estafet.javaParallelArraySorting;

import java.util.Arrays;

public class ParallelArrSortExample {
    public static void main(String[] args) {
        int[] arrOfInt = {25,1,29,18,11,36,8,7,42,0,100};
        int arrLength = arrOfInt.length;

        System.out.println("\nArray before parallel sorting");
        System.out.println(Arrays.toString(arrOfInt));

        System.out.println("\nAfter Half array parallel sorting");
        Arrays.parallelSort(arrOfInt,0, arrLength/2);
        System.out.println(Arrays.toString(arrOfInt));
    }
}
