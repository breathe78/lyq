package java8.streamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Author: liuyanqing
 * Date: 2020/8/5
 * Content:
 */
public class Stream_distinct {
    public static void main(String[] args) {
        List<Stu> stuList = Arrays.asList(
                new Stu(1,"hh",22),
                new Stu(2,"aa",22),
                new Stu(3,"bb",32),
                new Stu(4,"cc",42),
                new Stu(4,"cc",42),
                new Stu(4,"cc",42),
                new Stu(4,"cc",42),
                new Stu(5,"dd",52)
        );
        stuList.stream().distinct().forEach(System.out::println);
    }
}
