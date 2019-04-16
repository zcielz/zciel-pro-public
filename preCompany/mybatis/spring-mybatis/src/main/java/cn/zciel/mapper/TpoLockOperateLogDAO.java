package cn.zciel.mapper;

import cn.zciel.model.TpoLockOperateLog;
import cn.zciel.model.TpoLockOperateLogExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockOperateLogDAO继承基类
 */
@Repository
public interface TpoLockOperateLogDAO extends MyBatisBaseDao<TpoLockOperateLog, String, TpoLockOperateLogExample> {
}