package cn.zciel.mapper;

import cn.zciel.model.TpoDoor;
import cn.zciel.model.TpoDoorExample;
import org.springframework.stereotype.Repository;

/**
 * TpoDoorDAO继承基类
 */
@Repository
public interface TpoDoorDAO extends MyBatisBaseDao<TpoDoor, String, TpoDoorExample> {
}