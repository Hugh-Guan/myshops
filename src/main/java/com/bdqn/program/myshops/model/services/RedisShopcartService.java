package com.bdqn.program.myshops.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisShopcartService {
    @Autowired
    private StringRedisTemplate template;

    public void mytest(){
//        template.opsForValue()
    }
}
