package cn.zciel.selfstudy.demo01_baseNetty01.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YINZHEN
 * @date 2019/3/14 14:37
 * @Description
 */
@Slf4j
public class HelloWorldClient {

    private int port;
    private String address;

    public HelloWorldClient(int port, String address) {
        this.port = port;
        this.address = address;
    }

    public void start() {

        // EventLoop 目的是为了Channel处理IO操作，一个EventLoop 可以为多个Channel服务，
        // EventLoopGroup会包含多个EventLoop
        EventLoopGroup group = new NioEventLoopGroup();

        // 一个Netty应用通常由一个Bootstrap开始，它主要作用是配置整个Netty程序，串联起各个组件。
        Bootstrap bootstrap = new Bootstrap();

        //一个Channel中包含一个ChannelPipeline，用来处理Channel中的事件，一个ChannelPipeline中可以包含多个handler，
        bootstrap.group(group)  //处理要创建的所有事件
                .channel(NioSocketChannel.class) //创建实例 -- 基于NIO选择器的实现
                .handler(new ClientChannelInitializer());  // 为了支持各种协议和处理的方式，Handler主要用来处理各种事件，这里的事件很广泛，比如可以是连接、接收、异常、数据转换等。

        //Netty的channel运用机制和Filter过滤器机制一样，它将Channel的数据管道抽象为ChannelPipeline.消息在
        //ChannelPipeline中流动和传递，ChannelPipeline持有I/O事件拦截器ChannelHandler的链表，由
        //ChannelHandler对I/O事件进行拦截和处理，可以方便通过新增和删除ChannelHandler来实现不同的业务逻辑定制
        //不需要对已有的ChannelHandler进行修改，能够实现对修改封闭和扩展的支持
        // Channel ---> ChannelPipleLine ---> handler
        try {
            Channel channel = bootstrap.connect(address, port).sync().channel();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (; ; ) {
                String msg = reader.readLine();
                if (msg == null) {
                    continue;
                }
                channel.writeAndFlush(msg + "\r\n");
            }
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } finally {
            group.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        HelloWorldClient client = new HelloWorldClient(7788, "127.0.0.1");
        client.start();
    }

}
