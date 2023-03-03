package com.itheima.reggie.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//统计接口的耗时以及再规定事件内的访问次数，作用域为方法上
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TakeCount {
 
    //表示统计接口次数的时间，默认为60秒
    int time() default 60;
 
}