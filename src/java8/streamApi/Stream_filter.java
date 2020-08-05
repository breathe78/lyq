package java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Author: liuyanqing
 * Date: 2020/8/5
 * Content:
 */
public class Stream_filter {
    public static void main(String[] args) {
        List<Stu> stuList = Arrays.asList(
                new Stu(1, "hh", 22),
                new Stu(2, "aa", 22),
                new Stu(3, "bb", 32),
                new Stu(4, "cc", 42),
                new Stu(5, "dd", 52)
        );
        // 延迟加载，没有截断不执行
        Stream<Stu> stream = stuList.stream().filter(item -> item.getAge() > 40);
        stream.forEach(System.out::println);
        System.out.println("----------------------------------");
        // limit 截断，短路截断，后面不执行。
        stuList.stream().filter(stu -> {
            System.out.println("迭代几次");
            return stu.getAge() > 40;
        }).limit(6).forEach(System.out::println);


    }
}
