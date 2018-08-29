<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<style>
    html,body{
        height: 100%;
    }
    .content{
        width: 100%;
        height: 100%;
        background: url("/images/215313271696496606.jpg");
        display: flex;
        justify-content: center;
    ');
    position: relative;
        overflow: hidden;
        text-align: center;
    }
    .box{
        width: 220px;
        height: 220px;
        margin-top: 160px;
        text-align: center;
        position: relative;

    }
    .loginScore{
        width: 100%;
        height: 100%;
        display: block;
    }
    .score{
        position: absolute;
        display: block;
        width: 50px;
        height: 50px;
        top: 73px;
        left: 84px;
        font-size: 36px;
        color: #ffd24d;
        text-align: center;
    }
</style>
<body>
<div class="content">
    <div class="box">
        <img class="loginScore" src="/images/Score.png" alt=""/>
        <span class="score">${test!''}</span>
    </div>
</div>
</body>
</html>