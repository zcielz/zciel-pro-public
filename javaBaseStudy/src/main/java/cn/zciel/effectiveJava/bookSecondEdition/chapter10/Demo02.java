package cn.zciel.effectiveJava.bookSecondEdition.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YINZHEN
 * @date 2019/2/25 20:06
 * @Description
 */
public class Demo02 {

    public static void main(String[] args) {

        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        boolean contains = list.contains(s);
        System.out.println(contains);

    }
}
