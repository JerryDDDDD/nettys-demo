<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>test page</title>
    <link rel="stylesheet" href="/css/index.css">
</head>
<body>
<div class="left">
    <p>做个测试喽</p>
    <P>Socket IP 地址:</P>
    <input id="socketIp">
    <p>Socket PORT:</p>
    <input id="socketPort">
    <p>用户类型:</p>
    <select id="userType">
        <option value="3">user</option>
        <option value="2">company</option>
        <option value="1">admin</option>
    </select>
    <p>用户ID:</p>
    <input id="userId">
    <button id="initConnect">初始化连接</button>
    <p>发送人类型</p>
    <select id="fromRole">
        <option value="3">user</option>
        <option value="2">company</option>
        <option value="1">admin</option>
    </select>
    <p>发送人Id</p>
    <input id="fromId">
    <p>发送人name</p>
    <input id="fromName">
    <p>接受人类型</p>
    <select id="toRole">
        <option value="3">user</option>
        <option value="2">company</option>
        <option value="1">admin</option>
    </select>
    <p>接受人Id</p>
    <input id="toId">
    <p>接受人name</p>
    <input id="toName">
    <p>消息标题</p>
    <input id="messageTitle">
    <p>消息内容</p>
    <input id="messageContent">
    <p>消息类型</p>
    <select id="messageType">
        <option value="1">initMessage</option>
        <option value="2">ADMIN2ONEUSER</option>
        <option value="3">ADMIN2ALLUser</option>
        <option value="4">ADMIN2ONECOMPANY</option>
        <option value="5">ADMIN2ALLCOMPANY</option>
        <option value="6">COMPANY2ADMIN</option>
    </select>
    <button id="sendMessage">发送消息</button>
</div>
<div class="right">
</div>
<div>
    <button id="clear">清空内容</button>
</div>
</body>
</html>

<script type="text/javascript" src="/js/common/jquery.1.9.1.js"></script>
<script type="text/javascript" src="/js/data/customerServer.js"></script>
<script type="text/javascript" src="/js/index.js"></script>