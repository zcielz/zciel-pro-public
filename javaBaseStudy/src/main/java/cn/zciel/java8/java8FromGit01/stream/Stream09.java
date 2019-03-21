package cn.zciel.java8.java8FromGit01.stream;

import java.util.Arrays;

/**
 * @author YINZHEN
 * @date 2019/3/21 18:31
 * @Description
 */
public class Stream09 {

    public static void main(String[] args) {

        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

}
