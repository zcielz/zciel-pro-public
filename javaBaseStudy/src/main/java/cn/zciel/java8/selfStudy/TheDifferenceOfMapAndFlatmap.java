package cn.zciel.java8.selfStudy;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author YINZHEN
 * @date 2019/3/21 16:13
 * @Description 参考：https://www.cnblogs.com/wangjing666/p/9999666.html
 */
public class TheDifferenceOfMapAndFlatmap {

    //这个实现方式是由问题的，传递给map方法的lambda为每个单词生成了一个String[](String列表)。
    // 因此，map返回的流实际上是Stream<String[]> 类型的。你真正想要的是用Stream<String>来表示一个字符串。
    @Test
    public void test01() {
        String[] words = new String[]{"hello", "world"};
        List<String[]> arr = Arrays.stream(words)
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList());
        arr.forEach(System.out::print);
    }

    //  使用flatMap方法的效果是，各个数组并不是分别映射一个流，而是映射成流的内容，
    // 所有使用map(Array::stream)时生成的单个流被合并起来，即扁平化为一个流。
    @Test
    public void test02() {
        String[] words = new String[]{"Hello", "World"};
        List<String> arr = Arrays.stream(words)
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                //.distinct()
                .collect(Collectors.toList());
        arr.forEach(System.out::print);
    }
}
