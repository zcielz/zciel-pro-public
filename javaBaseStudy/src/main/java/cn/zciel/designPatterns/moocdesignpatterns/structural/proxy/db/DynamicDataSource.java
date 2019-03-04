package cn.zciel.designPatterns.moocdesignpatterns.structural.proxy.db;

import javax.sql.DataSource;

/**
 * @author YINZHEN
 * @date 2019/3/4 19:42
 * @Description
 */
public class DynamicDataSource { //extends AbstractRoutingDataSource
    public Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
