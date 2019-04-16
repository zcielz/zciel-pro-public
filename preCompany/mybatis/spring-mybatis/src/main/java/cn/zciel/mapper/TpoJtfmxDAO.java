package cn.zciel.mapper;

import cn.zciel.model.TpoJtfmx;
import cn.zciel.model.TpoJtfmxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoJtfmxDAO继承基类
 */
@Repository
public interface TpoJtfmxDAO extends MyBatisBaseDao<TpoJtfmx, String, TpoJtfmxExample> {
}