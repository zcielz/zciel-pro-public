package cn.zciel.java8.java8FromGit01.lamdba;

import org.checkerframework.checker.units.qual.C;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author YINZHEN
 * @date 2019/3/22 16:32
 * @Description
 */
public class Lambda03 {

    @FunctionalInterface
    interface Fun {
        void foo();
    }

    public static void main(String[] args) throws Exception {

        //Predicates

        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo"); //true
        predicate.negate().test("foo"); //false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        //Functions
        Function<String, Integer> toInteger = Integer::valueOf;  //TODO
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        String apply = backToString.apply("123");
        System.out.println(apply);

        //Suppliers
        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();//new Person
        System.out.println(person);
        System.out.println(person.firstName + ".." + person.lastName);

        //Consumers
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));

        //Comparators
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");
        comparator.compare(p1, p2);
        comparator.reversed().compare(p1, p2);
        System.out.println(p1.firstName + ".." + p1.lastName);
        System.out.println(p2.firstName + ".." + p2.lastName);

        //Runnables
        Runnable runnable = () -> System.out.println(UUID.randomUUID());
        runnable.run();

        //Callables
        Callable<UUID> callable = UUID::randomUUID;
        UUID call = callable.call();
        System.out.println(call);


    }
}
