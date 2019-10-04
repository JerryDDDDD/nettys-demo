package com.layman.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName NettyServer
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/9/9 11:33
 * @Version 3.0
 **/
@Component
public class NettyServer {

    // netty监听端口
    private static int NETTY_PORT = 20009;

    // 用于连接通信的线程
    private EventLoopGroup bossGroup;

    // 用于处理通信的线程
    private EventLoopGroup workerGroup;

    // 用于启动服务信道
    private ServerBootstrap serverBootstrap;

    //异步通知
    private ChannelFuture future;

    Logger logger = LoggerFactory.getLogger(NettyServer.class.getName());

    private NettyServer() {
        bossGroup = new NioEventLoopGroup();
        workerGroup = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInit());
    }


    /**    
     * @Author 叶泽文
     * @Description 启动netty server
     * @Date 15:15 2019/9/9
     * @Param []
     * @return void
     **/
    public void start() {
        logger.info("netty server start up on port: " + NETTY_PORT);
        this.future = serverBootstrap.bind(Integer.valueOf(NETTY_PORT));
    }


    /**    
     * @Author 叶泽文
     * @Description 用于单例模式返回时的 中间过渡内部类
     * @Date 15:08 2019/9/9
     * @Param 
     * @return 
     **/
    private static class SingletonInstance {
        private static final NettyServer instance = new NettyServer();
    }

    /**    
     * @Author 叶泽文
     * @Description 返回单例实例
     * @Date 15:08 2019/9/9
     * @Param []
     * @return com.layman.netty.NettyServer
     **/
    public static NettyServer getInstance() {
        return SingletonInstance.instance;
    }
}
