package cn.zciel.mapper;

import cn.zciel.model.TpoXmxx;
import cn.zciel.model.TpoXmxxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoXmxxDAO继承基类
 */
@Repository
public interface TpoXmxxDAO extends MyBatisBaseDao<TpoXmxx, String, TpoXmxxExample> {
}