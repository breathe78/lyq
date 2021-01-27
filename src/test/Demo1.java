package test;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Optional<String> test = Optional.ofNullable(null);

        //将值修改为大写
        Optional<String> less3 = test.map((value) -> value.toUpperCase());
        //打印结果 ABCD
        System.out.println(less3.orElse("值为null，不打印！"));
    }
}
