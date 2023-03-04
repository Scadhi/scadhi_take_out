package com.scadhi.takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scadhi.takeout.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/***
 * @title DishMapper
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-08 21:45
 **/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
