const CustomerServer = {
    SocketUrl: "ws://127.0.0.1:54321/ws",
    socket: null,

    // 连接用户类型
    userType: {
        // 平台后台
        admin: 1,
        // 公司用户
        company: 2,
        // 前台用户
        user: 3
    },

    // 消息类型
    messageType: {
        // 初始化链接消息
        initMessage: 1,
        ADMIN2ONEUSER: 2,
        ADMIN2ALLUser: 3,
        ADMIN2ONECOMPANY: 4,
        ADMIN2ALLCOMPANY: 5,
        COMPANY2ADMIN: 6
    },

    // 消息体
    CustomerMessage: function (messageType, message) {
        this.messageType = messageType;
        this.message = message;
    },

    /**
     * 消息
     * @param messageTitle 标题
     * @param messageContent 内容
     * @param fromId 发送人id,平台-0，企业-企业id,用户-用户id
     * @param fromRole 发送用户类型,1-平台,2-公司,3-用户
     * @param fromName 平台-北京创拍网络科技有限公司，企业-企业名称，3-用户名',
     * @param toId 接收人id,平台-0，企业-企业id,用户-用户id'
     * @param toRole 接收用户类型,1-平台,2-公司,3-用户
     * @param toName 接收人名称 平台-北京创拍网络科技有限公司，企业-企业名称，3-用户名'
     * @constructor
     */
    CpwMessage: function (messageTitle, messageContent, fromId, fromRole, fromName, toId, toRole, toName) {
        this.messageTitle = messageTitle;
        this.messageContent = messageContent;
        this.fromId = fromId;
        this.fromRole = fromRole;
        this.fromName = fromName;
        this.toId = toId;
        this.toRole = toRole;
        this.toName = toName;
    },

    // 初始化消息
    CpwInitMessage: function (userType, userId) {
        this.userType = userType;
        this.userId = userId;
    },
};