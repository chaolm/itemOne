<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/boot/css/bootstrap.css"/>
    <script type="text/javascript" src="/jquery/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="/boot/js/bootstrap.js"></script>

    <meta charset="utf-8"/>
    <title>晁雷鸣</title>
</head>
<script>
    $(function (){
        $("#loginUserBtn").click(function () {
            var  phone = document.getElementById('phone').value;
            var  password = document.getElementById('password').value;
            var schoolList={
                "phone":phone,
                "password":password
            }

            $.ajax({
                type: "POST",
                contentType: "application/json;charset=UTF-8",
                url: "/user/loginByPassword",
                data: JSON.stringify(schoolList),
                dataType: 'json',
                success: function(result) {
                    console.log(result);
                    if(result.status == 0){
                        alert("登陆成功");
                    }

                },
                error : function(e){
                    console.log(e.status);
                    console.log(e.responseText);
                }
            });
        });
    });

</script>
<style>
    .form-group{
        font-size: 9px;
    }
    .form-control{
        font-size: 5px;
    }
    .col-sm-12{
        margin-left: -15px;
        margin-right: -15px;
    }
</style>
<body>
   <h3 class="text-center">登陆</h3>
<div class="container-fluid">
    <form>
        <div class="form-group ">
            <label for="exampleInputEmail1">登录账号</label>
            <input type="type" class="form-control" id="exampleInputEmail1" placeholder="请输入手机号码或用户编码进行登录">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">登录密码</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入登录密码">
        </div>

        <button type="button" class="btn btn-info btn-block" id="loginUserBtn">登陆</button>
        <button type="button" class="btn btn-info btn-block" onclick="function f() {
            window.location.href= '/jump/loginToRegister';
                }">注册</button>
    </form>

</div>



</body>
</html>