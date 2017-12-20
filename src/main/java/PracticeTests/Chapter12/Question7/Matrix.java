package PracticeTests.Chapter12.Question7;

public class Matrix {
    private int level = 1;
    class Deep {
        private int level = 2;
        class Deeper {
            private int level = 5;
            public void printReality() {
                System.out.println(level);
                System.out.println(" " + Matrix.Deep.this.level);
                System.out.println(" " + Deep.this.level);
            }
        }
    }
    public static void main(String[] args) {
        Matrix.Deep.Deeper simulation = new Matrix().new Deep().new Deeper();
        simulation.printReality();
    }
}
