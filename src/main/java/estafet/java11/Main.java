package org.estafet.java11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // *************** Task 4 Java 10 **************************//
        var intArray = new Integer[]{11, 44, 3, 4, 59, 16, 87, 81, 2, 100};
        long count = Arrays.stream(intArray).filter(( var i) -> i > 99).count();
        System.out.println(count);

    }
}
