package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/***
 * @title UserMapper
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-15 20:41
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
