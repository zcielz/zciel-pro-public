package cn.zciel.chapter02.demo01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/2/25 11:37
 * @Description Using builder mode when there are too many constructor arguments
 */
@Slf4j
public class Demo01 {

    public static void main(String[] args) {

        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).build();
        log.info(cocaCola.toString());
    }
}
