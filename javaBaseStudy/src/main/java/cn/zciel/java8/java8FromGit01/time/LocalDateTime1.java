package cn.zciel.java8.java8FromGit01.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * @author YINZHEN
 * @date 2019/3/22 14:53
 * @Description
 */
public class LocalDateTime1 {

    public static void main(String[] args) {

        LocalDateTime sylvester = LocalDateTime.of(2019, Month.MARCH, 22, 23, 39, 59);

        DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
        System.out.println(dayOfWeek);  //FRIDAY

        Month month = sylvester.getMonth();
        System.out.println(month);  //MARCH

        long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(minuteOfDay); //1419  计算所用的分钟

        //TODO
        Instant instant = sylvester
                .atZone(ZoneId.systemDefault())
                .toInstant();

        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate);

        DateTimeFormatter formatter =
                DateTimeFormatter
                        .ofPattern("MMM dd, yyyy - HH:mm");
        LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13", formatter);
        String string = parsed.format(formatter);
        System.out.println(string);


    }
}
