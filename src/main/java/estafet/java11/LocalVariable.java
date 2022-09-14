package estafet.java11;

import lombok.NonNull;

import java.util.Arrays;

public class LocalVariable {

    public static long getCount(int[] arr, int number) {
        return Arrays.stream(arr).filter((@NonNull var i) -> i > number).count();
    }
}
