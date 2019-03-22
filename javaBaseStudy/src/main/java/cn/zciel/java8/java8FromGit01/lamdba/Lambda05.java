package cn.zciel.java8.java8FromGit01.lamdba;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * @author YINZHEN
 * @date 2019/3/22 17:14
 * @Description
 */
public class Lambda05 {

    //Pre-Defined Functional Interfaces
    public static void main(String... args) {

        //BiConsumer Exampe
        BiConsumer<String, Integer> printKeyAndValue
                = (key, value) -> System.out.println(key + "-" + value);

        printKeyAndValue.accept("One", 1);
        printKeyAndValue.accept("Two", 2);  //TODO  这里提前调用了

        System.out.println("#############");

        //Java Hash-Map foreach supports BiConsumer
        HashMap<String, Integer> dummyVlues = new HashMap<>();
        dummyVlues.put("One", 1);
        dummyVlues.put("Two", 2);
        dummyVlues.put("Three", 3);

        dummyVlues.forEach((key, value) -> System.out.println(key + "-" + value));

    }
}
