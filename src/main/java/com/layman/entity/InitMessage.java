package com.layman.entity;

/**
 * @ClassName InitMessage
 * @Description TODO
 * @Author 叶泽文
 * @Data 2019/10/4 17:45
 * @Version 3.0
 **/
public class InitMessage {

    private String userId;

    private Integer userType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}
