<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script language="javascript" type="text/javascript">

        if(window.WebSocket != undefined) {

            var href="ws://192.168.50.221:8080/websocket/4";
            var ws = new WebSocket(href)

            ws.onopen = function () {
                console.log("openagain");
                ws.send("发送数据");
                //  alert("打开成功");
            };
            ws.onmessage = function (evt) {
                console.log("接收的消息 " + evt.data);
            }
            ws.onerror = function (evt) {
                console.log("错误");
            }

            ws.onclose = function (evt) {
                console.log("关闭");
            }
        }
        else {
            alert("您的浏览器不支持websocket");
        }



    </script>
    <style>
        html,body{
            height: 100%;
        }
        .p1{
            margin-top: 130px;
            text-align: center;
        }

    </style>
</head>
<body>
<div class="content">
    <p class="p1">游戏进行中....</p>
</div>
</body>
</html>