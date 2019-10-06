package com.layman.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CpwMessage implements Serializable {
    private String id;

    private String messageTitle;

    private String messageContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date addTime;

    private Integer messageOpenStatus;

    private Integer messageStatus;

    private String fromId;

    private Integer fromRole;

    private String fromName;

    private String toId;

    private Integer toRole;

    private String toName;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getMessageOpenStatus() {
        return messageOpenStatus;
    }

    public void setMessageOpenStatus(Integer messageOpenStatus) {
        this.messageOpenStatus = messageOpenStatus;
    }

    public Integer getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Integer messageStatus) {
        this.messageStatus = messageStatus;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId == null ? null : fromId.trim();
    }

    public Integer getFromRole() {
        return fromRole;
    }

    public void setFromRole(Integer fromRole) {
        this.fromRole = fromRole;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName == null ? null : fromName.trim();
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId == null ? null : toId.trim();
    }

    public Integer getToRole() {
        return toRole;
    }

    public void setToRole(Integer toRole) {
        this.toRole = toRole;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName == null ? null : toName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", messageTitle=").append(messageTitle);
        sb.append(", messageContent=").append(messageContent);
        sb.append(", addTime=").append(addTime);
        sb.append(", messageOpenStatus=").append(messageOpenStatus);
        sb.append(", messageStatus=").append(messageStatus);
        sb.append(", fromId=").append(fromId);
        sb.append(", fromRole=").append(fromRole);
        sb.append(", fromName=").append(fromName);
        sb.append(", toId=").append(toId);
        sb.append(", toRole=").append(toRole);
        sb.append(", toName=").append(toName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}