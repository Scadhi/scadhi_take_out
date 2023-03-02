package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/***
 * @title CategoryService
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-08 21:12
 **/
public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
