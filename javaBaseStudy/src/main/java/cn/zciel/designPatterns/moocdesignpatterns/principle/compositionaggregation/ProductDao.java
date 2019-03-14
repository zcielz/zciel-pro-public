package cn.zciel.designPatterns.moocdesignpatterns.principle.compositionaggregation;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:19
 * @Description
 */
@Slf4j
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        log.info("使用 + {} + 增加产品", conn);
    }

}
