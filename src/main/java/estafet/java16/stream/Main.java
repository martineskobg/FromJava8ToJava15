package estafet.java16.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Java 16 Task 2
        Stream<Integer> myStream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> myStream2 = Stream.of(10, 20, 30, 40, 50, 60);

        // Before java 16
        var myList = myStream.collect(Collectors.toList());
        myList.add(10);
        System.out.println("myList values: " + myList);

        // After java 16
        // The toList() returns immutable list
        var mySecondList = myStream2.toList();
      try {
          mySecondList.add(15);
      }catch (UnsupportedOperationException uso){
          System.out.println("mySecondList is immutable and it cannot be modified!");
      }


    }
}
