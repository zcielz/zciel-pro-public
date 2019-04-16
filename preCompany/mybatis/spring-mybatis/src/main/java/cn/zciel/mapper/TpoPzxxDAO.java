package cn.zciel.mapper;

import cn.zciel.model.TpoPzxx;
import cn.zciel.model.TpoPzxxExample;
import org.springframework.stereotype.Repository;

/**
 * TpoPzxxDAO继承基类
 */
@Repository
public interface TpoPzxxDAO extends MyBatisBaseDao<TpoPzxx, String, TpoPzxxExample> {
}