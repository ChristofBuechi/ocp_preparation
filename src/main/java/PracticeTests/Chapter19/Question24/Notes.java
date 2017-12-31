package PracticeTests.Chapter19.Question24;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Notes {
    public void printNotes() {
        try(OutputStream out = System.out) {
//            Files.copy(out, Paths.get("course.txt"));   //does not compile because this signature does not exist
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] coursework) {
        new Notes().printNotes();
    }
}
