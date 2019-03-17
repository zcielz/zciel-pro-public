package cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.EncodingAndDecoding;

import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.pojo.RequestData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.Charset;

/**
 * 创建Encoder和Decoder
 */
public class RequestDataEncoder extends MessageToByteEncoder<RequestData> {

    private final Charset charset = Charset.forName("UTF-8");

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, RequestData msg, ByteBuf out) throws Exception {

        out.writeInt(msg.getIntValue());
        out.writeInt(msg.getStringValue().length());
        out.writeCharSequence(msg.getStringValue(), charset);

    }
}



