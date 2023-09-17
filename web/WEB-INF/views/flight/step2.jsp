<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta charset="utf-8">
<link rel="stylesheet" href="/resources/common/css/sapar.css" />
<link rel="stylesheet" type="text/css" href="/resources/common/css/common.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/query_order_step.css" />
<script type="text/javascript" src="/resources/common/js/jquery.js"></script>
<script type="text/javascript" src="/resources/common/js/sapar.js"></script>
<script type="text/javascript" src="/resources/common/js/WdatePicker.js"></script>
<title>机票查询</title>
</head>

<body>
    <div id="saper-container">
        <div id="saper-hd"></div>
        <div id="saper-bd">
            <div class="subfiled clearfix">
                <h2>请填写机票订单信息</h2>
            </div>
            <div class="subfiled-content">

                <div class="steps">
                    <ol>
                        <li>
                            <i>1</i>
                            <span class="tsl">查询航班</span>
                        </li>
                        <li class="active">
                            <i>2</i>
                            <span class="tsl">预订机票</span>
                        </li>
						<li>
						                <i>3</i>
						                <span class="tsl">选择支付方式</span>
						            </li>
                        <li>
                            <i>√</i>
                            <span class="tsl">完成预订</span>
                        </li>
                    </ol>
                </div>

                
                <div class="subfiled-style2 clearfix">
                    <h2>机票信息</h2>
                </div>
                <!--表格开始-->
                <div class="table">

                    <!--表格具体内容-->
                    <div class="table-box">
                        <table>
                            <thead>
                                <tr>
                                    <th>日期</th>
                                    <th>航班号</th>
                                    <th>出发城市</th>
                                    <th>到达城市</th>
                                    <th>起飞时间</th>
                                    <th>到达时间</th>
                                    <th>票价</th>
                                </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td><fmt:formatDate value="${ft.flightDate}" pattern="yyyy-MM-dd"/></td>
                                <td>${ft.flightNum}</td>
                                <td>${ft.departureCity}</td>
                                <td>${ft.arrivalCity}</td>
                                <td><fmt:formatDate value="${ft.departureTime}" pattern="yyyy-MM-dd HH:mm"/></td>
                                <td><fmt:formatDate value="${ft.arrivalTime}" pattern="yyyy-MM-dd HH:mm"/></td>
                                <td> ￥${ft.ticketPrice}</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div><!--表格结束-->
                
                <div class="subfiled-style2 clearfix">
                    <h2>选择乘机人</h2>
                </div>
                <div class="subfiled-content">
                    <form class="saper-form" action="/order/step3">
                        <input type="hidden" name="fid" value="${ft.fid}" >
                        <div class="kv-item clearfix">
                            <label>旅客选择：</label>
                            <div class="kv-item-content">
                                <select name="pid">
                                    <c:forEach items="${list}" var="ps">
                                        <option value="${ps.pid}">${ps.pname}-${ps.cardnum.substring(12)}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="kv-item-tip">当前只能添加一位旅客</div>
                        </div>
                       <div class="kv-item clearfix">
                           <div class="kv-item-content">
                                <input type="submit" class="sapar-btn sapar-btn-recom query-btn" value="提交">
                                <a href="javascript:history.back(-1)" class="a-btn">返回 </a>
                            </div>
                       </div>
                    </form>



                </div>
            </div>
        </div>
        <div id="saper-ft"></div>
    </div>
    
</body>
</html>