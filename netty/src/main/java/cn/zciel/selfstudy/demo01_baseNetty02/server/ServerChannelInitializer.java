package cn.zciel.selfstudy.demo01_baseNetty02.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author YINZHEN
 * @date 2019/3/14 16:35
 * @Description 服务端ServerChannelInitializer
 */
public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        //字符串编码和解码
        pipeline.addLast("decoder", new StringDecoder());
        pipeline.addLast("encoder", new StringEncoder());

        //自己的逻辑Handler
        pipeline.addLast("handler", new HWServerHandler());
    }
}
