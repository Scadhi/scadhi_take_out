package com.scadhi.takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scadhi.takeout.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/***
 * @title CategoryMapper
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-08 21:12
 **/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
