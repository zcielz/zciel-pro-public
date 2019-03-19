package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.server;

import cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.Message;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author YINZHEN
 * @date 2019/3/15 8:46
 * @Description
 */
public class NewDecoder extends LengthFieldBasedFrameDecoder {

    /**
     * Message类定义了type和length，这都放在消息头部 type占1个字节，length占4个字节所以头部长度是5个字节
     */
    private static final int HEADER_SIZE = 5;
    private byte type;
    private int length;
    private String msgBody;


    public NewDecoder(int maxFrameLength, int lengthFieldOffset,
                      int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip,
                      boolean failFast) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength,
                lengthAdjustment, initialBytesToStrip, failFast);
    }

    @Override
    protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        if (in == null) {
            return null;
        }
        if (in.readableBytes() < HEADER_SIZE) {
            throw new Exception("错误消息");
        }

        /**
         * 通过远啊可以看到读的过程中
         * 每读一次读过的字节既被抛弃
         * 既指针会往前跳
         */
        type = in.readByte();

        length = in.readByte();

        if (in.readableBytes() < length) {
            throw new Exception("消息不正确");
        }

        ByteBuf buf = in.readBytes(length);
        byte[] b = new byte[buf.readableBytes()];
        buf.readBytes(b);

        msgBody = new String(b, "UTF-8");
        Message msg = new Message(type, length, msgBody);
        return msg;
    }
}
