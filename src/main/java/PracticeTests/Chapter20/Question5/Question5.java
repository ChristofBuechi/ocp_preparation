package PracticeTests.Chapter20.Question5;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question5 {

    public static void main(String... args) {

        List<Integer> original = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //works
        List<Integer> copy1 = new CopyOnWriteArrayList<>(original);
        for (Integer w : copy1) {
            copy1.remove(w);
        }

        //doesnt work
//        List<Integer> copy2 = Collections.synchronizedList(original);
//        for (Integer w : copy2) {
//            copy2.remove(w);
//        }

        //doesnt work
//        List<Integer> copy3 = new ArrayList<>(original);
//        for (Integer w : copy3) {
//            copy3.remove(w);
//        }

        Queue<Integer> copy4 = new ConcurrentLinkedDeque<>(original);
        for (Integer w : copy4) {
            copy4.remove(w);
        }

    }

}
