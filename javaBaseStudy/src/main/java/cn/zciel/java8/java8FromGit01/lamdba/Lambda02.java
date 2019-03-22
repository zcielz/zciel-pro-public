package cn.zciel.java8.java8FromGit01.lamdba;

/**
 * @author YINZHEN
 * @date 2019/3/22 16:20
 * @Description
 */
public class Lambda02 {

    @FunctionalInterface
    public static interface Converter<F, T> {
        T convert(F from);
    }

    static class Something {
        String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }

    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    public static void main(String[] args) {
        Converter<String, Integer> integerConverter1 =
                (from) -> Integer.valueOf("123");
        Integer converted1 = integerConverter1.convert("45");
        System.out.println(converted1);

        // method reference
        Converter<String, Integer> integerConverter2 = Integer::valueOf;
        Integer converted2 = integerConverter2.convert("123");
        System.out.println(converted2);

        Something something = new Something();

        Converter<String, String> stringConverter = something::startsWith;
        String converted3 = stringConverter.convert("Java");
        System.out.println(converted3);


        // constructor reference
        PersonFactory<Person> personPersonFactory = Person::new;
        Person person = personPersonFactory.create("Peter", "jack");
        System.out.println(person.firstName + ".." + person.lastName);

    }


}
