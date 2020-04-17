package test;

import util.DateUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {
//        String s=String.format("%04d", 999);
//        System.out.println(s);
//        String str = "2019-08-05";
//        System.out.println(str.substring(0,7));

//        Date date = new Date();
//        Date date1 = getDate(getLocalDateTime(date).plus(-1, ChronoUnit.MONTHS));
//        String str = formatDate(date1,"yyyy-MM");
//
//        System.out.println(str);


        Long demo = 1L;

        System.out.println( demo == 1);

        System.out.println( DateUtil.asLocalDate(new Date()));
        System.out.println("2020-02-21".substring(0,7));


    }

    public static Date strToDate(String str, String format) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDate parse = LocalDate.parse(str, dtf);
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = parse.atStartOfDay().atZone(zone).toInstant();
        return Date.from(instant);
    }

    public static Date getDate(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.of("GMT+08:00");
        Instant instant = localDateTime.atZone(zone).toInstant();
        Date date = Date.from(instant);
        return date;
    }

    public static LocalDateTime getLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.of("GMT+08:00");
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        return localDateTime;
    }

    public static String formatDate(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

}
