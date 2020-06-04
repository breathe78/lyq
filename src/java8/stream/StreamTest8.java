package java8.stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest8 {
    public static void main(String[] args) {
        //注意distinct 的位置，如果在limit 之前，则进入死循环。
        Stream.iterate(0, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
