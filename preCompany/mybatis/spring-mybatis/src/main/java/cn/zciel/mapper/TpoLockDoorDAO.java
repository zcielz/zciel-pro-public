package cn.zciel.mapper;

import cn.zciel.model.TpoLockDoor;
import cn.zciel.model.TpoLockDoorExample;
import org.springframework.stereotype.Repository;

/**
 * TpoLockDoorDAO继承基类
 */
@Repository
public interface TpoLockDoorDAO extends MyBatisBaseDao<TpoLockDoor, String, TpoLockDoorExample> {
}