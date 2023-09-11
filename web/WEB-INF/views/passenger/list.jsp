<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="utf-8">
    <link rel="stylesheet" href="/resources/common/css/sapar.css" />
    <link rel="stylesheet" type="text/css" href="/resources/common/css/common.css" />
    <link rel="stylesheet" type="text/css" href="css/user.css" />
    <script type="text/javascript" src="/resources/common/js/jquery.js"></script>
    <script type="text/javascript" src="/resources/common/js/sapar.js"></script>
    <script type="text/javascript" src="/resources/common/js/WdatePicker.js"></script>
    <title>常旅客管理</title>
</head>

<body>
<div id="saper-container">
    <div id="saper-hd"></div>
    <div id="saper-bd">
        <div class="subfiled clearfix">
            <h2>常旅客管理</h2>
        </div>
        <div class="subfiled-content">
            <div class="search-box clearfix">
                <form action="getPassByNameOrPhone">
                <div class="kv-item clearfix">
                    <label>姓名：</label>
                    <div class="kv-item-content">
                        <input type="text" name="pname" placeholder="姓名">
                    </div>
                </div>
                <div class="kv-item clearfix">
                    <label>手机：</label>
                    <div class="kv-item-content">
                        <input type="text" name="phone" placeholder="手机">
                    </div>
                </div>

                <input type="submit" class="sapar-btn sapar-btn-recom query-btn" value="查询" />
                </form>
            </div>


            <!--表格开始-->
            <div class="table">
                <!--表格操作-->
                <div class="table-operate ue-clear">
                    <a href="toAdd" class="add">添加</a>
                </div>
                <!--表格具体内容-->
                <div class="table-box">
                    <table>
                        <thead>
                        <tr>
                            <th>姓名</th>
                            <th>证件号码</th>
                            <th>手机号码</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="pf">
                            <tr>
                                <td>${pf.pname}</td>
                                <td>${pf.cardnum}</td>
                                <td>${pf.phone}</td>
                                <td><a href="del?pid=${pf.pid}">删除</a></td>
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

</html>