package com.layman.entity;

/**
 * @ClassName MessageBady
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/4 12:20
 * @Version 3.0
 **/
public class MessageBady {

    private String messageType;

    private String fromChannel;

    private String toChannel;

    private Object message;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getFromChannel() {
        return fromChannel;
    }

    public void setFromChannel(String fromChannel) {
        this.fromChannel = fromChannel;
    }

    public String getToChannel() {
        return toChannel;
    }

    public void setToChannel(String toChannel) {
        this.toChannel = toChannel;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
