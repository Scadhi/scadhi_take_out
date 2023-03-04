package com.scadhi.takeout.common;


/***
 * @title CustomException
 * @description TODO 自定义业务异常
 * @author Skadhi
 * @version 1.0.0
 * @create 2022-11-08 22:02
 **/
public class CustomException extends RuntimeException{

    public CustomException(String message) {
        super(message);
    }

}
