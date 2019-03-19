package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.server;

import cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04.Message;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/15 9:06
 * @Description
 */
@Slf4j
public class NewServerHandler extends SimpleChannelInboundHandler<Object> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        if (o instanceof Message) {
            Message msg = (Message) o;
            log.info("Client-> Server:" + channelHandlerContext.channel().remoteAddress() + "send" + msg.getMsgBody());
        }

    }
}
