package com.scadhi.takeout.common;

/***
 * @title BaseContext
 * @description TODO 基于ThreadLocal封装的工具类，用户保存和获取当前用户id
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-08 20:50
 **/

public class BaseContext {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

}
