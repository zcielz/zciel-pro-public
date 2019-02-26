package cn.zciel.chapter06;

import java.util.regex.Pattern;

/**
 * @author YINZHEN
 * @date 2019/2/25 19:16
 * @Description 避免创建不必要的对象
 */
public class RomanNumerals {

    private static final Pattern ROMAN = Pattern.compile("..");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
