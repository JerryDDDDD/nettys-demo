package com.layman.entity;

/**
 * @ClassName MessageType
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/5 9:36
 * @Version 3.0
 **/
public class MessageType {

    // 初始化消息
    public static final int INIT = 1;

    // admin给单个前台用户发送消息
    public static final int ADMIN2ONEUSER = 2;

    // admin给所有的前台用户发送消息
    public static final int ADMIN2ALLUser = 3;

    // admin给单个公司账户发送消息
    public static final int ADMIN2ONECOMPANY = 4;

    // admin给所有的公司账户发送消息
    public static final int ADMIN2ALLCOMPANY = 5;

    // 公司账户给admin发送消息
    public static final int COMPANY2ADMIN = 6;
}
