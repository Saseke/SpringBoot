package com.study.sbstudy.dao;

import com.study.sbstudy.domain.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 城市Dao接口类
 */
@Repository
public interface CityMapper {

    City findByName(String name);
}
