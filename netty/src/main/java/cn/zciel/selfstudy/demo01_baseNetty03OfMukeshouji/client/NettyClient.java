package cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.client;

import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.EncodingAndDecoding.RequestDataEncoder;
import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.EncodingAndDecoding.ResponseDataDecoder;
import cn.zciel.selfstudy.demo01_baseNetty03OfMukeshouji.handler.ClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class NettyClient {

    public static void main(String[] args) throws InterruptedException {

        String host = "127.0.0.1";
        int port = 9003;

        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.SO_KEEPALIVE, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {

                            socketChannel.pipeline().addLast(new RequestDataEncoder(),
                                    new ResponseDataDecoder(), new ClientHandler());
                        }
                    });

            ChannelFuture f = b.connect(host, port).sync();
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }

}
