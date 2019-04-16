package cn.zciel.mapper;

import cn.zciel.model.TpoLockApiLog;
import cn.zciel.model.TpoLockApiLogExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockApiLogDAO继承基类
 */
@Repository
public interface TpoLockApiLogDAO extends MyBatisBaseDao<TpoLockApiLog, String, TpoLockApiLogExample> {
}