package com.study.sbstudy.service.impl;

import com.study.sbstudy.dao.CityMapper;
import com.study.sbstudy.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityDao;

    @Override
    public City findCityByName(String name) {
        return cityDao.findByName(name);
    }
}
