package PracticeTests.Chapter15.Question40;

import java.util.*;
import java.util.stream.Stream;

public class Question40 {
    public static void main(String... args) {
        List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("all queued up");
        queue.push("last");

//        withFlatMap(list); withoutFlatMap(list);
        withFlatMap(queue); withoutFlatMap(queue);

    }

    private static void withFlatMap(Collection<String> coll) {
        Stream.of(coll)
                .flatMap(x -> x.stream())
                .forEach(System.out::print);
        System.out.println();
    }

    private static void withoutFlatMap(Collection<String> coll) {
        Stream.of(coll)
                .filter(x -> !x.isEmpty())
                .map(x -> x)
                .forEach(System.out::print);
        System.out.println();
    }
}
