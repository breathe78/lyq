package test;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Demo1 {
    public static void main(String[] args) {
//        ZonedDateTime local = ZonedDateTime.now();
//        LocalDate now = LocalDate.of(local.getYear(),local.getMonth(),1);
//        LocalDate startDate = now.minusMonths(2);
//        LocalDate endDate = now.plusMonths(1);
//        System.out.println(startDate);

//        LocalDate local = LocalDate.now();
//        LocalDate now = LocalDate.of(local.getYear(), local.getMonth(), 1);
//        LocalDate startDate = now.minusMonths(11);
//        System.out.println(startDate);
        String str = "1245168000000";
        System.out.println(Long.valueOf(str));
    }
}
