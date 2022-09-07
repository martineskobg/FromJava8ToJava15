package org.estafet.functional_interfaces_and_lambda_expressions;

import javax.sound.midi.Soundbank;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface StringAction {
    String reversString(String string);
}

public class StringActionImpl {

    public static void main(String[] args) {
        String str = "Functional interface and lambda expressions";
        StringAction sa = (String s) -> Stream.of(s)
                .map(word -> new StringBuilder(word)
                        .reverse())
                .collect(Collectors.joining(" "));

        String reversedStr = sa.reversString(str);
        System.out.println("\nBase Text: " + str);
        System.out.println("Reversed Text: "+reversedStr);
    }
}