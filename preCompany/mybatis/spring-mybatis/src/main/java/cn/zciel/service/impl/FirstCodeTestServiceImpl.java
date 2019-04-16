package cn.zciel.service.impl;

import cn.zciel.mapper.TpoDoorDAO;
import cn.zciel.model.TpoDoor;
import cn.zciel.model.TpoDoorExample;
import cn.zciel.service.FirstCodeTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zciel
 * @date 2019/4/14 18:07
 * @Description 测试实现
 */
@Slf4j
@Service
public class FirstCodeTestServiceImpl implements FirstCodeTestService {

    /*@Autowired
    private TpoDoorDAO tpoDoorDAO;*/

    @Autowired
    TpoDoorDAO tpoDoorDAO;

    /**
     * 查找所有的门
     *
     * @return
     */
    @Override
    public List<TpoDoor> findTpoDoor() {
        TpoDoorExample example = new TpoDoorExample();


        tpoDoorDAO.selectByExample(example);
        List<TpoDoor> list = null;
        return list;
    }
}
