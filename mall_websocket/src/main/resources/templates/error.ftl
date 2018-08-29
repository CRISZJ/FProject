<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>


    <style>
        html,body{
            height: 100%;
        }
        .content{
            width: 100%;
            height: 100%;
            background: url('/images/215313271696496606.jpg');
            position: relative;
            overflow: hidden;
            text-align: center;
        }
        p{
            color: white;
            text-align: center;
        }
        .p1{
            margin-top: 130px;
            text-align: center;
        }
        .loginBtn{
            width: 200px;
            height: 200px;
            margin-top: 10px;
        }
    </style>

    <script language="JavaScript">
        var a="${number!''}";
        function start(){
            window.location.href="/game"+a;
        }
    </script>
</head>

<body>
<div class="content">
    <p class="p1">连接失败，点击按钮返回主界面</p>
    <img class="loginBtn" src="/images/button.png"  alt="" onclick="start()">
</div>
</body>
</html>