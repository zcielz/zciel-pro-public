package cn.zciel.designPatterns.moocdesignpatterns.principle.compositionaggregation;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:21
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
