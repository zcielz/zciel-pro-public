package cn.zciel.chapter02.demo02;

/**
 * @author YINZHEN
 * @date 2019/2/25 15:37
 * @Description Pizza实现类
 */
public class Calzone extends Pizza {

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false;  //Default

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
