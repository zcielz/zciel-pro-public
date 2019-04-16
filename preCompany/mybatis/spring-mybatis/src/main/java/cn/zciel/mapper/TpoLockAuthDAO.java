package cn.zciel.mapper;

import cn.zciel.model.TpoLockAuth;
import cn.zciel.model.TpoLockAuthExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockAuthDAO继承基类
 */
@Repository
public interface TpoLockAuthDAO extends MyBatisBaseDao<TpoLockAuth, String, TpoLockAuthExample> {
}