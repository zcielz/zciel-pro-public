package cn.zciel.mapper;

import cn.zciel.model.TpoFyzt;
import cn.zciel.model.TpoFyztExample;
import org.springframework.stereotype.Repository;

/**
 * TpoFyztDAO继承基类
 */
@Repository
public interface TpoFyztDAO extends MyBatisBaseDao<TpoFyzt, String, TpoFyztExample> {
}