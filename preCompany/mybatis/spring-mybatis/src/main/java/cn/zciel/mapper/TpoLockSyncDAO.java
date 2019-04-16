package cn.zciel.mapper;

import cn.zciel.model.TpoLockSync;
import cn.zciel.model.TpoLockSyncExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockSyncDAO继承基类
 */
@Repository
public interface TpoLockSyncDAO extends MyBatisBaseDao<TpoLockSync, String, TpoLockSyncExample> {
}