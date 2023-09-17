<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="utf-8">
    <link rel="stylesheet" href="../resources/common/css/sapar.css" />
    <link rel="stylesheet" type="text/css" href="../resources/common/css/common.css" />
    <link rel="stylesheet" type="text/css" href="../resources/css/query_order_step.css" />
    <link rel="stylesheet" type="text/css" href="../resources/css/order_pay.css">
    <script type="text/javascript" src="../resourcescommon/js/jquery.js"></script>
    <script type="text/javascript" src="../resources/common/js/sapar.js"></script>
    <script type="text/javascript" src="../resources/common/js/WdatePicker.js"></script>
    <title>安全支付</title>
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
                    <li class="active">
                        <i>3</i>
                        <span class="tsl">选择支付方式</span>
                    </li>
                    <li>
                        <i>√</i>
                        <span class="tsl">完成预订</span>
                    </li>
                </ol>
            </div>
            <div class="OrderInfo w1190 boxS">
                <div class="one">
                    订单金额:&nbsp;<span style="color: #6AB96E;font-size: 18px;">￥${order.orderAmount}</span>
                </div>
                <div class="two">
                    <p>
                        单程机票&nbsp;&nbsp;&nbsp;<span>${order.flight.departureCity}-${order.flight.arrivalCity}</span>
                        出发时间：<span><fmt:formatDate value="${order.flight.departureTime}" pattern="MM-dd HH:mm"/></span>
                    </p>
                    <p>
                        乘机人：<span>${order.passengerFt.pname}</span>&nbsp; 乘机证件:&nbsp;身份证${order.passengerFt.cardnum}

                    </p>
                </div>
            </div>
            <div class="way w1190 boxS">
                <h3>
                    支付金额 ：<b>￥${order.orderAmount}</b>
                </h3>
                <div class="wayArea">
                    <ul class="clearfix">
                        <li class="clearfix">
                            <input type="radio" checked="" name="funct">
                            <p class="checkbox checked">
                                <img src="../resources/images/zfb.png" alt="">
                                <em></em>
                            </p>
                        </li>
                    </ul>
                    <!-- 模拟get -->
                    <a href="/order/pay?oid=${order.oid}">用支付宝支付</a>
                </div>
            </div>
        </div>

    </div>
</div>
<div id="saper-ft"></div>
</div>

</body>
</html>
