package cn.zciel.mapper;

import cn.zciel.model.TpoLockOpener;
import cn.zciel.model.TpoLockOpenerExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockOpenerDAO继承基类
 */
@Repository
public interface TpoLockOpenerDAO extends MyBatisBaseDao<TpoLockOpener, String, TpoLockOpenerExample> {
}