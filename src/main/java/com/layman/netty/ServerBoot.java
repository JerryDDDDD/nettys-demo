package com.layman.netty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @ClassName ServerBoot
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/9/9 11:20
 * @Version 3.0
 **/
@Component
public class ServerBoot implements ApplicationListener<ContextRefreshedEvent> {

    Logger logger = LoggerFactory.getLogger(ServerBoot.class.getName());

    @Value("${netty.port}")
    private String NETTY_PORT;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        logger.info("on application context refreshed: " + NETTY_PORT);
        NettyServer.getInstance().start();
    }
}
