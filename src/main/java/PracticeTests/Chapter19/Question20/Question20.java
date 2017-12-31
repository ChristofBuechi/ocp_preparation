package PracticeTests.Chapter19.Question20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question20 {
    public static void main(String... args) {
        Path p1 = Paths.get("./found/../keys");
        Path p2 = Paths.get("/lost/blue.txt");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
    }
}
