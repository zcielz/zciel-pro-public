package cn.zciel.mapper;

import cn.zciel.model.TpoKfmx;
import cn.zciel.model.TpoKfmxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoKfmxDAO继承基类
 */
@Repository
public interface TpoKfmxDAO extends MyBatisBaseDao<TpoKfmx, String, TpoKfmxExample> {
}