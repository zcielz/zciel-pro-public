package cn.zciel.mapper;

import cn.zciel.model.TpoLockPassword;
import cn.zciel.model.TpoLockPasswordExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockPasswordDAO继承基类
 */
@Repository
public interface TpoLockPasswordDAO extends MyBatisBaseDao<TpoLockPassword, String, TpoLockPasswordExample> {
}