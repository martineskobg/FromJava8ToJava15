package estafet.java8.javaStringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner stringJoiner1 = new StringJoiner(",");
        StringJoiner stringJoiner2 = new StringJoiner("@");
        // Add string in stringJoiner1
        stringJoiner1.add("Word1_in_strJoiner1");
        stringJoiner1.add("Word2_in_strJoiner1");
        System.out.println("\nStrings in stringJoiner1");
        System.out.println(stringJoiner1);

        // Add string in stringJoiner2
        stringJoiner2.add("Word1_in_strJoiner2");
        stringJoiner2.add("Word2_in_strJoiner2");
        System.out.println("\nStrings in stringJoiner2");
        System.out.println(stringJoiner2);

        //Merge the stringJoiners
        StringJoiner mergeStringJoiner= stringJoiner1.merge(stringJoiner2);
        System.out.println("\nResult after merging the string joiners");
        System.out.println(mergeStringJoiner);


    }
}
