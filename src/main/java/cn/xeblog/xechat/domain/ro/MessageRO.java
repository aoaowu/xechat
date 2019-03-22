package cn.xeblog.xechat.domain.ro;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 消息请求
 *
 * @author yanpanyi
 * @date 2019/3/20
 */
@Getter
@Setter
@ToString
public class MessageRO implements Serializable {

    private static final long serialVersionUID = 3544216886850149310L;

    /**
     * 接受者
     */
    private String receiver;
    /**
     * 发送者
     */
    private String sender;
    /**
     * 消息
     */
    private String message;

}
