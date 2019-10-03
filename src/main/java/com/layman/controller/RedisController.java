package com.layman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RedisController
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/3 4:03
 * @Version 3.0
 **/
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/send")
    public String send() {
        redisTemplate.convertAndSend("testSend", "123");
        return "ok";
    }
}
