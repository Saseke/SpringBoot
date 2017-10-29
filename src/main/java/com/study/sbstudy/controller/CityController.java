package com.study.sbstudy.controller;

import com.study.sbstudy.domain.City;
import com.study.sbstudy.service.impl.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 */
@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping(value = "/city")
    public City findOneCIty(@RequestParam(value = "name", required = true) String name) {
        return cityService.findCityByName(name);
    }
}
