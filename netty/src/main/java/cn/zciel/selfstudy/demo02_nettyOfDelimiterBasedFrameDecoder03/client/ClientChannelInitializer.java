package cn.zciel.selfstudy.demo02_nettyOfDelimiterBasedFrameDecoder03.client;

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
 * @date 2019/3/14 19:19
 * @Description
 */
public class ClientChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        ChannelPipeline pipeline = socketChannel.pipeline();

        //服务端会接收17条消息
        //这个时候大家应该明白了为什么服务端分17次收到消息。我们在消息的每一行都加了一个”\t”,自然解码器在度消息时遇到”\t”就会认为这是一条消息的结束。
        // 用这种方式我们可以把”\t”换成任何我们自定义的字符对象。换成”\n”也是可以的。
        ByteBuf delimiter = Unpooled.copiedBuffer("\t".getBytes());
        pipeline.addLast("framer", new DelimiterBasedFrameDecoder(2048, delimiter));
        pipeline.addLast("decoder", new StringDecoder());
        pipeline.addLast("encoder", new StringEncoder());

        //客户端逻辑
        pipeline.addLast("handler", new ClientHandler());


    }
}

/**
 * 2. FixedLengthFrameDecoder使用
 * FixedLengthFrameDecoder是固定长度解码器，它能够按照指定的长度对消息进行自动解码。使用它也没有什么特别费力的事情，在ServerChannelInitializer类中添加：
 * <p>
 * pipeline.addLast(new FixedLengthFrameDecoder(23));//参数为一次接受的数据长度
 * <p>
 * 即可，同时也别忘了把刚才使用的DelimiterBasedFrameDecoder注释掉啊
 **/