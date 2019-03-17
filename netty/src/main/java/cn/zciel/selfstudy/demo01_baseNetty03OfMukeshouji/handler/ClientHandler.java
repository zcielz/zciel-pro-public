package cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.handler;

import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.pojo.RequestData;
import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.pojo.ResponseData;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        RequestData msg = new RequestData();
        msg.setIntValue(123);
        msg.setStringValue("正常工作");
        ChannelFuture future = ctx.writeAndFlush(msg);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info(String.valueOf((ResponseData) msg));
        ctx.close();
    }
}
