package java8.streamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Author: liuyanqing
 * Date: 2020/8/5
 * Content:
 */
public class Stream_skip {
    public static void main(String[] args) {
        List<Stu> stuList = Arrays.asList(
                new Stu(1, "hh", 22),
                new Stu(2, "aa", 22),
                new Stu(3, "bb", 32),
                new Stu(4, "cc", 42),
                new Stu(5, "dd", 52)
        );
        stuList.stream().skip(2).forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        //流中元素共5个，跳过6个，则返回空流。
        stuList.stream().skip(6).forEach(System.out::println);
    }
}
