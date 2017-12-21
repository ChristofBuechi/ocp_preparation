package PracticeTests.Chapter12.Question28;

public class Penguin {
    private int volume = 1;
    private class Chick {
//        private static int volume = 3; //Inner Class cannot have Static Variables
        void chick() {
            System.out.println("Honk(" + Penguin.this.volume + ")!");
        }
    }
    public static void main(String... args) {
        Penguin pen = new Penguin();
        final Penguin.Chick littleOne = pen.new Chick();
        littleOne.chick();
    }
}
