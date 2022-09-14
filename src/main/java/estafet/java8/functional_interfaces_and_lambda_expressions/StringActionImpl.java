package estafet.java8.functional_interfaces_and_lambda_expressions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Any interface with a SAM(Single Abstract Method) is a functional interface
@FunctionalInterface //@FunctionalInterface annotation. This clearly communicates the purpose of the interface, and
// also allows a compiler to generate an error if the annotated interface does not satisfy the conditions.
interface StringAction {
    String reversString(String string);
}

public class StringActionImpl {

    public static void main(String[] args) {
        String str = "Functional interface and lambda expressions";
        // Implementing StringAction
        StringAction sa = (String s) -> Stream.of(s)
                .map(word -> new StringBuilder(word)
                        .reverse())
                .collect(Collectors.joining(" "));

        String reversedStr = sa.reversString(str);
        System.out.println("\nBase Text: " + str);
        System.out.println("Reversed Text: "+reversedStr);
    }
}