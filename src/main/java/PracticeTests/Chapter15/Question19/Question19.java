package PracticeTests.Chapter15.Question19;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class Question19 {
    public static void main(String... args) {
        Set<String> set = new HashSet<>();
        set.add("tire-");
        List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("wheel-");
        Stream.of(set, list, queue).flatMap(x -> x.stream())
                .forEach(System.out::print);
    }
}
