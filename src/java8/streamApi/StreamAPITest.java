package java8.streamApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Author: liuyanqing
 * Date: 2020/8/5
 * Content:
 */
public class StreamAPITest {

    public static void main(String[] args) {
        //创建Stream
        //方式一：
        List list = new ArrayList();
        Stream stream1 =list.stream();
        stream1.forEach(System.out::println);
        System.out.println("-----------------------");
        //方式二：
        Stu[] stus = new Stu[10];
        Stream<Stu> stream2 = Arrays.stream(stus);
        stream2.forEach(System.out::println);
        System.out.println("-----------------------");
        //方式三：
        Stream<String> stream3 = Stream.of("aaa", "bbb", "ccc");
//        List<String> strenmList =  stream3.collect(Collectors.toList());
//        System.out.println(strenmList);
        stream3.forEach(System.out::println);
    }
}
