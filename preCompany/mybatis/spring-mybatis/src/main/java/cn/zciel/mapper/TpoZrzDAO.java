package cn.zciel.mapper;

import cn.zciel.model.TpoZrz;
import cn.zciel.model.TpoZrzExample;
import org.springframework.stereotype.Repository;

/**
 * TpoZrzDAO继承基类
 */
@Repository
public interface TpoZrzDAO extends MyBatisBaseDao<TpoZrz, String, TpoZrzExample> {
}