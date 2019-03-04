package cn.zciel.effectiveJava.bookSecondEdition.chapter02.demo02;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/2/25 15:44
 * @Description
 */
@Slf4j
public class Demo02 {

    public static void main(String[] args) {

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ORION).build();

        Calzone calzon = new Calzone.Builder().addTopping(Pizza.Topping.HAM)
                .sauceInside().build();

        log.info("断点");

    }
}
