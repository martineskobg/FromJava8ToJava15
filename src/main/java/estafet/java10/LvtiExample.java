package estafet.java10;

import java.util.List;
import java.util.NoSuchElementException;

public class LvtiExample {
    public static void main(String[] args) throws Exception {
// *************** Task 1 Java 10 **************************//
        System.out.println("Task 1");
        Lvti.printIntList();

// *************** Task 2 Java 10 **************************//
        System.out.println("\nTask 2");
        // Creating a list using List.of()
        List<Integer> unmodifiableList = List.of(1, 2, 3, 10, 15);
        // New method copyOf
        List<Integer> copyOyUnmodifiableList = List.copyOf(unmodifiableList);
        System.out.println(copyOyUnmodifiableList);

        // Calling any mutator method on the Lists will always cause UnsupportedOperationException.
        try {
            unmodifiableList.add(100);
            copyOyUnmodifiableList.add(10);
        } catch (UnsupportedOperationException uoe) {
            System.err.println("Unsupported Operation Exception!");
        }

// *************** Task 3 Java 10 **************************//
        System.out.println("\nTask 3");
        System.out.print("The first number greater than 5 is: ");
        Lvti.findFirstBigger(unmodifiableList, 5);

        // Throw NoSuchElementException
        try {
            Lvti.findFirstBigger(unmodifiableList, 100);
        } catch (NoSuchElementException nse) {
            System.err.println("No Such Element Exception!");
        }
    }
}
