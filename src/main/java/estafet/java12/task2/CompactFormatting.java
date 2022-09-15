package estafet.java12.task2;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CompactFormatting {
    /**
     * Set short formatting for NumberFormat
     * @return NumberFormat
     */
    public static NumberFormat setShortFormat() {
        return NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
    }

    /**
     * Set Long formatting for NumberFormat
     * @return NumberFormat
     */
    public static NumberFormat setLongFormat() {
        return NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

    }

    /**
     * Prints number by using NumberFormat
     * @param numberFormat NumberFormat
     * @param numbers long
     */
    public static void printFormattedNumber(NumberFormat numberFormat, List<Long> numbers){
        numbers.forEach(n-> System.out.println( numberFormat.format(n)));
    }

    /**
     * Print compact rounded down short format
     * @param nfShort NumberFormat
     * @param numbers long
     */
    public static void printCompactRoundedDownShort(NumberFormat nfShort, List<Long> numbers) {
        nfShort.setRoundingMode(RoundingMode.DOWN);
        numbers.forEach(n-> System.out.println(nfShort.format(n)));
    }

    /**
     * Print compact rounded UP long format
     * @param nfLong NumberFormat
     * @param numbers long
     */
    public static void printCompactRoundedUpLong(NumberFormat nfLong, List<Long> numbers) {
        nfLong.setRoundingMode(RoundingMode.UP);
        numbers.forEach(n-> System.out.println(nfLong.format(n)));
    }
}
