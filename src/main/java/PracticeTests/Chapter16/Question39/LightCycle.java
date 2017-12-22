package PracticeTests.Chapter16.Question39;

class DiskPlayer implements AutoCloseable {
//    public void close() throws Exception{}
    public void close() {} //replacement Method to let the code compile
}

public class LightCycle {
    public static void main(String... bits) {
        try(DiskPlayer john = new DiskPlayer()) {   //no catch clause for Exception - means does not compile
            System.out.println("ping");
        } finally {
            System.out.println("ping");
        }
        System.out.println("return");
    }
}
