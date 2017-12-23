package PracticeTests.Chapter17.Question34;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Question34 {
    public static void main(String... args) {
        //None of them causes a compiler error
    }

    private static String formatMe(LocalDateTime obj) {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return f.format(obj);
    }

    private static String formatMe(LocalTime obj) {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return f.format(obj);
    }

    private static String formatMe(ZonedDateTime obj) {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        return f.format(obj);
    }
}
