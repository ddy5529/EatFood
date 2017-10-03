package com.ddy.EatFood.Dao;

import org.apache.ibatis.annotations.Param;

public interface SearchDao {

    public String get(@Param("name") String name);
}
