package estafet.java9.stream.api_2_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    /**
     * Print the numbers between given range
     * @param numFrom int
     * @param numTo int
     * @return List of int
     */
    public List<Integer> createListOfInt(int numFrom, int numTo) {
        return Stream.iterate(numFrom, i -> i <= numTo, i -> i + 1).collect(Collectors.toList());
    }

    /**
     * Print the stream before a given part of the stream
     * @param list String
     */
    public void useTakeWhile(List<String> list, String value) {
        list.stream().takeWhile(o -> !o.equals(value)).forEach(System.out::println);
    }

    /**
     * Print the stream after a given part of the stream
     * @param list String
     * @param value String
     */
    public void useDropWhile(List<String> list, String value) {
        list.stream().dropWhile(o -> !o.equals(value)).forEach(System.out::println);
    }
}
