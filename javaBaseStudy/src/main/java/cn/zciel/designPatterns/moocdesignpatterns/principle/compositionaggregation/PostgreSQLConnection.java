package cn.zciel.designPatterns.moocdesignpatterns.principle.compositionaggregation;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:19
 * @Description
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
