package cn.zciel.java8.java8FromGit01.stream;

import java.util.Optional;
import java.util.function.Supplier;

public class Optional02 {

    static class Outer {

        Nested nested = new Nested();

        public Nested getNested() {
            return nested;
        }

    }

    static class Nested {
        Inner inner = new Inner();

        public Inner getInner() {
            return inner;
        }
    }

    static class Inner {
        String foo = "boo";

        public String getFoo() {
            return foo;
        }
    }

    public static void main(String[] args) {

        test1();
        test2();
        test3();


    }

    public static <T> Optional<T> resolve(Supplier<T> resolver) {
        try {
            T result = resolver.get();
            return Optional.ofNullable(result); //Returens an describing the specified value, if no-null, otherwise returns an empty
        } catch (NullPointerException e) {
            return Optional.empty(); //Returns an empty instance， no value is present for this Optional
        }
    }

    private static void test1() {
        Optional.of(new Outer())
                .flatMap(o -> Optional.ofNullable(o.nested))
                .flatMap(n -> Optional.ofNullable(n.inner))
                .flatMap(i -> Optional.ofNullable(i.foo))
                .ifPresent(System.out::println);


       /*  分布分析
        Optional<Outer> outer = Optional.of(new Outer());
       Optional<Nested> nested = Optional.of(new Outer())
                .flatMap(o -> Optional.ofNullable(o.nested));
        Optional<Inner> inner = nested.flatMap(n -> Optional.ofNullable(n.inner));
        Optional<String> result = inner.flatMap(i -> Optional.ofNullable(i.foo));
        result.ifPresent(System.out::println);*/

    }

    private static void test2() {
        Optional.of(new Outer())
                .map(Outer::getNested)
                .map(Nested::getInner)
                .map(Inner::getFoo)
                .ifPresent(System.out::println);
    }

    private static void test3() {
        Outer outer = new Outer();
        resolve(() -> outer.getNested().getInner().getFoo())
                .ifPresent(System.out::println);
    }

}
