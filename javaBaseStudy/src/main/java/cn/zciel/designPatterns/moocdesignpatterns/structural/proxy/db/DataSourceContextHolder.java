package cn.zciel.designPatterns.moocdesignpatterns.structural.proxy.db;

/**
 * @author YINZHEN
 * @date 2019/3/4 19:42
 * @Description
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return (String) CONTEXT_HOLDER.get();
    }

    public static void clearType() {
        CONTEXT_HOLDER.remove();
    }
}
