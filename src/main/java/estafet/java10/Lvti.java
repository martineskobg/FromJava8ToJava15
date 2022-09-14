package estafet.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// Local Variable Type Inference or LVTI in Java 10
public class Lvti {

    /**
     * Finds the first number greater than the given number
     * @param intList Int
     * @param number int
     * @throws Exception
     */
    public static void findFirstBigger(List<Integer> intList, int number) throws Exception {

        System.out.println(intList.stream()
                .filter(n -> n > number)
                .findFirst()
                .orElseThrow(NoSuchElementException::new));
    }

    /**
     * Prints List of int
     * I use the key word var to skip the type declaration associated with local variables
     */
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
