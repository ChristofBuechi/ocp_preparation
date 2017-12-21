package PracticeTests.Chapter14.Question36;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DogSearch {

    void reduceList(List<String> names, Predicate<String> tester) {
        names.removeIf(tester);
    }

    public static void main(String[] args) {
        int MAX_LENGTH = 2;
        DogSearch search = new DogSearch();
        List<String> names = new ArrayList<>();
        names.add("Lassie");
        names.add("Benji");
        names.add("Brian");
        MAX_LENGTH += names.size();
//        search.reduceList(names, d -> d.length() > MAX_LENGTH); // does not compile - MAX_LENGTH is not effectively final

        { //can be a solution - copy value into a final variable
            int finalMAX_LENGTH = MAX_LENGTH;
            search.reduceList(names, d -> d.length() > finalMAX_LENGTH);
        }
        System.out.println(names.size());
    }
}
