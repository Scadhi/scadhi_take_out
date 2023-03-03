package com.itheima.reggie.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import javax.annotation.Resource;

//对Redis过期的key进行监听
@Slf4j
public class KeyExpiredListener extends KeyExpirationEventMessageListener {
 
    @Resource
    private RedisTemplate redisTemplate;
 
    public KeyExpiredListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }
 
    @Override
    public void onMessage(Message message, byte[] pattern) {
        //获取对应的接口的访问次数
        log.info("{}接口在规定时间内被访问{}次",message,redisTemplate.opsForValue().get(message.toString()+":count"));
        //将对应接口的访问数据的key进行删除
        redisTemplate.delete(message.toString()+":count");
    }
}