package cn.zciel.selfstudy.demo03_nettyOfHeartbeat.server;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.concurrent.EventExecutorGroup;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/15 9:59
 * @Description
 */
@Slf4j
public class HeartBeatServerHandler extends ChannelInboundHandlerAdapter {

    private int loss_connect_time = 0;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info(ctx.channel().remoteAddress() + "Server:" + msg.toString());
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            //服务端对应着读时间，当前READER_IDLE时触发
            IdleStateEvent event = (IdleStateEvent) evt;
            if (event.state() == IdleState.READER_IDLE) {
                loss_connect_time++;
                log.info("接收消息超时");
                if (loss_connect_time > 2) {
                    log.info("关闭不活动的链接");
                    ctx.channel().close();
                }
            } else {
                super.userEventTriggered(ctx, evt);
            }
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
