package cn.zciel.mapper;

import cn.zciel.model.TpoDyxx;
import cn.zciel.model.TpoDyxxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoDyxxDAO继承基类
 */
@Repository
public interface TpoDyxxDAO extends MyBatisBaseDao<TpoDyxx, String, TpoDyxxExample> {
}