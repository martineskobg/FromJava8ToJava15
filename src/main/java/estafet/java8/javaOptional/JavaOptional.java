package org.estafet.java8.javaOptional;

import java.util.Optional;

public class JavaOptional {
    /**
     * Search for a substring in a given string and return the position of the substring.
     * @param text String
     * @param subString String
     * @return int
     */
    public int searchForSubStringIndex(String text, String subString) {
        Optional<String> longText = Optional.ofNullable(text);
        return longText.map(s -> s.indexOf(subString)).orElse(0);
    }
}
