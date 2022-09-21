package estafet.java14;

import java.time.Month;

public class Quarter {
    /**
     * Prints the quarter depending on the month
     * @param month Month
     * @return int
     */
    public static int getTheQuarter(Month month){
        int quarter  = 0;
        switch (month){
            case JANUARY, FEBRUARY, MARCH -> quarter = 1;
            case APRIL, MAY, JUNE -> quarter = 2;
            case JULY, AUGUST, SEPTEMBER -> quarter = 3;
            case OCTOBER, NOVEMBER, DECEMBER -> quarter = 4;
            default -> throw new IllegalStateException("Invalid Month: " + month);
        }
        return quarter;
    }

}
