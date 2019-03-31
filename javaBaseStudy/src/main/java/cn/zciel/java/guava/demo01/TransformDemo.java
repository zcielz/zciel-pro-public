package cn.zciel.java.guava.demo01;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.testng.collections.Sets;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Set;

/**
 * @author zciel
 * @date 2019/3/31 14:03
 * @Description transform() 类型转换
 */
@Slf4j
public class TransformDemo {

    public static void main(String[] args) {

        Set<Long> times = Sets.newHashSet();
        times.add(91299990701L);
        times.add(9320001010L);
        times.add(9920170621L);
        Collection<String> timeStrCol = Collections2.transform(times, new Function<Long, String>() {
            @Nullable
            @Override
            public String apply(@Nullable Long input) {
                return new SimpleDateFormat("yyyy-MM-dd").format(input);
            }
        });
        log.info(String.valueOf(timeStrCol));

    }
}
