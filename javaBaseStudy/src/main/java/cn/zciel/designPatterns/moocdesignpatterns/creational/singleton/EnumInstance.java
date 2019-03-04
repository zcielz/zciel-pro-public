package cn.zciel.designPatterns.moocdesignpatterns.creational.singleton;

/**
 * @author YINZHEN
 * @date 2019/3/1 11:35
 * @Description
 */
public enum EnumInstance {
    INSTANCE {
        protected void printTest() {
            System.out.println("Geely Print Test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
