package cn.zciel.designPatterns.moocdesignpatterns.creational.singleton;


import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YINZHEN
 * @date 2019/3/1 11:30
 * @Description
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsValue(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
