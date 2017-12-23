package PracticeTests.Chapter17.Question3;

import java.time.Duration;
import java.time.Period;

public class Question3 {
    public static void main(String... args) {
        Duration duration = Duration.ofSeconds(23);
        Period period = Period.ofDays(1);

        System.out.println(duration.getSeconds());      //does only exist on the duration-object
        System.out.println(period.getYears());
    }
}
