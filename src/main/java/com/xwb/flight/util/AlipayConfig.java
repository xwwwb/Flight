package com.xwb.flight.util;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "9021000128655577";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCjpRyiA392g7fv0Ptl7S+1k0UeevsHEngQvbA86kr3mbnqHNhYNsSmgVdhOE7ue2m0HzBqbp1AA+QbPLbWQZW+l32RZahBvl1J+X0ArheHYCF0Z4DEYpiGsNvvPGJQCJn4SuwxJ+nQHujXqqlg4v9N1Rt0Rl7LQb2gs/PeQAWeSPbgjfiuofGAMJxqVX7H/TGHbfRQcSJJtO7mBh0kHc1TD7zn/HKK4JTR/OxpYeulb7VvFj0puh+/VbM3pyWOnnU4S/U5VdJTnd2mRcn1zuCajv5AulZiIbpPV19cGlHokZPPIh8cDD0h4CeacQU1xwZIETGwdDAfrGoVdtQR0yQnAgMBAAECggEAYbO6nKAqAcAymWPUNM6fpXD/22rhZR+Jv7UA+92GVL3bWgNOx5wrXJ3sZYcQ2SGlwny8k07nY8ju77QYFWOi29/mgGCJTHczi28BSt6l/ZVPZAhHwPh8yC3fob4TlGUOSEezLMX/uto5eknSRp5Af1+0vH8nKYNejAvkldTzhcRl+ZLqW3hWk1DDkarAJ0DRFBbk6/llYwQwwhN+ckJoKoe8wnP0uLKwjhJqqhJEnTDRv8szV8JvchRVqSnA8f6bNkmaKbyurmZyUHhhYNHcbUX56AFGxu0WV3oEelbhrtRURhSj08mOmUSdVeux4FCf6N2ngd/1YSRG7UqjPYlagQKBgQDNGYiU3W1ysUgnjPxPSTd0kI5+oC0uQ+PxexNp8aPk762OuN3QQ6a7jhx9k8ipD2xx6ISi8fwAWp01zowcM3Rzoi4KPkSbD/Xp66dFgcJEXk0up5Egv2DTt5JDl9CGWIWILdxNW70jz0WgUJAakwl3MOdklpua53lEZVDn4Gt27wKBgQDMQdwRLmgkfvzTEAaG8aeWaMRkjeNtbNAuGzRv2VV2aNPeqeg0YkpGjFl+MXotmcxQB/nK+u/aEHqtRELoGFPYT0SYT/jSfNTNvInHO41VvNfgx4OprKxL18fbTnJVSXO2dJFIWmsIjhgn9X+C3posyMW5AU00HqWDDeF1AuVmSQKBgEucyzaef3gWFZTHLEmKo5AsruvN33o7+zAOgLTBKfv/xItmahgaqMBifuxo7EQvdHp2D1gHQDFdNrIciJjo+1iaBMEv/ZjxBGcNwqgkU1tjLK8zhZR+GZNUDO8wa+brgacXyS0X0h3+jxuwN8AkTwwLEnOJ9qngBlwJwg8KNHQvAoGAVN+I8hq2a3PY2lruW2ROntEpyh6rQezVFFN5loBYYrtsTjmLozi0ZFwtU6J7gjdGDntB8HYU9Cek0hprMsXpERjfB+szGUOFqXeOSJsWP2oYye4dZ4O4lEs1YItYNtgunMITHF113DgvEWuRcG/O4I0Mm7NOwTl6zNoXtOdfKwECgYBugrHeWjSWcOG2q0bBqiCeXRw1DkO/WSs8xs0YLcteFVCsqceKEi01CpLBlHk8UXENDjTn0VTGLyZZkVjvzUfv6XhYntKrbqxUWYqB0zG2CicTkvoau2zalghICOU7tfyv8l0LcY17wcWYSvCsjzF9rp8TsU1Go25oNPGV+TelOw==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAo6UcogN/doO379D7Ze0vtZNFHnr7BxJ4EL2wPOpK95m56hzYWDbEpoFXYThO7ntptB8wam6dQAPkGzy21kGVvpd9kWWoQb5dSfl9AK4Xh2AhdGeAxGKYhrDb7zxiUAiZ+ErsMSfp0B7o16qpYOL/TdUbdEZey0G9oLPz3kAFnkj24I34rqHxgDCcalV+x/0xh230UHEiSbTu5gYdJB3NUw+85/xyiuCU0fzsaWHrpW+1bxY9Kbofv1WzN6cljp51OEv1OVXSU53dpkXJ9c7gmo7+QLpWYiG6T1dfXBpR6JGTzyIfHAw9IeAnmnEFNccGSBExsHQwH6xqFXbUEdMkJwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://java.xwwwb.com/order/returnurl";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

