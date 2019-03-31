package cn.zciel.java.guava.demo01;

import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;


/**
 * @author zciel
 * @date 2019/3/31 14:33
 * @Description 集合操作：交集，差集，并集
 */
@Slf4j
public class CollectionsDemo {

    public static void main(String[] args) {
        Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 4, 5);
        Set<Integer> set2 = Sets.newHashSet(3, 4, 5, 6);
        Sets.SetView<Integer> inter = Sets.intersection(set1, set2); //交集
        log.info(String.valueOf(inter));
        Sets.SetView<Integer> diff = Sets.difference(set1, set2); //差集,在A中不在B中
        log.info(String.valueOf(diff));
        Sets.SetView<Integer> union = Sets.union(set1, set2); //并集
        log.info(String.valueOf(union));
    }
}
