package cn.zciel.effectiveJava.bookSecondEdition.chapter02.demo02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author YINZHEN
 * @date 2019/2/25 14:30
 * @Description builder模式类层次结构
 */
public abstract class Pizza {

    public enum Topping {HAM, MUSHROOTM, ORION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        //Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); //这里为什么加clone
    }


}
