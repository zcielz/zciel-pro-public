package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

/**
 * @author YINZHEN
 * @date 2019/3/15 9:11
 * @Description
 */
public class NewClientChannlInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        pipeline.addLast(new NewEncoder());
        pipeline.addLast(new NewClientHandler());
    }
}
