package estafet.java10;

import java.util.List;

public class LvtiExample {
    public static void main(String[] args) throws Exception {
// *************** Task 1 Java 10 **************************//
        Lvti.printIntList();

// *************** Task 2 Java 10 **************************//
        // Creating a list using List.of()
        List<Integer> unmodifiableList = List.of(1, 2, 3, 10, 15);
        List<Integer> copyOyUnmodifiableList = List.copyOf(unmodifiableList);

        // Calling any mutator method on the Lists will always cause UnsupportedOperationException to be thrown.
//        unmodifiableList.add(100);
//        copyOyUnmodifiableList.add(10);

// *************** Task 3 Java 10 **************************//
        System.out.print("\nFirst bigger number than 5 is: ");
        Lvti.findFirstBigger(unmodifiableList, 5);

        // Throw NoSuchElementException
//        Lvti.findFirstBigger(unmodifiableList, 100);
    }
}
