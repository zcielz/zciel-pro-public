package cn.zciel.mapper;

import cn.zciel.model.TpoZhKey;
import cn.zciel.model.TpoZhKeyExample;
import org.springframework.stereotype.Repository;

/**
 * TpoZhKeyDAO继承基类
 */
@Repository
public interface TpoZhKeyDAO extends MyBatisBaseDao<TpoZhKey, String, TpoZhKeyExample> {
}