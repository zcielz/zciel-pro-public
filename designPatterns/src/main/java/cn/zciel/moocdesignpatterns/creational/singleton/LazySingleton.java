package cn.zciel.moocdesignpatterns.creational.singleton;

/**
 * @author YINZHEN
 * @date 2019/3/1 12:21
 * @Description
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
