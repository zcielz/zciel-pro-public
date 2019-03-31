package cn.zciel.java.guava.demo01;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.Map;

/**
 * @author zciel
 * @date 2019/3/31 13:41
 * @Description Multimap可以很容易地把一个键映射到多个值。换句话说，Multimap是把键映射到任意多个值的一般方式。
 */
@Slf4j
public class MultimapDemo {

    public static void main(String[] args) {
        Multimap<String, Integer> map = HashMultimap.create(); //Multimap是把键映射到任意多个值的一般方式
        map.put("a", 1); //key相同不会覆盖之前的值
        map.put("a", 2);
        map.put("a", 3);
        log.info(String.valueOf(map));
        log.info(String.valueOf(map.get("a")));
        log.info(String.valueOf(map.keySet().size()));
        Map<String, Collection<Integer>> mapView = map.asMap();

        log.info(String.valueOf(mapView));
    }
}
