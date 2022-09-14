package org.estafet.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// Local Variable Type Interface (LVTI)
public class Lvti {

    public static void findFirstBigger(List<Integer> intList, int number) throws Exception {

        System.out.println(intList.stream()
                .filter(n -> n > number)
                .findFirst()
                .orElseThrow(NoSuchElementException::new));
    }

    public static void printIntList() {

        int[] myArr = new int[]{1, 2, 3, 4, 5};
        // Using var to init List<int>
        var myList = new ArrayList<>();

        // Using var to init variable
        for (var i : myArr) {
            myList.add(i);
        }

        // Using var to init variable
        for (var y : myList) {
            System.out.println(y);
        }
    }


}
