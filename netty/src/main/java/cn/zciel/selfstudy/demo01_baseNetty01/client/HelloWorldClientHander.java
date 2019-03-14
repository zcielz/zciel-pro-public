package cn.zciel.selfstudy.demo01_baseNetty01.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/14 15:03
 * @Description 自己的handler, 用自己的方式来处理数据
 */
@Slf4j
public class HelloWorldClientHander extends ChannelInboundHandlerAdapter {

    // 一个最常用的handler,这个handler的作用就是处理接收的数据时的事件，也就是说，我们的业务逻辑一般写到这个handler里面，
    // channelInboundHandler 就是用来处理我们的核心业务逻辑

    //ChannelHandlerContext就是handler的上下文对象，有了这个你就可以获取到通道，获取事件的控制权
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info("server say: {}", msg.toString());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("client is active");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.info("client is close");
    }
}
