package demo;

import test.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class mainTest {
    public static void main(String[] args) {

//        BigDecimal a = new BigDecimal(75000);
//        BigDecimal b = new BigDecimal(75001);
//        BigDecimal c = new BigDecimal(74999);
//        BigDecimal d = new BigDecimal(75000);
//
//        System.out.println(d.compareTo(a) > 0);
//
//        String str = "12345678";
//        System.out.println(str.substring(0,5));
//
//        Integer code = 0;
//        System.out.println(String.format("%04d", ++code));
//        System.out.println(Integer.valueOf(null));
//
//        LocalDate localDate = LocalDate.now();
//        String string = localDate + "";
//        System.out.println(string);

        System.out.println(1 > 2);
        Runnable runnable = () -> System.out.println("hello");
        runnable.run();

    }

    public static boolean isNumer(String str){
        return str.matches("-?[0-9]+.*[0-9]*");
    }
}
