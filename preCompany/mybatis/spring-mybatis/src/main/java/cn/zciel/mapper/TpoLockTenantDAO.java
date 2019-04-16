package cn.zciel.mapper;

import cn.zciel.model.TpoLockTenant;
import cn.zciel.model.TpoLockTenantExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockTenantDAO继承基类
 */
@Repository
public interface TpoLockTenantDAO extends MyBatisBaseDao<TpoLockTenant, String, TpoLockTenantExample> {
}