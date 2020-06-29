package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest7 {
    public static void main(String[] args) {
        //将每个首字母变成大写
        List<String> list = Arrays.asList("hello", "world", "helloword");
        List<String> temp;
        //list.stream().map(item -> item.substring(0, 1).toUpperCase().concat(item.substring(1))).collect(Collectors.toList()).forEach(System.out::println);
        temp = list.stream().filter(x -> x.endsWith("d")).collect(Collectors.toList());

        List<String> myList;
        myList = temp;
        myList.forEach(x -> System.out.println(x));
    }
}
