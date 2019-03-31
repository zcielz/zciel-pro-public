package cn.zciel.java.guava.demo01;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import lombok.extern.slf4j.Slf4j;
import org.testng.collections.Lists;

import java.util.Collection;
import java.util.List;

/**
 * @author zciel
 * @date 2019/3/31 14:05
 * @Description 多个Function组合
 */
@Slf4j
public class TransformDemo1 {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList("abcde", "good", "happiness");

        //确保容器中的字符串长度不超过5
        Function<String, String> f1 = new Function<String, String>() {

            @Override
            public String apply(String input) {
                return input.length() > 5 ? input.substring(0, 5) : input;
            }
        };

        //转成大写
        Function<String, String> f2 = new Function<String, String>() {

            @Override
            public String apply(String input) {
                return input.toUpperCase();
            }
        };

        Function<String, String> function = (Function<String, String>) Functions.compose(f2, f1);
        Collection<String> results = Collections2.transform(list, function);
        log.info(String.valueOf(results));

    }
}
