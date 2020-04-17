package test;

import Common.CommonUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

    //1、通过数组
    static void gen1() {
        String[] arr = {"a", "b", "c", "d"};
        Stream.of(arr).limit(4).forEach(System.out::println);

    }

    //通过集合
    static void gen2() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        Stream<String> s = list.stream();
    }

    //
    static void gen3() {
        Stream<Integer> s = Stream.generate(() -> 1);
    }

}
