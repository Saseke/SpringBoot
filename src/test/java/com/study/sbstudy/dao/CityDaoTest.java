package com.study.sbstudy.dao;

import com.study.sbstudy.domain.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CityDaoTest {

    private static final Logger logger = LoggerFactory.getLogger(CityDaoTest.class);
    @Autowired
    private CityMapper cityDao;
    @Test
    public void findByName() throws Exception {
        City city = cityDao.findByName("demo");
        logger.info("--------------------------------------------------------"+city.getName()+"------------------------------------");
    }

}