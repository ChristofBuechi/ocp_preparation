package PracticeTests.Chapter12.Question11;

    interface Drive {
        int SPEED = 5;
        default int getSpeed() { return SPEED; }
    }

    interface Hover {
        int MAX_SPEED = 5;
        default int getSpeed() { return MAX_SPEED; }
    }

//    public class Car implements Drive, Hover {            // class has to implement getSpeed
//        public static void main(String[] args) {
//            class RaceCar extends Car {
//                @Override public int getSpeed() { return 10; }
//            };
//            System.out.println(new RaceCar().getSpeed());
//        }
//    }