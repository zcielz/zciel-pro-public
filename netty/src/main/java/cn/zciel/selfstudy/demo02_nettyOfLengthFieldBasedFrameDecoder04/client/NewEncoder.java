package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.client;

import cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.concurrent.EventExecutorGroup;

import java.nio.charset.Charset;

/**
 * @author YINZHEN
 * @date 2019/3/15 9:13
 * @Description
 */
public class NewEncoder extends MessageToByteEncoder<Message> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Message message, ByteBuf byteBuf) throws Exception {
        if (message == null) {
            throw new Exception("未获得消息内容");
        }

        String msgBody = message.getMsgBody();
        byte[] b = msgBody.getBytes(Charset.forName("utf-8"));
        byteBuf.writeByte(message.getType());
        byteBuf.writeByte(b.length);
        byteBuf.writeBytes(b);
    }
}
