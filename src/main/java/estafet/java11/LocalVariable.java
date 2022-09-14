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
    public static long getCount(int[] arr, int number) {
        return Arrays.stream(arr).filter((@NonNull var i) -> i > number).count();
    }
}
