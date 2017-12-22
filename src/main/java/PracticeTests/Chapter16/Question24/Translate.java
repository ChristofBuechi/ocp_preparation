package PracticeTests.Chapter16.Question24;

import java.io.Closeable;

class MakeSign implements AutoCloseable {

    public void close() {
    }

    public void send(String message) {
        System.out.println(message);
    }
}

class ReadSign implements Closeable {

    public void close() {
    }

    public String get() {
        return "Hello";
    }
}

public class Translate {

    public static void main(String... hands) {
        try (ReadSign r = new ReadSign();
             MakeSign w = new MakeSign();) {
            w.send(r.get());
        }
    }

}
