package com.layman.redis;

import com.layman.entity.CpwMessage;
import com.layman.utils.ContextUtils;
import com.layman.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName RedisUtil
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/5 12:23
 * @Version 3.0
 **/
public class RedisUtil {

    private StringRedisTemplate stringRedisTemplate = ContextUtils.getBean(StringRedisTemplate.class);

    private static String redisSendTopic = "RedisMessageSend";

//    @Value("${redis.message.topic}")
//    private String redisSendTopic;

    public void redisMessageSend(CpwMessage cpwMessage) {
        String s = JsonUtils.objectToJson(cpwMessage);
        stringRedisTemplate.convertAndSend(redisSendTopic,JsonUtils.objectToJson(cpwMessage));
    }
}
