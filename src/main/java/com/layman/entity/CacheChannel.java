package com.layman.entity;

import io.netty.channel.ChannelHandlerContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public static Map<String, ChannelHandlerContext> clients = new HashMap<>();
}
