package PracticeTests.Chapter15.Question13;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Books {
    public static void main(String[] args) {
//        IntegerStream pages = IntegerStream.of(200, 300);
//        IntegerSummaryStatistics stats = pages.summaryStatistics();
        IntStream pages = IntStream.of(200, 300);
        IntSummaryStatistics stats = pages.summaryStatistics();
        long total = stats.getSum();
        long count = stats.getCount();
        System.out.println(total + "-" + count);
    }
}
