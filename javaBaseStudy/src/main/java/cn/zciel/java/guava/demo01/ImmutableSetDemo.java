package cn.zciel.java.guava.demo01;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;

/**
 * 创建不可变集合方法：
 * <p>
 * copyOf方法，如ImmutableSet.copyOf(set);
 * <p>
 * of方法，如ImmutableSet.of(“a”, “b”, “c”)或 ImmutableMap.of(“a”, 1, “b”, 2);
 * <p>
 * Builder工具
 * <p>
 * 不可变集合
 * 不可变对象有很多优点，包括：
 * <p>
 * 当对象被不可信的库调用时，不可变形式是安全的；
 * 不可变对象被多个线程调用时，不存在竞态条件问题
 * 不可变集合不需要考虑变化，因此可以节省时间和空间。所有不可变的集合都比它们的可变形式有更好的内存利用率（分析和测试细节）；
 * 不可变对象因为有固定不变，可以作为常量来安全使用。
 * JDK也提供了Collections.unmodifiableXXX方法把集合包装为不可变形式，但：
 * 笨重而且累赘：不能舒适地用在所有想做防御性拷贝的场景；
 * 不安全：要保证没人通过原集合的引用进行修改，返回的集合才是事实上不可变的；
 * 低效：包装过的集合仍然保有可变集合的开销，比如并发修改的检查、散列表的额外空间，等等。
 * 创建不可变集合方法：
 * copyOf方法，如ImmutableSet.copyOf(set);
 * of方法，如ImmutableSet.of(“a”, “b”, “c”)或 ImmutableMap.of(“a”, 1, “b”, 2);
 * Builder工具
 * ---------------------
 * 原文：https://blog.csdn.net/dgeek/article/details/76221746
 */
@Slf4j
public class ImmutableSetDemo {

    public static void main(String[] args) {

        ImmutableSet<String> set = ImmutableSet.of("a", "b", "c", "d");
        ImmutableSet<String> set1 = ImmutableSet.copyOf(set);
        ImmutableSet<String> set2 = ImmutableSet.<String>builder().addAll(set).add("e").build();
        log.info(String.valueOf(set));
        log.info(String.valueOf(set1));
        log.info(String.valueOf(set2));

        ImmutableList<String> list = set.asList();
        log.info(String.valueOf(list));


    }

}
