package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * @author YINZHEN
 * @date 2019/3/14 19:43
 * @Description 服务端
 */
@Slf4j
public class NewServer {

    //消息体的总长度
    private static final int MAX_FRAME_LENGTH = 1024 * 1024;
    //Message类中的length的长度，int占4位
    private static final int LENGTH_FIELD_LENGTH = 4;
    //偏移多少位之后才是我们的消息体，因为我们消息头只有type一个参数，byte类型占1，所有是1
    private static final int LENGTH_FIELD_OFFSET = 1;
    //改字段加长度等于数据帧的长度，一般数据帧长度都是这样定义的(即我们在设置Message中的length属性)，加入你的消息体是20位，再加上
    //LENGTH_FIELD_LENGTH就是24位，所以在此处为了正确的解析出消息体，需要偏移4位才能解析出消息体的正确位置，我们在发送的消息里面设置的就是消息体本身的长度，所以无需偏移。
    private static final int LENGTH_ADJUSTMENT = 0;
    // 这里我们不需要跳过数据帧中的字节数，因为我们的消息体和长度分别发送的
    private static final int INITIAL_BYTES_TO_STRIP = 0;

    private int port;

    public NewServer(int port) {
        this.port = port;
    }

    public void start() {

        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {

            ServerBootstrap sbs = new ServerBootstrap()
                    .group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .localAddress(new InetSocketAddress(port))
                    .childHandler(new NewServerChannelIntializer(MAX_FRAME_LENGTH, LENGTH_FIELD_LENGTH, LENGTH_FIELD_OFFSET, LENGTH_ADJUSTMENT, INITIAL_BYTES_TO_STRIP))
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture future = sbs.bind(port).sync();
            log.info("Server start listen at" + port);
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            log.info(e.getMessage(), e);
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        NewServer server = new NewServer(7788);
        server.start();
    }
}
