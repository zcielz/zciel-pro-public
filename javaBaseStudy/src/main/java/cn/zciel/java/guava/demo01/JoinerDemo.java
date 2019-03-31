package cn.zciel.java.guava.demo01;

import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Joiner 提供了各种方法来处理字符串加入操作，对象等。
 * <p>
 * Joiner的实例不可变的，因此是线程安全的。
 * <p>
 * 警告：joiner实例总是不可变的; 诸如{useForNull}之类的配置方法对它被调用的实例没有影响！ 您必须存储并使用该方法返回的新joiner实例。
 * 这使得joiners成为线程安全的，并且可以安全地存储为{@code static final}常量。
 */
@Slf4j
public class JoinerDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Joiner.on(",").skipNulls().appendTo(sb, "Hello", "guava");
        log.info(String.valueOf(sb));

        log.info(String.valueOf(Joiner.on(",").useForNull("none").join(1, null, 3)));
        log.info(String.valueOf(Joiner.on(",").skipNulls().join(Arrays.asList(1, 2, 3, 4, null, 6))));
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        log.info(Joiner.on(",").withKeyValueSeparator("=").join(map));


    }
}
