package cn.zciel.selfstudy.demo01_baseNetty02.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author YINZHEN
 * @date 2019/3/14 16:17
 * @Description 客户端 ClientChannelInitializer
 */
public class ClientChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        pipeline.addLast("decoder", new StringDecoder());
        pipeline.addLast("encoder", new StringEncoder());

        //客户端的handler
        //先调用hander在ChannelActive方法中调用fireChannelActive会激活handler1
        pipeline.addLast("handler", new HWClientHandler());
        pipeline.addLast("handler1", new BaseClientHandler());
    }
}
