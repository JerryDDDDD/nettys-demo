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
    <p>接受人类型</p>
    <select id="toRole">
        <option value="3">user</option>
        <option value="2">company</option>
        <option value="1">admin</option>
    </select>
    <p>接受人Id</p>
    <input id="toId">
    <p>消息标题</p>
    <input id="messageTitle">
    <p>消息内容</p>
    <input id="messageContent">
    <button id="sendMessage">发送消息</button>
</div>
<div class="right">
</div>
</body>
</html>