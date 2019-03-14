package cn.zciel.selfstudy.demo01_baseNetty01.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author YINZHEN
 * @date 2019/3/14 15:12
 * @Description 服务端的ChannelInitializer
 */
public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline channelPipeline = socketChannel.pipeline();

        //字符串解码和编码
        channelPipeline.addLast("decoder", new StringDecoder());
        channelPipeline.addLast("encoder", new StringEncoder());

        //自己的逻辑handler
        channelPipeline.addLast("handler", new HelloWordServerHandler());

    }
}
