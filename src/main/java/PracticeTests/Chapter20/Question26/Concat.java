package PracticeTests.Chapter20.Question26;

import java.util.Arrays;
import java.util.List;

public class Concat {

    private String concat1(List<String> values) {
        return values.parallelStream()
                .reduce("a",
                        (x, y) -> x + y,
                        String::concat);
    }

    private String concat2(List<String> values) {
        return values.parallelStream()
                .reduce((w, z) -> z + w).get();
    }

    public static void main(String... args) {
        Concat c = new Concat();
        List<String> list = Arrays.asList("Cat", "Hat");
        String x = c.concat1(list);
        String y = c.concat2(list);
        System.out.println(x + " " + y);
    }
}
