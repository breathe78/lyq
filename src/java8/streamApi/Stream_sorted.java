package java8.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: liuyanqing
 * Date: 2020/8/5
 * Content:
 */
public class Stream_sorted {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ee", "bb", "ff", "dd","哈哈","啊");
        //自然排序
        stringList.stream().sorted().forEach(System.out::println);
        //指定排序
//        stringList.stream().sorted(item ->{
//            Comparator.comparing((o1, o2) -> {
//
//            });
//        });
    }
}
