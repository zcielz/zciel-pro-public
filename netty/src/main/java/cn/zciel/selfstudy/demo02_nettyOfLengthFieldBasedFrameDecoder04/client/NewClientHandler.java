package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.client;

import cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.Message;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author YINZHEN
 * @date 2019/3/15 9:13
 * @Description
 */
public class NewClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        String m = "hello 白小起..zz";
        Message msg = new Message((byte) 0xCA, m.length(), m);
        ctx.writeAndFlush(msg);
    }
}
