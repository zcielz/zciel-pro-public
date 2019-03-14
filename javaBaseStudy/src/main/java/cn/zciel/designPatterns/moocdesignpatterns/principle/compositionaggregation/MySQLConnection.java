package cn.zciel.designPatterns.moocdesignpatterns.principle.compositionaggregation;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:18
 * @Description
 */
public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "mysql数据库连接";
    }
}
