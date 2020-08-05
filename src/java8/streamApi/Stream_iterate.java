package java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author: liuyanqing
 * Date: 2020/8/5
 * Content:
 */
public class Stream_iterate {
    public static void main(String[] args) {
        //使用iterate 创建无限流。
        Stream<Integer> stream = Stream.iterate(0, (x) -> x + 2);
        stream.limit(2).forEach(System.out::println);
        //使用generate 创建无限流
        Stream<Double> generate = Stream.generate(Math::random);
        generate.limit(3).forEach(System.out::println);
    }
}
