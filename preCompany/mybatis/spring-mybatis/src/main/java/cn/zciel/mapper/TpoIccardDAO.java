package cn.zciel.mapper;

import cn.zciel.model.TpoIccard;
import cn.zciel.model.TpoIccardExample;
import org.springframework.stereotype.Repository;

/**
 * TpoIccardDAO继承基类
 */
@Repository
public interface TpoIccardDAO extends MyBatisBaseDao<TpoIccard, String, TpoIccardExample> {
}