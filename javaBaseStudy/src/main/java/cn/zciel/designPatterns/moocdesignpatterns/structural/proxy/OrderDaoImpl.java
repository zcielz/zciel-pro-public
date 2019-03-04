package cn.zciel.designPatterns.moocdesignpatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 19:35
 * @Description
 */
@Slf4j
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        log.info("Dao添加成功");
        return 1;
    }
}
