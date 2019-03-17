package cn.zciel.java8.java8FromGit01.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream02 {

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection.stream().sorted().forEach(System.out::println);
        System.out.println(stringCollection);
    }
}
