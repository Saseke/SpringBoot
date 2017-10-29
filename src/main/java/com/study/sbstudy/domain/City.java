package com.study.sbstudy.domain;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;

/**
 * 城市实体类
 *
 */
public class City implements Serializable {

    /**
     * 城市的id
     */
    private int id;
    /**
     * 城市的名字
     */
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
