package cn.zciel.springjpa.service.impl;

import cn.zciel.springjpa.module.TpoFyxx;
import cn.zciel.springjpa.repository.TpoFyxxRepository;
import cn.zciel.springjpa.service.TpoFyxxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zciel
 * @date 2019/4/14 19:23
 * @Description
 */
@Slf4j
@Service
public class TpoFyxxServiceImpl implements TpoFyxxService {

    @Resource
    private TpoFyxxRepository tpoFyxxRepository;

    @Override
    public List<TpoFyxx> findAll() {
        List<TpoFyxx> all = (List<TpoFyxx>) this.tpoFyxxRepository.findAll();
        return all;
    }
}
