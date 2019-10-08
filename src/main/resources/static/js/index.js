
// 初始化连接
$("#initConnect").on('click', function () {
    var socketIp = $("#socketIp").val();
    var port = $("#socketPort").val();
    var userType = $("#userType").val();
    var userId = $("#userId").val();
    // 构建socket连接的URL
    var socketUrl = "ws://" + socketIp + ":" + port + "/ws";
    // 创建socket对象
    CustomerServer.socket = new WebSocket(socketUrl);
    CustomerServer.socket.onopen = function () {
        var cpwInitMessage = new CustomerServer.CpwInitMessage(userType, userId);
        var message = new CustomerServer.CustomerMessage(CustomerServer.messageType.initMessage, cpwInitMessage);
        CustomerServer.socket.send(JSON.stringify(message));
        console.log("socket connect ...");
    }, CustomerServer.socket.onclose = function () {
        console.log("disconnect...");
    }, CustomerServer.socket.onerror = function () {
        console.log("error...")
    }, CustomerServer.socket.onmessage = function (e) {
        console.log("message receive");
        console.log(e);
        receiveMessage(e.data);
    }
});

// 发送消息
$("#sendMessage").on('click', function () {
    let messageTitle = $("#messageTitle").val();
    let messageContent = $("#messageContent").val();
    let fromId = $("#fromId").val();
    let fromRole = $("#fromRole").val();
    let fromName = $("#fromName").val();
    let toId = $("#toId").val();
    let toRole = $("#toRole").val();
    let toName = $("#toName").val();
    let cpwMessage = new CustomerServer.CpwMessage(messageTitle, messageContent, fromId, fromRole, fromName, toId, toRole, toName);
    let messageType = $("#messageType").val();
    let message = new CustomerServer.CustomerMessage(messageType, cpwMessage);
    CustomerServer.socket.send(JSON.stringify(message));
});

// 清空内容
$("#clear").on('click', function () {
    $(".right").empty();
});

function receiveMessage(message) {
    var html = "<p>" + message + "</p>";
    $(".right").append(html);
}