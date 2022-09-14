package estafet.java12;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactFormatting {

    public static NumberFormat setShortFormat() {
        return NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
    }

    public static NumberFormat setLongFormat() {
        return NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

    }

    public static void printFormattedNumber(NumberFormat numberFormat, long number){
        System.out.println(numberFormat.format(number));
    }
    // Print compact rounded down short format
    public static void printCompactRoundedDownShort(NumberFormat nfShort, long number) {
        nfShort.setRoundingMode(RoundingMode.DOWN);
        System.out.println(nfShort.format(number));
    }

    // Print compact rounded up long format
    public static void printCompactRoundedUpLong(NumberFormat nfLong, long number) {
        nfLong.setRoundingMode(RoundingMode.UP);
        System.out.println(nfLong.format(number));
    }
}
