package cn.zciel.mapper;

import cn.zciel.model.TpoLockOpenLog;
import cn.zciel.model.TpoLockOpenLogExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockOpenLogDAO继承基类
 */
@Repository
public interface TpoLockOpenLogDAO extends MyBatisBaseDao<TpoLockOpenLog, String, TpoLockOpenLogExample> {
}