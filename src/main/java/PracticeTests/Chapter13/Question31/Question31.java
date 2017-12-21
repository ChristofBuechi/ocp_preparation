package PracticeTests.Chapter13.Question31;

import java.util.ArrayDeque;

public class Question31 {

    public static void main(String... args) {
        ArrayDeque<Integer> dice = new ArrayDeque<>();
        dice.offer(3);
        dice.offer(2);
        dice.offer(4);
        System.out.println(dice.stream().filter(n -> n != 4));
    }
}
