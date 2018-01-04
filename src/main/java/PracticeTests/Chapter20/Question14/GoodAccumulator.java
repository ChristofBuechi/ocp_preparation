package PracticeTests.Chapter20.Question14;

import java.util.Arrays;
import java.util.function.BiFunction;

public class GoodAccumulator {

    int i;
    public void test() {
//        BiFunction<Integer, Integer, Integer> accumulator =(a,b) -> (a-b);
        BiFunction<Integer, Integer, Integer> accumulator =(a,b) -> 5;
//        BiFunction<Integer, Integer, Integer> accumulator =(a,b) -> i++;
        System.out.println(Arrays.asList(1,2,3,4,5)
        .parallelStream()
        .reduce(0, accumulator, (s1, s2) -> s1 + s2));
    }


    public static void main(String... args) {
        GoodAccumulator goodAccumulator = new GoodAccumulator();
        goodAccumulator.test();
    }
}
