package cn.zciel.mapper;

import cn.zciel.model.TpoZhxx;
import cn.zciel.model.TpoZhxxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoZhxxDAO继承基类
 */
@Repository
public interface TpoZhxxDAO extends MyBatisBaseDao<TpoZhxx, String, TpoZhxxExample> {
}