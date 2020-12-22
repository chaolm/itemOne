<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/boot/css/bootstrap.css"/>
    <script type="text/javascript" src="/jquery/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="/boot/js/bootstrap.js"></script>

    <meta charset="utf-8"/>
    <title>用户注册</title>
</head>
<script>
    $(function (){
        $("#registerUserBtn").click(function () {
            var  phone = document.getElementById('phone').value;
            var  password = document.getElementById('password').value;
            var  recommendCode = document.getElementById('recommendCode').value;
            var schoolList={
                "recommendCode":recommendCode,
                "phone":phone,
                "password":password,
                "orgCode":"001"
            }

            $.ajax({
                type: "POST",
                contentType: "application/json;charset=UTF-8",
                url: "/user/addUser",
                data: JSON.stringify(schoolList),
                dataType: 'json',
                success: function(result) {
                    if(result.status == 0){
                        alert("注册用户成功1");
                    }
                    if(result.status == 1){
                        alert(result.message);

                    }

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
   <h3 class="text-center">用户注册</h3>
<div class="container-fluid">
    <form id="registerUserForm">
        <div class="form-group ">
            <label for="phone">账号</label>
            <input type="text" class="form-control" id="phone" placeholder="请输入手机号码" name="phone">
        </div>
        <div class="form-group">
            <label for="password">密码</label>
            <input type="password" class="form-control" id="password" placeholder="请设置6至16位登录密码"  name="password">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">密码</label>
            <input type="password" class="form-control" id="password1" placeholder="请再次输入登录密码">
        </div>
        <div class="form-group">
            <label for="recommendCode">推荐码</label>
            <input type="password" class="form-control" id="recommendCode" placeholder="非必填">
        </div>

        <button type="button" class="btn btn-info btn-block" id="registerUserBtn">注册</button>
        <button type="button" class="btn btn-info btn-block" onclick="javascript:window.location.href='login.ftl')">登录</button>
    </form>

</div>



</body>
</html>