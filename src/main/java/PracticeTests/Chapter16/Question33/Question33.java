package PracticeTests.Chapter16.Question33;

public class Question33 {
    public static void main(String[] notes) {
       int age = 22;
       final String name = "Josephine";

//       assert(age=2);           // does not compile
       assert age!=age : (1<age ? "Error" : 10);
//       assert name.equals("") : () -> "Oops"; //does not compile
//       assert name.length()<(long)age : return "Mistake";  //does not compile
    }
}
