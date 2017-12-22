package PracticeTests.Chapter16.Question34;

class MissedCallException extends Exception {
}

public class Phone {
    static void mmakeCall() throws RuntimeException {
        throw new ArrayIndexOutOfBoundsException("Call");
    }

    public static void main(String[] messages) {
        try {
            mmakeCall();
//        } catch (MissedCallException e) {             //never thrown
//            throw new RuntimeException("VoiceMail");
        } finally {
            throw new RuntimeException("Text");
        }
    }
}
