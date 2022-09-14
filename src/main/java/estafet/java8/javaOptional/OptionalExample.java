package estafet.java8.javaOptional;

public class OptionalExample {
    public static void main(String[] args) {
        final String TEXT = "Believing neglected so so allowance existence departure in. In design active temper be uneasy." +
                " Thirty for remove plenty regard you summer though. He preference connection astonished on of ye." +
                " Partiality on or continuing in particular principles as." +
                " Do believing oh disposing to supported allowance we.";

        final String WORD_FOR_SEARCH = "remove";

        JavaOptional javaOptional = new JavaOptional();
        int index;
        index = javaOptional.searchForSubStringIndex(TEXT, WORD_FOR_SEARCH);
        if (index > 0) {
            System.out.println("Position of the substring: " + index);
        } else {
            System.out.println("Text not found");
        }


    }
}
