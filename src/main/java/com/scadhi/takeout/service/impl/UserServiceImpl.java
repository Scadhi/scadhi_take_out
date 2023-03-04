package com.scadhi.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scadhi.takeout.entity.User;
import com.scadhi.takeout.mapper.UserMapper;
import com.scadhi.takeout.service.UserService;
import org.springframework.stereotype.Service;

/***
 * @title UserServiceImpl
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-15 20:42
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
