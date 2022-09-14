package estafet.java8.javaStreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<String> citiesWithCountry =
                Arrays.asList("UK, London", "UK, Sheffield", "Austria, Vienna", "Austria, Graz", "France, Lion");

        citiesWithCountry.stream().filter(c -> c.startsWith("UK")).forEach(System.out::println);
    }
}
