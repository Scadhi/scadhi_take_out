package com.scadhi.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scadhi.takeout.entity.Employee;
import com.scadhi.takeout.mapper.EmployeeMapper;
import com.scadhi.takeout.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/***
 * @title EmployeeServiceImpl
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-06 22:01
 **/
@Service
@Slf4j
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
