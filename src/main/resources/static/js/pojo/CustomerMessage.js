var Netty = {

    userType: {
        user: 3,
        company: 2,
        admin: 1,
    },

    // 消息体
    CustomerMessage: function (messageType, message) {
        this.messageType = messageType;
        this.message = message;
    },

    // 消息
    CpwMessage: function (id, messageTitle, messageContent, messageOpenStatus, messageStatus, fromId) {
        this.id = id;
        this.messageTitle = messageTitle;
        this.messageContent = messageOpenStatus;
        this.messageStatus = messageStatus;
        this.fromId = fromId;
    },

    // 初始化消息
    CpwInitMessage: function (userType, userId) {
        this.userType = userType;
        this.userId = userId;
    },
};