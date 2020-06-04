package java8;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        //  1 3 5 7 9 11
        Stream<Integer> stream = Stream.iterate(1, it -> it + 2).limit(6);
        IntSummaryStatistics summaryStatistics = stream.filter(fi -> fi > 2).mapToInt(m -> m * 2).skip(2).limit(2).summaryStatistics();
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getMax());
    }
}
