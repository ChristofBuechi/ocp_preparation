package PracticeTests.Chapter17.Question17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Question17 {
    public static void main(String... args) {
        Duration duration = Duration.ofDays(1);
        Period period = Period.ofDays(1);

        System.out.println(duration);
        System.out.println(period);
    }
}
