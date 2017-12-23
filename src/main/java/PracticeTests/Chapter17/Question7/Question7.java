package PracticeTests.Chapter17.Question7;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Question7 {

    public static void main(String... args) {
        LocalDate hatDay = LocalDate.of(2017, Month.JANUARY, 15);
        DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
        System.out.println(f.format(hatDay));
        System.out.println(hatDay.format(f));
    }

}
