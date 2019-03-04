package cn.zciel.designPatterns.moocdesignpatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 19:40
 * @Description
 */
@Slf4j
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        log.info("service层调用dao层添加order");
        return iOrderDao.insert(order);
    }
}
