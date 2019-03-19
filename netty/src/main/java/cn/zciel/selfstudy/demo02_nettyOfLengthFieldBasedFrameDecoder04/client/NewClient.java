package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoop;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/15 9:08
 * @Description
 */
@Slf4j
public class NewClient {

    private int port;
    private String address;

    public NewClient(int port, String address) {
        this.port = port;
        this.address = address;
    }

    public void start() {
        EventLoopGroup group = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new NewClientChannlInitializer());

        ChannelFuture future = null;
        try {
            future = bootstrap.connect(address, port).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            log.info(e.getMessage(), e);
        } finally {
            group.shutdownGracefully();
        }
    }

    //TODO 感觉有问题 需要重新看
    public static void main(String[] args) {
        NewClient client = new NewClient(7788, "127.0.0.1");
        client.start();
    }
}
