package cn.zciel.designPatterns.moocdesignpatterns.structural.proxy.staticproxy;

import cn.zciel.designPatterns.moocdesignpatterns.structural.proxy.IOrderService;
import cn.zciel.designPatterns.moocdesignpatterns.structural.proxy.Order;
import cn.zciel.designPatterns.moocdesignpatterns.structural.proxy.OrderServiceImpl;
import cn.zciel.designPatterns.moocdesignpatterns.structural.proxy.db.DataSourceContextHolder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 19:37
 * @Description
 */
@Slf4j
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        log.info("静态代理分配到[db" + dbRouter + "]处理数据");

        //设置datasource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        log.info("静态代理 before code");
    }

    private void afterMethod() {
        log.info("静态代理 after code");
    }

}
