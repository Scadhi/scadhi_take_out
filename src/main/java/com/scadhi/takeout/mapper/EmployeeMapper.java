package com.scadhi.takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scadhi.takeout.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/***
 * @title EmployeeMapper
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-06 22:00
 **/
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
