package com.scadhi.takeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scadhi.takeout.dto.SetmealDto;
import com.scadhi.takeout.entity.Setmeal;

import java.util.List;

/***
 * @title SetmealService
 * @description TODO
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-08 21:47
 **/
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，及菜品的关联
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    /**
     * 修改套餐前查询套餐信息
     * @param id
     * @return
     */
    public SetmealDto getByIdWithDish(Long id);

    /**
     * 修改套餐
     * @param setmealDto
     */
    public void updateWithDish(SetmealDto setmealDto);

}
