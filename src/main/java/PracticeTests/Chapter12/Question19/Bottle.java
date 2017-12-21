package PracticeTests.Chapter12.Question19;

public class Bottle {
    public static class Ship {
        private enum Sail {
            TALL {protected int getHeight() { return 100;}},
            SHORT {protected int getHeight() { return 2;}};
            protected abstract int getHeight();
        }
        public Sail getSail() {
            return Sail.TALL;
        }
    }

    public static void main(String[] stars) {
        Bottle bottle = new Bottle();
//        Ship q = bottle.new Ship();       //does not compile because Ship is static
//        System.out.println(q.getSail());
    }
}
