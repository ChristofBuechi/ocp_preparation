package PracticeTests.Chapter17.Question32;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Question32 {
    public static void main(String... args) {
        LocalDate waffleDay = LocalDate.of(2017, Month.MARCH, 25);
        Period period = Period.ofYears(1).ofMonths(6).ofDays(3);
        LocalDate later = waffleDay.plus(period);
        later.plusDays(1);
        LocalDate thisOne = LocalDate.of(2018, Month.SEPTEMBER, 28);
        LocalDate thatOne = LocalDate.of(2018, Month.SEPTEMBER, 29);
        System.out.println(later.isBefore(thisOne) + " " + later.isBefore(thatOne));
        System.out.println(later); //2017-03-28


    }
}
