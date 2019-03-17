package cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.handler;

import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.pojo.RequestData;
import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.pojo.ResponseData;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProcessingHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        RequestData requestData = (RequestData) msg;
        ResponseData responseData = new ResponseData();
        responseData.setIntValue(requestData.getIntValue() * 2);
        ChannelFuture future = ctx.writeAndFlush(responseData);
        future.addListener(ChannelFutureListener.CLOSE);
        log.info(String.valueOf(requestData));
    }
}
