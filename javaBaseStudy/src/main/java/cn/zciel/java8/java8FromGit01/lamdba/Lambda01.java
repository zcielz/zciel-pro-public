package cn.zciel.java8.java8FromGit01.lamdba;

import java.util.*;

/**
 * @author YINZHEN
 * @date 2019/3/22 16:09
 * @Description
 */
public class Lambda01 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {

            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        System.out.println(names);

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        System.out.println(names);

        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        System.out.println(names);

        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println(names);

        System.out.println();

        names.sort(Collections.reverseOrder());  //TODO 这里不起作用
        System.out.println(names);

        List<String> names2 = Arrays.asList("peter", null, "anan", "mike", "xenxia");
        /*Collections.sort(names2, (a, b) -> b.compareTo(a));
        System.out.println(names2);*/  //java.lang.NullPointerException
        names2.sort(Comparator.nullsLast(String::compareTo));
        System.out.println(names2);

        List<String> names3 = null;
        Optional.ofNullable(names3).ifPresent(list -> list.sort(Comparator.naturalOrder()));
        System.out.println(names3);
    }
}
