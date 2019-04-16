package cn.zciel.mapper;

import cn.zciel.model.TpoZjmx;
import cn.zciel.model.TpoZjmxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoZjmxDAO继承基类
 */
@Repository
public interface TpoZjmxDAO extends MyBatisBaseDao<TpoZjmx, String, TpoZjmxExample> {
}