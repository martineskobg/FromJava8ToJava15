package estafet.java12;

import java.math.RoundingMode;
import java.text.NumberFormat;
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
     * @param number long
     */
    public static void printFormattedNumber(NumberFormat numberFormat, long number){
        System.out.println(numberFormat.format(number));
    }

    /**
     * Print compact rounded down short format
     * @param nfShort NumberFormat
     * @param number long
     */
    public static void printCompactRoundedDownShort(NumberFormat nfShort, long number) {
        nfShort.setRoundingMode(RoundingMode.DOWN);
        System.out.println(nfShort.format(number));
    }

    /**
     * Print compact rounded UP long format
     * @param nfLong NumberFormat
     * @param number long
     */
    public static void printCompactRoundedUpLong(NumberFormat nfLong, long number) {
        nfLong.setRoundingMode(RoundingMode.UP);
        System.out.println(nfLong.format(number));
    }
}
