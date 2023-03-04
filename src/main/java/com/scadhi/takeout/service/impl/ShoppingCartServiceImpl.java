package com.scadhi.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scadhi.takeout.entity.ShoppingCart;
import com.scadhi.takeout.mapper.ShoppingCartMapper;
import com.scadhi.takeout.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/***
 * @title ShoppingCartServiceImpl
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-15 21:50
 **/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
