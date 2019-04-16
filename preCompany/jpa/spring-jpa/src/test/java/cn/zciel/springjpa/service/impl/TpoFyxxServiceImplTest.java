package cn.zciel.springjpa.service.impl;

import cn.zciel.springjpa.module.TpoFyxx;
import cn.zciel.springjpa.service.TpoFyxxService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TpoFyxxServiceImplTest {

    @Resource
    TpoFyxxService tpoFyxxService;

    @Test
    public void findAll() {
        List<TpoFyxx> all = tpoFyxxService.findAll();
        log.info(String.valueOf(all));

    }
}