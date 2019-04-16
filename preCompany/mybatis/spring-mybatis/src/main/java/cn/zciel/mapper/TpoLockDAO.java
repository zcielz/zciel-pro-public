package cn.zciel.mapper;

import cn.zciel.model.TpoLock;
import cn.zciel.model.TpoLockExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockDAO继承基类
 */
@Repository
public interface TpoLockDAO extends MyBatisBaseDao<TpoLock, String, TpoLockExample> {
}