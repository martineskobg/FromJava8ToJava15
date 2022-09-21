package estafet.java11;

import lombok.NonNull;

import java.util.Arrays;

public class LocalVariable {

    /**
     * Return the count of numbers greater than a given number
     * @param arr
     * @param number
     * @return
     */
    public static long getCountGreaterThan(int[] arr, int number) {
        // Using local variable and lambda expression
        return Arrays.stream(arr).filter((@NonNull var i) -> i > number).count();
    }

    /**
     * Return the count of numbers less than a given number
     * @param arr
     * @param number
     * @return
     */
    public static long getCountLesThan(int[] arr, int number) {
        // Using local variable and lambda expression
        return Arrays.stream(arr).filter((@NonNull var i) -> i < number).count();
    }
}
