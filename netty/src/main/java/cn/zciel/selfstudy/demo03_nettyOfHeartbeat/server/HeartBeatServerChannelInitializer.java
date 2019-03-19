package cn.zciel.selfstudy.demo03_nettyOfHeartbeat.server;

import ch.qos.logback.core.util.TimeUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;


/**
 * @author YINZHEN
 * @date 2019/3/15 9:52
 * @Description
 */
public class HeartBeatServerChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        pipeline.addLast("header", new IdleStateHandler(3, 0, 0, TimeUnit.SECONDS));
        pipeline.addLast("decoder", new StringDecoder());
        pipeline.addLast("encoder", new StringEncoder());
        pipeline.addLast(new HeartBeatServerHandler());
    }
}
