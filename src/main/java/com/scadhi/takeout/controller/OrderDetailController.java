package com.scadhi.takeout.controller;

import com.scadhi.takeout.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @title OrderDetailController
 * @description TODO 订单明细
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-15 22:34
 **/
@Slf4j
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

}
