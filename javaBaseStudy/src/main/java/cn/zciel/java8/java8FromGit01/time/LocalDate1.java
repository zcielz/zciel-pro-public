package cn.zciel.java8.java8FromGit01.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author YINZHEN
 * @date 2019/3/22 14:44
 * @Description
 */
public class LocalDate1 {

    public static void main(String[] args) {
        LocalDate tody = LocalDate.now();  //2019-03-22

        LocalDate tomorrow = tody.plus(1, ChronoUnit.DAYS); //2019-03-23

        LocalDate yesterday = tomorrow.minusDays(2); //2019-03-21


        LocalDate independenceDay = LocalDate.of(2019, Month.MARCH, 22);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        //System.out.println(dayOfWeek);  //FRIDAY 计算出星期几

        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.GERMAN);

        LocalDate xmas = LocalDate.parse("24.12.2018", germanFormatter);
        System.out.println(xmas); //格式化

    }
}
