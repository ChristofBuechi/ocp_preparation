package PracticeTests.Chapter12.Question6;
public class Question6 {
    public static void main(String[] args) {
        Days day = Days.Monday;
        day.priority();
    }

}

enum Days {

    Monday {
        @Override
        int priority() {
            return 0;
        }
    }, Thursday {
        @Override
        int priority() {
            return 0;
        }
    };

    abstract int priority();
}
