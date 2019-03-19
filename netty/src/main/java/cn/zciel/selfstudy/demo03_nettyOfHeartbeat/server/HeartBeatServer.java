package cn.zciel.selfstudy.demo03_nettyOfHeartbeat.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/15 9:48
 * @Description
 */
@Slf4j
public class HeartBeatServer {

    private int port;

    public HeartBeatServer(int port) {
        this.port = port;
    }

    public void start() {

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

        ServerBootstrap server = new ServerBootstrap().group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new HeartBeatServerChannelInitializer());

        try {
            ChannelFuture future = server.bind(port).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            log.info(e.getMessage(), e);
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        HeartBeatServer server = new HeartBeatServer(7788);
        server.start();
    }
}


