package cn.zciel.java.guava.demo01;

import com.google.common.collect.Collections2;
import lombok.extern.slf4j.Slf4j;
import org.testng.collections.Lists;

import java.util.Collection;
import java.util.List;

/**
 * @author zciel
 * @date 2019/3/31 13:56
 * @Description filter（）：只保留集合中满足特定要求的元素
 */
@Slf4j
public class FilterDemo {

    public static void main(String[] args) {
        List<String> list1 = Lists.newArrayList("moon", "dad", "refer", "son");
       /* List<String> list2 = Arrays.asList("moon", "dad", "refer", "son");
        log.info(String.valueOf(list1.equals(list2)));
        */
        Collection<String> palindromeList = Collections2.filter(list1,
                input -> {
                    return new StringBuffer(input).reverse().toString().equals(input); //找回文串
                });
        log.info(String.valueOf(palindromeList));
    }
}
