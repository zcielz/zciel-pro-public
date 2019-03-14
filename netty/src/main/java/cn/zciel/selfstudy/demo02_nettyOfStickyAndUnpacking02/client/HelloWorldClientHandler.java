package cn.zciel.selfstudy.demo02_nettyOfStickyAndUnpacking02.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/14 17:12
 * @Description 客户端handler
 */
@Slf4j
public class HelloWorldClientHandler extends ChannelInboundHandlerAdapter {

    private byte[] req;
    private int counter;

    public HelloWorldClientHandler() {
        req = ("Unless required by applicable law or agreed to in writing, software\n" +
                "  distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
                "  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
                "  See the License for the specific language governing permissions and\n" +
                "  limitations under the License.This connector uses the BIO implementation that requires the JSSE\n" +
                "  style configuration. When using the APR/native implementation, the\n" +
                "  penSSL style configuration is required as described in the APR/native\n" +
                "  documentation.An Engine represents the entry point (within Catalina) that processes\n" +
                "  every request.  The Engine implementation for Tomcat stand alone\n" +
                "  analyzes the HTTP headers included with the request, and passes them\n" +
                "  on to the appropriate Host (virtual host)# Unless required by applicable law or agreed to in writing, software\n" +
                "# distributed under the License is distributed on an \"AS IS\" BASIS,\n" +
                "# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" +
                "# See the License for the specific language governing permissions and\n" +
                "# limitations under the License.# For example, set the org.apache.catalina.util.LifecycleBase logger to log\n" +
                "# each component that extends LifecycleBase changing state:\n" +
                "#org.apache.catalina.util.LifecycleBase.level = FINE"
        ).getBytes();


    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        ByteBuf message;

        //将上面的所有字符串作为一个消息体发送出去 拆包
        //看到这个长长的字符串被截成了2段发送，这就是发生了拆包的现象。
        /*message = Unpooled.buffer(req.length);
        message.writeBytes(req);
        ctx.writeAndFlush(message);*/

        //模拟粘包
        /**
         * 这几行代码是把我们上面的一长串字符转成的byte数组写进流里发送出去，
         * 那么我们可以在这里把上面发送消息的这几行循环几遍这样发送的内容增多了就有可能在拆包的时候把上一条消息的一部分分配到下一条消息里面了
         */
        for (int i = 0; i < 3; i++) {
            message = Unpooled.buffer(req.length);
            message.writeBytes(req);
            ctx.writeAndFlush(message);
        }


    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String buf = (String) msg;
        log.info("Now is:" + buf + ": the counter is: " + (++counter));

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }

}
