package PracticeTests.Chapter18.Question37;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class Unicorn {
    public void findUnicorns() {
        try(InputStream o = new ObjectInputStream(readBook())) {
            while (o.read() != -1) {
                System.out.println(o.read());
            }
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    private InputStream readBook() throws IOException{
//        return new BufferedInputStream(new FileReader("magic.book")); // does not compile
        return null;
    }

    public static void main(String... horn) {
        new Unicorn().findUnicorns();
    }
}
