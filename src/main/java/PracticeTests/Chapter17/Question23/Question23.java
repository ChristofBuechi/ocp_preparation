package PracticeTests.Chapter17.Question23;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Question23 {
    public static void main(String... args) {
        LocalDate hatDay = LocalDate.of(2017, Month.JANUARY, 15);
//        DateFormatter f = DateFormatter.ISO_DATE; //does not compile
        DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
        System.out.println(hatDay.format(f));
    }
}
