package cn.zciel.selfstudy.demo03_nettyOfHeartbeat.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/15 10:54
 * @Description
 */
@Slf4j
public class HeartBeatsClient {

    private int port;
    private String address;

    public HeartBeatsClient(int port, String address) {
        this.port = port;
        this.address = address;
    }

    public void start() {
        EventLoopGroup group = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new HeartBeatsClientChannelInitializer());

        try {
            ChannelFuture future = bootstrap.connect(address, port).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            log.info(e.getMessage(), e);
        } finally {
            group.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        HeartBeatsClient client = new HeartBeatsClient(7788, "127.0.0.1");
        client.start();
    }

}
