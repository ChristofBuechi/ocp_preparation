package PracticeTests.Chapter16.Question36;


import java.io.FileNotFoundException;

class OutOfTuneException extends Exception {
    OutOfTuneException(String message) { super(message);}
}
public class Piano {
    public void play() throws OutOfTuneException, FileNotFoundException {
        throw new OutOfTuneException("Sour note!");
    }

    public static void main(String... keys) throws OutOfTuneException {
        final Piano piano = new Piano();
        try {
            piano.play();
        } catch (Exception e) {
//            throw e; //unhandled FileNotFoundException
        } finally {
            System.out.println("Song finished");
        }
    }
}
