package cn.zciel.java8.java8FromGit01.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream01 {

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

        //filtering
        stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);

        //sorting
        stringCollection.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);
        stringCollection.stream().filter((s) -> s.startsWith("a")).sorted().forEach(System.out::println);
        System.out.println("=======");

        //mapping
        stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
        System.out.println("=======");

        //matching
        boolean anyStartsWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA);

        boolean allStartsWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
        System.out.println(allStartsWithA);

        boolean noneStartsWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("a"));
        System.out.println(noneStartsWithZ);

        System.out.println("=======");

        //counting
        long startsWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();
        System.out.println(startsWithB);

        System.out.println("=======");

        //reducing
        Optional<String> reduced = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);//if a value is present， invoke the specified consumer with the value， otherwise do nothing

        //todo 对于ifPresent(null)中的数值判断问题 同Optional1.java问题
        //reduced.ifPresent(null);
    }
}
