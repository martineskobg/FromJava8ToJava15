package estafet.java9.stream.api_2_4;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> supplierNames = Arrays.asList("sup1", "sup2", "", "sup4", "sup5", "sup6", "", "sup8", "sup9");
        StreamApi sa = new StreamApi();

        //1. Print the stream before a given part of the stream
        System.out.println("Task 1:");
        sa.useTakeWhile(supplierNames);
        System.out.println("*********\n");

        //2. Print the stream after a given part of the stream
        System.out.println("Task 2:");
        sa.useDropWhile(supplierNames, "sup5");
        System.out.println("*********\n");

        // 3. Print the numbers between 20 and 27
        System.out.println("Task 3:");
        List<Integer> myList = sa.createListOfInt(20, 27);
        System.out.println(myList);
        System.out.println("*********\n");
    }
}
