package com.layman.entity;

import java.io.Serializable;

/**
 * @ClassName CustomerMessage
 * @Description 客服系统消息
 * @Author 叶泽文
 * @Data 2019/9/18 15:25
 * @Version 3.0
 **/
public class CustomerMessage implements Serializable {


    // 消息类型
    private Integer messageType;

    // 消息内容
    private Object message;

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CustomerMessage{" +
                "messageType=" + messageType +
                ", message=" + message +
                '}';
    }
}
