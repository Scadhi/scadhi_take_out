package com.scadhi.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scadhi.takeout.entity.OrderDetail;
import com.scadhi.takeout.mapper.OrderDetailMapper;
import com.scadhi.takeout.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}