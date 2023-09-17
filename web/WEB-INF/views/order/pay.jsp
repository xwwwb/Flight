<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>付款</title>
</head>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.xwb.flight.util.AlipayConfig"%>
<%@ page import="com.alipay.api.*"%>
<%@ page import="com.alipay.api.request.*"%>
<%@ page import="com.xwb.flight.domain.Order" %>
<%

	// 1.应用及商家的一些信息-》	AlipayConfig.java 类中
	//获得初始化的AlipayClient
	AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
	
	//设置请求参数
	AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	alipayRequest.setReturnUrl(AlipayConfig.return_url);
	alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
	//2.订单的信息-
	//从session中取出controller 添加的订单的数据
	Order order = (Order) session.getAttribute("order");

	String out_trade_no = new String(order.getOid().getBytes("ISO-8859-1"),"UTF-8");

	String total_amount = new String(Integer.toString(order.getOrderAmount()).getBytes("ISO-8859-1"),"UTF-8");

	String subject = new String("航班号 这里会报错".getBytes("ISO-8859-1"),"UTF-8");

	String body = new String(order.getPassengerFt().getPname().concat("的航班").getBytes("ISO-8859-1"),"UTF-8");
	
	alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
			+ "\"total_amount\":\""+ total_amount +"\"," 
			+ "\"subject\":\""+ subject +"\"," 
			+ "\"body\":\""+ body +"\"," 
			+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

	//请求
	String result = alipayClient.pageExecute(alipayRequest).getBody();
	
	//输出
	out.println(result);
%>
<body>
</body>
</html>