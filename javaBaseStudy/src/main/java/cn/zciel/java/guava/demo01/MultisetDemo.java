package cn.zciel.java.guava.demo01;

import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zciel
 * @date 2019/3/31 13:37
 * @Description 新型集合类
 * Multiset可统计一个词在文档中出现了多少次
 */
@Slf4j
public class MultisetDemo {

    public static void main(String[] args) {

        Multiset<String> set = LinkedHashMultiset.create();
        set.add("a");
        set.add("b");
        set.add("a");
        set.add("c");
        set.add("c");
        set.add("c");
        set.setCount("a", 6); //添加或删除指定元素使其在集合中的数量是count
        log.info(String.valueOf(set.count("a")));//给定元素在Multiset中的计数
        log.info(String.valueOf(set));
        log.info(String.valueOf(set.size()));
        log.info(String.valueOf(set.elementSet().size())); //所有的元素计数的总和 不包括重复元素
        set.clear();
        log.info(String.valueOf(set));

    }
}
