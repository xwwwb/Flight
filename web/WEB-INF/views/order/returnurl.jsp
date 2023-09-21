<%--
  Created by IntelliJ IDEA.
  User: fei
  Date: 2023/9/15
  Time: 10:18
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
    <link rel="stylesheet" type="text/css" href="../resources/css/query_order_step.css" />
    <script type="text/javascript" src="../resources/common/js/jquery.js"></script>
    <script type="text/javascript" src="../resources/common/js/sapar.js"></script>
    <script type="text/javascript" src="../resources/common/js/WdatePicker.js"></script>
    <title>机票查询</title>
</head>

<body>
<div id="saper-container">
    <div id="saper-hd"></div>
    <div id="saper-bd">
        <div class="subfiled clearfix">
            <h2>预订完成</h2>
        </div>
        <div class="subfiled-content">

            <div class="steps">
                <ol>
                    <li>
                        <i>1</i>
                        <span class="tsl">查询航班</span>
                    </li>
                    <li>
                        <i>2</i>
                        <span class="tsl">预订机票</span>
                    </li>
                    <li>
                        <i>3</i>
                        <span class="tsl">选择支付方式</span>
                    </li>
                    <li class="active">
                        <i>√</i>
                        <span class="tsl">完成预订</span>
                    </li>
                </ol>
            </div>
            <div class="subfiled-style2 clearfix">
                <h2>预订成功</h2>
            </div>
            <div style="text-align: center;font-size: 16px">
                <img src="../resources/images/right.jpg" width="300px">
                <div>
                    您的机票预订成功！
                </div>
                <div>
                    <a href="/" >回到主页</a>
                </div>
            </div>

        </div>
    </div>
    <div id="saper-ft"></div>
</div>

</body>
</html>