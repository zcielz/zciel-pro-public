package cn.zciel.selfstudy.demo01_baseNetty01.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author YINZHEN
 * @date 2019/3/14 14:44
 * @Description 用来配置处理数据的Handler
 */
public class ClientChannelInitializer extends ChannelInitializer<SocketChannel> {

    //ChannelInitializer 当一个链路建立时，我们需要知道怎么来接收或者发送数据，当然，我们有各种各样的Handler实现来处理它，
    //那么ChannelInitializer便是用来配置这些Handler， 它会提供一个ChannelPipeline，并吧Handler加入到ChannelPipeline

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {

        //ChannelPipeline是ChannelHandler的容器，它负责ChannelHandler的管理和事件拦截与调度，
        //Netty的ChannelPipeline和ChannelHandler机制类似于Servlet和Filter过滤器，这类拦截器实际上是职责链模式的一种变形
        //主要是为了方便事件和拦截和用户业务逻辑的定制
        ChannelPipeline pipeline = socketChannel.pipeline();

        //这里必须和服务端对象，否则无法正常的解码和编码
        pipeline.addLast("decoder", new StringDecoder());
        pipeline.addLast("encoder", new StringEncoder());

        //我们自己的Hanler
        pipeline.addLast("handler", new HelloWorldClientHander());

        //事实上，用户不需要自己创建Pipeline，因为使用ServerBootstrap或者BootStrap启动服务端或者客户端时，Netty会为每个Channel连接创建一个独立的pipeline


        //ChannelPipeline是线程安全的 ，这意味着N个业务线可以并发的操作ChannPipeline而不存在多线程并发问题。但是，ChannelHandler却不是线程安全的，
        //这意味着尽管ChannelPipeline是线程安全的，但是任然需要自己保证ChannelHandler的线程安全

    }
}


/**
 * netty其他事件
 * /
 * /**
 * Netty 中的事件分为inbound 事件和outbound 事件。inbound 事件通常由I/O线程触发，例如TCP 链路建立事件、链路关闭事件、读事件、异常通知事件等。Outbound 事件通常是I/O 用户主动发起的网络I/O 操作，例如用户发起的连接操作、绑定操作、消息发送等操作。
 * <p>
 * 我们常用的inbound事件有：
 * <p>
 * ChannelHandlerContext fireChannelRegistered() //channel注册事件
 * ChannelHandlerContext fireChannelActive() //channel激活事件
 * ChannelHandlerContext fireExceptionCaught(Throwable var1) //channel异常处理事件
 * ChannelHandlerContext fireUserEventTriggered(Object var1) //用户自定义事件
 * ChannelHandlerContext fireChannelRead(Object var1) //读事件
 * pipeline 中以fireXXX命名的方法都是从I/O 线程流向用户业务Handler的inbound 事件，它们的实现因功能而异，但是处理步骤类似：
 * <p>
 * 调用HeadHandler对应的fireXXX 方法
 * <p>
 * 执行事件相关的逻辑操作
 * <p>
 * 常用的outbound事件有：
 * <p>
 * ChannelFuture bind(SocketAddress var1, ChannelPromise var2) //绑定地址
 * ChannelFuture connect(SocketAddress var1, ChannelPromise var2) //连接服务器
 * ChannelFuture write(Object var1) //发送事件
 * ChannelHandlerContext flush() //刷新事件
 * 上面我们说到事件，netty的事件机制是由前至后的，一般来说，都是一个channel的ChannnelActive方法中调用fireChannelActive来触发调用下一个handler中的ChannelActive方法，即你在ChannelPipeline中添加handler的时候，要在第一个handler的channelActive方法中调用fireChannelActive，以此来触发下一个事件。
 * ---------------------
 * 作者：rickiyang
 * 来源：CSDN
 * 原文：https://blog.csdn.net/a953713428/article/details/66477657
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */