package cn.zciel.mapper;

import cn.zciel.model.TpoFyxx;
import cn.zciel.model.TpoFyxxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoFyxxDAO继承基类
 */
@Repository
public interface TpoFyxxDAO extends MyBatisBaseDao<TpoFyxx, String, TpoFyxxExample> {
}