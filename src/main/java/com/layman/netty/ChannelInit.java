package com.layman.netty;

import com.layman.handler.HeartBeatHandler;
import com.layman.handler.MyHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.SocketChannelConfig;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;
import org.springframework.stereotype.Component;

/**
 * @ClassName ChannelInit
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/9/9 11:49
 * @Version 3.0
 **/
@Component
public class ChannelInit extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        // 获取通信处理管道
        ChannelPipeline pipeline = ch.pipeline();

        // 在通信处理管道上添加默认的http协议解码器
        pipeline.addLast(new HttpServerCodec());

        // 添加对大数据流的只支持
        pipeline.addLast(new ChunkedWriteHandler());

        //对httpMessage进行聚合，聚合成FullHttpResponse/FullHttpRequest
        //几乎在netty中的编程都会用到此handler
        pipeline.addLast(new HttpObjectAggregator(1024*60));

        pipeline.addLast(new IdleStateHandler(20000, 4000, 60000));

        /***************SocketConfig*****************************/
        SocketChannelConfig socketChannelConfig = ch.config();
        // 信道写入失败时 立即关闭信道
        socketChannelConfig.setAutoClose(true);
        socketChannelConfig.isKeepAlive();
        // 设置自己缓存分配 ==> 需要实现 ByteBufAllocator 接口
        // socketChannelConfig.setAllocator();

        /********************************************************/
        //针对客户端，如果在1分钟没有向服务端发送读写心跳（ALL），则主动断开，如果是读空闲或者写空闲，不处理，20，40，60
        pipeline.addLast(new IdleStateHandler(20000 , 40000 , 60000));
        //自定义空闲状态检测(自定义心跳检测handler)
        pipeline.addLast(new HeartBeatHandler());

        //handler会处理一些繁重的复杂事件
        //会处理握手动作：handshaking(close , ping , pong)
        //对于websocket来讲，都是以frame进行传输的，不同的数据类型对应的frame也不同
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));

        //自定义handler()
        pipeline.addLast(new MyHandler());
    }
}
