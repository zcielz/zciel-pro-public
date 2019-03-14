package cn.zciel.selfstudy.demo02_nettyOfStickyAndUnpacking02.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;


/**
 * @author YINZHEN
 * @date 2019/3/14 17:11
 * @Description
 */
public class ClientChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        ChannelPipeline pipeline = socketChannel.pipeline();

        //对于上面出现的粘包和拆包的问题，Netty已有考虑，并且有实施的方案：LineBasedFrameDecoder。
        //LineBasedFrameDecoder的工作原理是它依次遍历ByteBuf 中的可读字节，判断看是否有”\n” 或者” \r\n”，如果有，就以此位置为结束位置，
        // 从可读索引到结束位置区间的字节就组成了一行。它是以换行符为结束标志的解码器。支持携带结束符或者不携带结束符两种解码方式，同时支持配置单行的最大长度。
        // 如果连续读取到最大长度后仍然没有发现换行符，就会抛出异常，同时忽略掉之前读到的异常码流。这个对于我们确定消息最大长度的应用场景还是很有帮助。
        //要是没有”\n” 或者” \r\n”那还有什么别的方式可以判断消息是否结束呢,还有别的解码器可以帮助我们解决问题
        pipeline.addLast(new LineBasedFrameDecoder(2048));

        pipeline.addLast("decoder", new StringDecoder());
        pipeline.addLast("encoder", new StringEncoder());

        //客户端逻辑
        pipeline.addLast("handler", new BaseClientHandler());

    }
}
