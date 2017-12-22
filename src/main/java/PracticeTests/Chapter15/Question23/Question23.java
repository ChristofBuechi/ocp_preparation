package PracticeTests.Chapter15.Question23;

import java.util.stream.Stream;

public class Question23 {
    public static void main(String... args) {
        Stream<Integer> stream = Stream.iterate(1, i -> i);
//        boolean b = stream.allMatch(i -> i > 5);
//        boolean b = stream.noneMatch(i -> i > 5);
        boolean b = stream.anyMatch(i -> i > 5);
        System.out.println(b);
    }
}
