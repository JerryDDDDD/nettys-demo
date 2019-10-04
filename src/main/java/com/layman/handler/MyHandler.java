package com.layman.handler;

import com.layman.entity.CacheChannel;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyHandler
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/9/9 17:05
 * @Version 3.0
 **/
public class MyHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    Logger logger = LoggerFactory.getLogger(MyHandler.class.getName());

    @Override
    public boolean acceptInboundMessage(Object msg) throws Exception {

        return super.acceptInboundMessage(msg);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        // 1. 获取客户端Channel
        Channel currentChannel = ctx.channel();
        logger.info("socket message =======>" + msg.text());
        for (ChannelHandlerContext client : CacheChannel.clients) {
            client.writeAndFlush(new TextWebSocketFrame("return for ==>" + msg.text()));
        }
    }




//    /**
//     * @Author 叶泽文
//     * @Description 新建连接时触发执行
//     * @Date 15:33 2019/9/10
//     * @Param [ctx]
//     * @return void
//     **/
//    @Override
//    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
//        CacheChannel.clients.add(ctx);
//    }

}
