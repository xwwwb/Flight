package com.xwb.flight.domain;

import com.xwb.flight.domain.UserFt;

//封装passenger_ft表对应的实体类 封装常用旅客信息
public class PassengerFt {
    //     属性和方法
//    pid  int
    private Integer pid;
    //    pname    varchar
    private String pname;
    //    cardnum  varchar
    private String cardnum;
    //    phone    varchar
    private String phone;
    //    username varchar  业务主键
    private String username;
    //多对一
    private UserFt userFt;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserFt getUserFt() {
        return userFt;
    }

    public void setUserFt(UserFt userFt) {
        this.userFt = userFt;
    }

    @Override
    public String toString() {
        return "PassengerFt{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", cardnum='" + cardnum + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", userFt=" + userFt +
                '}';
    }
}
