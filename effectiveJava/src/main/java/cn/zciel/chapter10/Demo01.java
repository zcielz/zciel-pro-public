package cn.zciel.chapter10;

import org.apache.logging.log4j.util.Strings;

/**
 * @author YINZHEN
 * @date 2019/2/25 20:02
 * @Description
 */
public class Demo01 {
    public static void main(String[] args) {

        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));

    }
}
