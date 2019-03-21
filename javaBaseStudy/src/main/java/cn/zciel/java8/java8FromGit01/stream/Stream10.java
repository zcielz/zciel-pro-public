package cn.zciel.java8.java8FromGit01.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author YINZHEN
 * @date 2019/3/21 18:32
 * @Description
 */
public class Stream10 {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Max", 12),
                new Person("Peter", 12),
                new Person("Smart", 12),
                new Person("Pamela", 23),
                new Person("David", 88)
        );

        test1(persons);
        test2(persons);
        test3(persons);
        test4(persons);
        test5(persons);
        test6(persons);
        test7(persons);

    }

    private static void test1(List<Person> persons) {
        List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(filtered);
    }

    private static void test2(List<Person> persons) {
        Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));

        personsByAge.forEach((age, p) -> System.out.format("age %s : %s \n", age, p));
    }

    private static void test3(List<Person> persons) {
        Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.age));
        System.out.println(averageAge);
    }

    private static void test4(List<Person> persons) {
        IntSummaryStatistics ageSummary =
                persons.stream().collect(Collectors.summarizingInt(p -> p.age));
        System.out.println(ageSummary);
    }

    private static void test5(List<Person> persons) {
        String names = persons.stream().filter(p -> p.age >= 18).map(p -> p.name).collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
        System.out.println(names);

    }

    private static void test6(List<Person> persons) {
        Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> name1 + ";" + name2  //解决相同键值冲突问题
                ));
        System.out.println(map);
    }

    //TODO
    private static void test7(List<Person> persons) {

        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "), //suplier
                        (j, p) -> j.add(p.name.toUpperCase()),  //accumulator
                        (j1, j2) -> j1.merge(j2),               //combiner
                        StringJoiner::toString);                //finisher

        String names = persons.stream().collect(personNameCollector);

        System.out.println(names);

    }

    private static void test8(List<Person> persons) {

    }

}
