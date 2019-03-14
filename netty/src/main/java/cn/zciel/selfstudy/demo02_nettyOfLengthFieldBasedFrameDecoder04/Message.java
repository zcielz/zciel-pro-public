package cn.zciel.selfstudy.demo02_nettyOfLengthFieldBasedFrameDecoder04;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author YINZHEN
 * @date 2019/3/14 19:42
 * @Description 消息类
 */
@Data
@AllArgsConstructor
public class Message {

    //消息类型
    private byte type;

    //消息长度
    private int length;

    //消息体
    private String msgBody;


}
