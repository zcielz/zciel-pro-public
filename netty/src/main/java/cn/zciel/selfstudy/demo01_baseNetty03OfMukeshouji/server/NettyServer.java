package cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.server;

import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.EncodingAndDecoding.RequestDecoder;
import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.EncodingAndDecoding.ResponseDataEncoder;
import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.handler.ProcessingHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class NettyServer {

    private int port;

    public NettyServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws Exception {

        int port = args.length > 0 ? Integer.parseInt(args[0]) : 9003;

        new NettyServer(port).run();
    }

    public void run() throws Exception {

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workGroup).channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new RequestDecoder(),
                                    new ResponseDataEncoder(),
                                    new ProcessingHandler()
                            );
                        }
                    }).option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture f = b.bind(port).sync();
            f.channel().closeFuture().sync();
        } finally {
            workGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }

    }
}
