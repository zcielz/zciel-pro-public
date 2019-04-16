package cn.zciel.mapper;

import cn.zciel.model.TpoHtxx;
import cn.zciel.model.TpoHtxxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoHtxxDAO继承基类
 */
@Repository
public interface TpoHtxxDAO extends MyBatisBaseDao<TpoHtxx, String, TpoHtxxExample> {
}