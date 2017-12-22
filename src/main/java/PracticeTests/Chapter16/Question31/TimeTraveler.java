package PracticeTests.Chapter16.Question31;


class TimeException extends Exception{};

class TimeMachine implements AutoCloseable {

    int v;
    public TimeMachine(int v) { this.v = v;}
    public void close() throws Exception {
        System.out.println(v);
    }
}
public class TimeTraveler {
    public static void main(String[] twelve) {
        //eqxception in try-with-ressources must be catched
//        try (TimeMachine timeSled = new TimeMachine(1);
//        TimeMachine delorean = new TimeMachine(2);
//        TimeMachine tardis = new TimeMachine(3)) {
//        } catch (TimeException e) {
//            System.out.println(4);
//        } finally {
//            System.out.println(5);
//        }
    }

}
