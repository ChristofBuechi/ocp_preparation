package PracticeTests.Chapter17.Question40;

import java.time.*;

public class Question40 {
    public static void main(String... args) {
        LocalDateTime localDateTime = LocalDateTime.of(2017, Month.NOVEMBER, 5, 1, 0);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("America/New_York"));

        System.out.println(zonedDateTime.toString());

        ZonedDateTime zonedDateTimeEdit = zonedDateTime.plusHours(1);
        System.out.println(zonedDateTimeEdit.toString()); //same hour, offset has changed
    }
}
