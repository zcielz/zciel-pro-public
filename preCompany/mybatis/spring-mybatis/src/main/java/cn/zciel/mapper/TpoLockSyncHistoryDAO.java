package cn.zciel.mapper;

import cn.zciel.model.TpoLockSyncHistory;
import cn.zciel.model.TpoLockSyncHistoryExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockSyncHistoryDAO继承基类
 */
@Repository
public interface TpoLockSyncHistoryDAO extends MyBatisBaseDao<TpoLockSyncHistory, String, TpoLockSyncHistoryExample> {
}