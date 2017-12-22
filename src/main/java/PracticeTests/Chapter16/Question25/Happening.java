package PracticeTests.Chapter16.Question25;

class FunEvent implements AutoCloseable {
    public void close() {
        System.out.println("1");
    }
}

public class Happening {
    public static void main(String... lots) {
        try( FunEvent f = new FunEvent()) {
            System.out.println("2");
            throw new ArithmeticException();
        } catch (Exception e) {
            System.out.println("3");
        } finally {
            System.out.println("4");
        }
    }
}
