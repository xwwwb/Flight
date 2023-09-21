<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="utf-8">
    <link rel="stylesheet" href="/resources/common/css/sapar.css" />
    <link rel="stylesheet" type="text/css" href="/resources/common/css/common.css" />
    <script type="text/javascript" src="/resources/common/js/jquery.js"></script>
    <script type="text/javascript" src="/resources/common/js/sapar.js"></script>
    <script type="text/javascript" src="/resources/common/js/WdatePicker.js"></script>
    <title>新增旅客</title>
</head>

<body>
<div id="saper-container">
    <div id="saper-hd"></div>
    <div id="saper-bd">
        <div class="subfiled clearfix">
            <h2>新增旅客</h2>
        </div>
        <div class="subfiled-content">
            <form class="saper-form" action="add" onsubmit="return handleSubmit()">
                <div class="kv-item clearfix">
                    <label>旅客姓名：</label>
                    <div class="kv-item-content">
                        <input type="text" placeholder="请输入旅客姓名" name="pname" >
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>身份证号：</label>
                    <div class="kv-item-content">
                        <input type="text" placeholder="身份证号码" name="cardnum">
                    </div>
                </div>

                <div class="kv-item clearfix">
                    <label>短信内容：</label>
                    <div class="kv-item-content">
                        <input type="text" placeholder="手机号码" num="phone">
                    </div>
                    <div class="kv-item-tip">请正确填写11位手机号码</div>
                </div>

                <div class="kv-item clearfix">
                    <label></label>
                    <div class="kv-item-content">
                        <input type="submit" class="sapar-btn sapar-btn-recom query-btn" value="提交">
                        <a href="javascript:history.back(-1)" class="a-btn">返回 </a>
                    </div>
                </div>


            </form>

        </div>
    </div>
    <div id="saper-ft"></div>
</div>

</body>

<script type="text/javascript">
    $('select').iSelect();
    const handleSubmit = (e)=>{
       let input= document.querySelector('input[name="cardnum"]');
        let {value} = input;
        if(value.length!==18){
            alert('身份证号码不正确 会导致后续模板渲染出错 ');
            return false;
        }else{
            return true;
        }
    }
</script>
</html>