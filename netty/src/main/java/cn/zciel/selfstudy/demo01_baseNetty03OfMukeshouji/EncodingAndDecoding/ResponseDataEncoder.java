package cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.EncodingAndDecoding;

import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.pojo.ResponseData;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ResponseDataEncoder extends MessageToByteEncoder<ResponseData> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, ResponseData msg, ByteBuf out) throws Exception {
        out.writeInt(msg.getIntValue());
    }
}
