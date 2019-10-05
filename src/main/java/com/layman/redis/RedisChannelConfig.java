package com.layman.redis;

import com.layman.receive.MessageReceive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * @ClassName RedisChannelConfig
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/9/29 16:10
 * @Version 3.0
 **/
@Configuration
public class RedisChannelConfig {

    @Value("${redis.message.topic}")
    private String redisSendTopic;

    Logger logger = LoggerFactory.getLogger(RedisChannelConfig.class.getName());

    @Bean
    RedisMessageListenerContainer container (RedisConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        logger.info("===========>" + redisSendTopic);
        container.addMessageListener(listenerAdapter, new PatternTopic(redisSendTopic));
        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(MessageReceive receive) {
        return new MessageListenerAdapter(receive, "receiveMessage");
    }
}
