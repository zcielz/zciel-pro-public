package cn.zciel.selfstudy.demo01_baseNetty01.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/14 15:17
 * @Description 服务端Adapter
 */
@Slf4j
public class HelloWordServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info(ctx.channel().remoteAddress() + " === > server: " + msg.toString());
        ctx.write("received your  msg");
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        ctx.close();
    }
}
