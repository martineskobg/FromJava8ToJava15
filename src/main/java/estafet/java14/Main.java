package estafet.java14;

import java.time.LocalDate;
import java.time.Month;

import static estafet.java14.Quarter.getTheQuarter;

public class Main {
    public static void main(String[] args) {
        Month month = LocalDate.now().getMonth();
        System.out.println("Quarter = " + getTheQuarter(month));
    }
}
