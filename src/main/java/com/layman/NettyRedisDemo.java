package com.layman;

import com.layman.utils.ContextUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName NettyRedisDemo
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/3 3:53
 * @Version 3.0
 **/
@SpringBootApplication
public class NettyRedisDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NettyRedisDemo.class, args);
        ContextUtils.setApplicationContext(applicationContext);
    }
}
