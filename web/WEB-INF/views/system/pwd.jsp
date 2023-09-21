<%--
  Created by IntelliJ IDEA.
  User: fei
  Date: 2023/9/19
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="utf-8">
    <link rel="stylesheet" href="../resources/common/css/sapar.css" />
    <link rel="stylesheet" type="text/css" href="../resources/common/css/common.css" />
    <script type="text/javascript" src="../resources/js/jquery.js"></script>
    <script type="text/javascript" src="../resources/js/sapar.js"></script>
    <script type="text/javascript" src="../resources/js/WdatePicker.js"></script>
    <title>系统首页</title>
</head>

<body>
<div id="saper-container">
    <div id="saper-hd"></div>
    <div id="saper-bd">
        <div class="subfiled clearfix">
            <h2>修改密码</h2>
        </div>
        <div class="subfiled-content">
            <form class="saper-form" action="../user/updatePwd" >
                <div class="kv-item clearfix">
                    <label>用户名：</label>
                    <div class="kv-item-content">
                        <div class="user-name" style="line-height:30px;">${user.username}</div>  <input type="hidden" name="username" value="${user.username}">

                    </div>
                </div>
                <div class="kv-item clearfix">
                    <label><span class="impInfo">*</span>原密码：</label>
                    <div class="kv-item-content">
                        <input type="text" name="password" placeholder="原密码">
                    </div>
                </div>
                <div class="kv-item clearfix">
                    <label><span class="impInfo">*</span>新密码：</label>
                    <div class="kv-item-content">
                        <input type="text" name="newPwd1" placeholder="新密码">
                    </div>
                </div>
                <div class="kv-item clearfix">
                    <label><span class="impInfo">*</span>确认密码：</label>
                    <div class="kv-item-content">
                        <input type="text" name="newPwd2" placeholder="确认密码">
                    </div>
                </div>

                <div class="buttons">
                    <input type="submit" value="确定" class="sapar-btn sapar-btn-recom"/>
                </div>
            </form>
        </div>
    </div>
    <div id="saper-ft"></div>
</div>

</body>

<script type="text/javascript">
</script>
</html>
