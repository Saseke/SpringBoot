package com.study.sbstudy.service.impl;

import com.study.sbstudy.domain.City;

/**
 * 城市业务逻辑类
 */
public interface CityService {
    /**
     * 通过城市名称查找城市信息
     * @param name
     * @return
     */
    City findCityByName(String name);
}
