package cn.zciel.selfstudy.demo02_nettyOfDelimiterBasedFrameDecoder03.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/14 18:37
 * @Description DelimiterBasedFrameDecoder使用
 */
@Slf4j
public class HelloWordServer {

    /**
     * 上一节我们说了LineBasedframeDecoder来解决粘包拆包的问题，TCP以流的方式进行数据传输，上层应用协议为了对消息进行区分，一般采用如下4种方式：
     * <p>
     * 消息长度固定，累计读取到消息长度总和为定长Len的报文之后即认为是读取到了一个完整的消息。计数器归位，重新读取。
     * 将回车换行符作为消息结束符。
     * 将特殊的分隔符作为消息分隔符，回车换行符是他的一种。
     * 通过在消息头定义长度字段来标识消息总长度。
     * LineBasedframeDecoder属于第二种，今天我们要说的DelimiterBasedFrameDecoder和FixedLengthFrameDecoder属于第三种和第一种。DelimiterBasedFrameDecoder用来解决以特殊符号作为消息结束符的粘包问题，FixedLengthFrameDecoder用来解决定长消息的粘包问题。下面首先来用DelimiterBasedFrameDecoder来写一个例子，我们看一下效果然后接着分析用法。
     */
    private int port;

    public HelloWordServer(int port) {
        this.port = port;
    }

    public void start() {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

        ServerBootstrap server = new ServerBootstrap().group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ServerChannelInitializer());

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
        HelloWordServer server = new HelloWordServer(7788);
        server.start();
    }
}
