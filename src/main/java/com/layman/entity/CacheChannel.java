package com.layman.entity;

import io.netty.channel.ChannelHandlerContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CacheChannel
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/4 12:15
 * @Version 3.0
 **/
public class CacheChannel {
//    public static List<ChannelHandlerContext> clients = new ArrayList<>();

    public static final Map<String, ChannelHandlerContext> clients = new HashMap<>();


    // 用于存储公司信道的map
    public static final Map<String, ChannelHandlerContext> companyChannelMap = new HashMap<>();

    // 用于存储前台用户信道的map
    public static final Map<String, ChannelHandlerContext> userChannelMap = new HashMap<>();

    // 用于存储平台后台的map
    public static final Map<String, ChannelHandlerContext> adminChannelMap = new HashMap<>();
}
