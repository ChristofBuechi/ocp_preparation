package PracticeTests.Chapter14.Question30;

import java.util.function.DoubleToIntFunction;

public class Bank {
    private int savingInCents;
    private static class ConvertToCents {
//        static DoubleToIntFunction f = p -> p*100; // needs a downcast
        static DoubleToIntFunction f = p -> (int) (p*100); // solved
    }

    public static void main(String... currency) {
        Bank creditUnion = new Bank();
        creditUnion.savingInCents = 100;
        double deposit = 1.5;

        creditUnion.savingInCents += ConvertToCents.f.applyAsInt(deposit);
        System.out.println(creditUnion.savingInCents);
    }
}
