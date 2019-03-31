package cn.zciel.java.guava.demo01;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zciel
 * @date 2019/3/31 13:46
 * @Description BiMapDemo
 */
@Slf4j
public class BiMapDemo {

    public static void main(String[] args) {
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("sina", "sina.com");
        biMap.put("qq", "qq.com");
        biMap.put("sina", "sina.cn"); //会覆盖原来的value


         /*
         在BiMap中,如果你想把键映射到已经存在的值，会抛出IllegalArgumentException异常
         如果对特定值,你想要强制替换它的键，请使用 BiMap.forcePut(key, value)
        */
//        biMap.put("tecent", "qq.com"); //抛出异常
        biMap.forcePut("tecent", "qq.com"); //强制替换Key
        log.info(String.valueOf(biMap));
        log.info(biMap.inverse().get("sina.com")); //通过value找key
        log.info(biMap.inverse().get("sina.cn"));
        log.info(String.valueOf(biMap.inverse().inverse() == biMap)); //
    }

}
