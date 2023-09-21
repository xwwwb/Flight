<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="utf-8">
    <link rel="stylesheet" href="../resources/common/css/sapar.css" />
    <link rel="stylesheet" type="text/css" href="../resources/common/css/common.css" />
    <link rel="stylesheet" type="text/css" href="../resources/css/my_order.css" />
    <script type="text/javascript" src="../resources/common/js/jquery.js"></script>
    <script type="text/javascript" src="../resources/js/sapar.js"></script>
    <script type="text/javascript" src="../resources/js/WdatePicker.js"></script>
    <title>我的订单</title>
</head>

<body>
<div id="saper-container">
    <div id="saper-hd"></div>
    <div id="saper-bd">
        <div class="subfiled clearfix">
            <h2>机票订单</h2>
        </div>
        <div class="subfiled-content">
            <form name="f1" id="f1" action="../order/myOrder" method="post">
                <div class="search-box clearfix">
                    <div class="kv-item clearfix">
                        <label>订单号：</label>
                        <div class="kv-item-content">
                            <input type="text" name="oid" placeholder="订单号">
                        </div>
                    </div>
                    <div class="kv-item clearfix">
                        <label>乘机人：</label>
                        <div class="kv-item-content">
                            <input type="text" name="passengerFt.pname" placeholder="乘机人">
                        </div>
                    </div>
                    <div class="kv-item clearfix">
                        <label>航班日期：</label>
                        <div class="kv-item-content time-select-wrap">
                            <div class="time-select">
                                <input type="text" name="flight.flightDate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" placeholder="">
                                <i class="date-icon"></i>
                            </div>
                        </div>
                    </div>
                    <input type="submit" value="查询" class="sapar-btn sapar-btn-recom query-btn">
                </div>
            </form>
            <!--表格开始-->
            <div class="table">

                <!--表格具体内容-->
                <div class="table-box">
                    <table>
                        <thead>
                        <tr>
                            <th>订单号</th>
                            <th>航班号</th>
                            <th>起飞时间</th>
                            <th>行程</th>
                            <th>乘机人</th>
                            <th>总价</th>
                            <th>政策</th>
                            <th>应付</th>
                            <th>操作人</th>
                            <th>创建时间</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${list}" var="order">
                                <tr>
                                    <td><a class="blue bold" href="javascript:;">${order.oid}</a><!--<p class="red bold">[促销]</p>--></td>
                                    <td>${order.flight.flightNum}</td>
                                    <td><fmt:formatDate value="${order.flight.flightDate}" pattern="yyyy-MM-dd"/></td>
                                    <td><p>${order.flight.departureCity}</p><p>${order.flight.arrivalCity}</p></td>
                                    <td>${order.passengerFt.pname}</td>
                                    <td>¥${order.flight.ticketPrice}</td>
                                    <td><p class="orange bold">0.0%</p>¥0.0</td>
                                    <td><p class="orange bold">¥${order.orderAmount}</p></td>
                                    <td>${order.username}</td>
                                    <td>
                                        <p><fmt:formatDate value="${order.orderTime}" pattern="yyyy-MM-dd"/></p>
                                        <p><fmt:formatDate value="${order.orderTime}" pattern="HH:mm"/></p>
                                    </td>
                                    <td>
                                        <c:if test="${order.orderStatus == 1}">
                                            <a href="pay?oid=${order.oid}">[支付]</a>
                                        </c:if>
                                        <c:if test="${order.orderStatus == 2}">
                                            <a href="javascript:;">[退票]</a>
                                        </c:if>
                                        <c:if test="${order.orderStatus == 3}">
                                            <a href="javascript:;">[已取消]</a>
                                        </c:if>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div><!--表格结束-->
        </div>
    </div>
    <div id="saper-ft"></div>
</div>

</body>

<script type="text/javascript">
    $('select').iSelect();
</script>
</html>