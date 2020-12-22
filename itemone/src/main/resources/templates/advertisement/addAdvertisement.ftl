<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/boot/css/bootstrap.css"/>
    <script type="text/javascript" src="/jquery/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="/boot/js/bootstrap.js"></script>

    <meta charset="utf-8"/>
    <title>新增发布</title>
</head>
<script>
    $(function () {
        $("#addAdvertisementBtn").click(function () {
            var  mainTitle = document.getElementById('mainTitle').value;
            var  firstTitle = document.getElementById('firstTitle').value;
            var  otherTitle = document.getElementById('otherTitle').value;
            var  label = document.getElementById('label').value;
            var  limitNum = document.getElementById('limitNum').value;
            var  contactPerson = document.getElementById('contactPerson').value;
            var  contactPhone = document.getElementById('contactPhone').value;
            var  hangTimeLength = document.getElementById('hangTimeLength').value;
            var  hangEndTime = document.getElementById('hangEndTime').value;
            var  activeShopName = document.getElementById('activeShopName').value;
            var  activeAdress = document.getElementById('activeAdress').value;
            var  message = document.getElementById('message').value;
            var  pictureUrl = document.getElementById('pictureUrl').value;
            var  firstPictureUrl = document.getElementById('firstPictureUrl').value;
            var  album = document.getElementById('album').value;
            var data = {
                "mainTitle": mainTitle,
                "firstTitle": firstTitle,
                "otherTitle": otherTitle,
                "limitNum": limitNum,
                "contactPerson": contactPerson,
                "contactPhone": contactPhone,
                "hangTimeLength": hangTimeLength,
                "hangEndTime": hangEndTime,
                "activeShopName": activeShopName,
                "activeAdress": activeAdress,
                "message": message,
                "pictureUrl": pictureUrl,
                "firstPictureUrl": firstPictureUrl,
                "album": album
            }

            $.ajax({
                type: "POST",
                contentType: "application/json;charset=UTF-8",
                url: "/advertisement/addAdvertisement",
                data: JSON.stringify(data),
                dataType: 'json',
                success: function (req) {
                    if(req.status == 0){
                        alert("新增广告成功");
                    }
                    if(req.status == 0){
                        alert(req.message);
                    }
                }

            });
        });
    });

</script>
<style>
    .form-group {
        font-size: 9px;
    }

    .form-control {
        font-size: 5px;
    }

    .col-sm-12 {
        margin-left: -15px;
        margin-right: -15px;
    }
</style>
<body>
<h3 class="text-center">发布</h3>

<div class="container-fluid">
    <form class="form-horizontal" id="addAdvertisementForm">
        <div class="form-group">
            <label for="mainTitle" class="col-sm-2 control-label">主标题</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mainTitle" placeholder="请输入主标题" name="mainTitle">
            </div>
        </div>
        <div class="form-group ">
            <label for="firstTitle" class="col-sm-2 control-label">副标题</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="firstTitle" placeholder="请输入副标题" name="firstTitle">
            </div>
        </div>
        <div class="form-group">
            <label for="otherTitle" class="col-sm-2 control-label">其他标题</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="otherTitle" placeholder="其他标题" name="otherTitle">
            </div>
        </div>
        <div class="form-group">
            <label for="label" class="col-sm-2 control-label">标签</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="label" placeholder="标签" name="label">
            </div>
        </div>
        <div class="form-group">
            <label for="activeType" class="col-sm-2 control-label">活动类别</label>
            <div class="col-sm-10">
<#--
                <input type="text" class="form-control" id="activeType" placeholder="活动类别" name="activeType">
-->
                <div class="btn-group">
                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    分类 <span class="caret"></span>
                </button>
                    <#--1:轻子 2：交友 3：体育 4：教育 5：生活 6：休闲娱乐 7：文艺 8：其他'-->
                <ul class="dropdown-menu">
                    <li><a href="1" >轻子</a></li>
                    <li><a href="#">交友</a></li>
                    <li><a href="#">体育</a></li>
                    <li><a href="#">教育</a></li>
                    <li><a href="#">生活</a></li>
                    <li><a href="#">休闲娱乐</a></li>
                    <li><a href="#">文艺</a></li>
                    <li><a href="#">其他</a></li>
                </ul>
            </div>
            </div>
        </div>
        <div class="form-group">
            <label for="topStatus" class="col-sm-2 control-label">是否置顶</label>
            <div class="col-sm-10">
                <div class="radio" id="radioId">
                    <label>
                        <input type="radio" name="optionsRadios" id="optionsRadios2" value="0" checked>
                        否
                    </label>
                    <label>
                        <input type="radio" name="optionsRadios" id="optionsRadios1" value="1" >
                        是
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <label for="limitNum" class="col-sm-2 control-label">限制数量</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="limitNum" placeholder="限制数量" name="limitNum">
            </div>
        </div>
        <div class="form-group">
            <label for="contactPerson" class="col-sm-2 control-label">联系人</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="contactPerson" placeholder="联系人" name="contactPerson">
            </div>
        </div>
        <div class="form-group">
            <label for="contactPhone" class="col-sm-2 control-label">联系人电话</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="contactPhone" placeholder="联系人电话" name="contactPhone">
            </div>
        </div>
        <div class="form-group">
            <label for="hangTimeLength" class="col-sm-2 control-label">悬挂时长</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="hangTimeLength" placeholder="悬挂时长" name="hangTimeLength">
            </div>
        </div>
        <div class="form-group">
            <label for="hangStartTime" class="col-sm-2 control-label">悬挂开始时间</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="hangStartTime" placeholder="悬挂开始时间" name="hangStartTime">
            </div>
        </div>
        <div class="form-group">
            <label for="hangEndTime" class="col-sm-2 control-label">悬挂结束时间</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="hangEndTime" placeholder="悬挂结束时间" name="hangEndTime">
            </div>
        </div>
        <div class="form-group">
            <label for="activeShopName" class="col-sm-2 control-label">活动场所名称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="activeShopName" placeholder="活动场所名称" name="activeShopName">
            </div>
        </div>
        <div class="form-group" >
            <label for="activeAdress" class="col-sm-2 control-label">活动进行地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="activeAdress" placeholder="活动进行地址" name="activeAdress">
            </div>
        </div>
        <div class="form-group">
            <label for="message" class="col-sm-2 control-label">发布详情</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="message" placeholder="发布详情" name="message">
            </div>
        </div>
        <div class="form-group">
            <label for="pictureUrl" class="col-sm-2 control-label">主图上传图片地址</label>
            <div class="col-sm-10">
                <input type="file" class="form-control" id="pictureUrl" placeholder="主图上传图片地址" name="pictureUrl">
            </div>
        </div>
        <div class="form-group">
            <label for="firstPictureUrl" class="col-sm-2 control-label">副图上传地址</label>
            <div class="col-sm-10">
                <input type="file" class="form-control" id="firstPictureUrl" placeholder="副图上传地址"
                       name="firstPictureUrl">
            </div>
        </div>
        <div class="form-group">
            <label for="album" class="col-sm-2 control-label">相册</label>
            <div class="col-sm-10">
                <input type="file" class="form-control" id="album" placeholder="相册" name="album">
            </div>
        </div>
        <button type="button" class="btn btn-info btn-block" id="addAdvertisementBtn">提交</button>
    </form>
</div>
<#--
<img src="/imgs/3.jpg" alt="..." class="img-circle">
-->


</body>
</html>