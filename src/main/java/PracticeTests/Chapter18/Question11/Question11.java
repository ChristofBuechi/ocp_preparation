package PracticeTests.Chapter18.Question11;

import java.io.*;

public class Question11 {
    public void writeSecret() throws IOException {
        final Writer w = new BufferedWriter(new FileWriter("dont.open"));
        w.write("Secret passcode");
        w.close();
    }

    public void writeSecret2() throws IOException {
        try(final Writer w = new BufferedWriter(new FileWriter("dont.open"))) {
            w.write("Secret passcode");
        }
    }
}
