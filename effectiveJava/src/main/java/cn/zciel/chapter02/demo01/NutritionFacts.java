package cn.zciel.chapter02.demo01;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/2/25 11:39
 * @Description builder模式
 * 原来通过构造方法的方式，不仅值多少传递有限制，而且如果相同数量无法重载
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    //寻找一种可伸缩,可选参数的方案
    //javaBeans模式本身有严重的缺陷，由于构造方法在多次调用中被分割，所以构造构造过程中JavaBean可能处于不一致的状态。
    /**
     * 线程A: 获取person,对其name age sex 就行set操作
     * 同样线程B: 获取person,对其进行get操作
     * 这时候会出现一种情况,在线程A中没有set完毕,线程B 就开始取相应的属性
     *
     * 那么就会造成javabean出于不一致的状态;随之相关就是线程安全的问题,
     * 所以javabean作为数据的一个填充,姚进行必要的保护性拷贝(这里不做解释)
     */
    /**
     * 在建造者模式中,提供一个辅助的静态建造器builder,可以在里面set Person的属性,与javaBean不同的是,建造者是先set,
     * 在通过build实例化person,这样既可以提高代码的阅读性,也可以防止对象没有实例化,就被调用;不会造成不一致性,
     * 同时解决了javabean模式的线程安全问题;
     */
    public static class Builder {
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }


    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

}


