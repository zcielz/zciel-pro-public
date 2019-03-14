package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.server;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @author YINZHEN
 * @date 2019/3/14 19:48
 * @Description
 */
public class NewServerChannelIntializer extends ChannelInitializer<SocketChannel> {
    private final int MAX_FRAME_LENGTH;
    private final int LENGTH_FIELD_LENGTH;
    private final int LENGTH_FIELD_OFFSET;
    private final int LENGTH_ADJUSTMENT;
    private final int INITIAL_BYTES_TO_STRIP;

    public NewServerChannelIntializer(int MAX_FRAME_LENGTH, int LENGTH_FIELD_LENGTH, int LENGTH_FIELD_OFFSET, int LENGTH_ADJUSTMENT, int INITIAL_BYTES_TO_STRIP) {
        this.MAX_FRAME_LENGTH = MAX_FRAME_LENGTH;
        this.LENGTH_FIELD_LENGTH = LENGTH_FIELD_LENGTH;
        this.LENGTH_FIELD_OFFSET = LENGTH_FIELD_OFFSET;
        this.LENGTH_ADJUSTMENT = LENGTH_ADJUSTMENT;
        this.INITIAL_BYTES_TO_STRIP = INITIAL_BYTES_TO_STRIP;
    }

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        //TODO
    }
}
