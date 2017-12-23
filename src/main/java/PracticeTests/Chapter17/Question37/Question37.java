package PracticeTests.Chapter17.Question37;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Question37 {
    public static void main(String... args) {
        LocalDate date1 = LocalDate.of(2017, Month.MARCH, 3);
        LocalDate date2 = date1.plusDays(2).minusDays(1).minusDays(1);
        System.out.println(date1.equals(date2));
    }
}
