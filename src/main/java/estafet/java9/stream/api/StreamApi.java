package org.estafet.java9.stream.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public List<Integer> createListOfInt(int numFrom, int numTo) {
        return Stream.iterate(numFrom, i -> i <= numTo, i -> i + 1).collect(Collectors.toList());
    }

    public void useOfTakeWhile(List<String> list) {
        list.stream().takeWhile(o -> !o.isEmpty()).forEach(System.out::println);
    }

    public void useOfDropWhile(List<String> list, String value) {
        list.stream().dropWhile(o -> !o.equals(value)).forEach(System.out::println);
    }

}
