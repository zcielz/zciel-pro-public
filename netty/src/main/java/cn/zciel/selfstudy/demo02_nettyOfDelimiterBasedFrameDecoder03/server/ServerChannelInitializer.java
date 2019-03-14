package cn.zciel.selfstudy.demo02_nettyOfDelimiterBasedFrameDecoder03.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;


/**
 * @author YINZHEN
 * @date 2019/3/14 18:42
 * @Description
 */
public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        ByteBuf delimiter = Unpooled.copiedBuffer("\t".getBytes());
        pipeline.addLast("framer", new DelimiterBasedFrameDecoder(2048, delimiter));

        //字符串解码和编码
        pipeline.addLast("decode", new StringDecoder());
        pipeline.addLast("encode", new StringEncoder());

        //自己的逻辑Handler
        pipeline.addLast("handler", new ServerHandler());

    }
}
