package java8.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Author: liuyanqing
 * Date: 2020/8/5
 * Content:
 */
public class Stream_map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        //字符串长度打印
        list.stream().map(item -> item.length()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        //字符串转大写打印
        list.stream().map(item -> item.toUpperCase()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        //学生姓名映射打印
        List<Stu> stuList = Arrays.asList(
                new Stu(1, "hh", 22),
                new Stu(2, "aa", 22),
                new Stu(3, "bb", 32),
                new Stu(4, "cc", 42),
                new Stu(5, "dd", 52)
        );
        stuList.stream().map(item -> item.getName()).forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        // map/flatMap
        Stream<Stream<Character>> str1 = list.stream().map(Stream_map::filiterCharter);
        str1.forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        Stream<Character> str2 = list.stream().flatMap(Stream_map::filiterCharter);
        str2.forEach(System.out::println);
    }

    //返回流
    public static Stream<Character> filiterCharter(String str) {
        List<Character> charList = new ArrayList<>();
        for (Character ch : str.toCharArray()) {
            charList.add(ch);
        }
        return charList.stream();
    }
}
