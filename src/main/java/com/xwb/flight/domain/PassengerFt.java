package com.xwb.flight.domain;

public class PassengerFt {
    private  Integer pid;
    private String pname;
    private String cardnum;

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

    private String phone;
    private UserFt userFt;

    @Override
    public String toString() {
        return "PassengerFt{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", cardnum='" + cardnum + '\'' +
                ", phone='" + phone + '\'' +
                ", userFt=" + userFt +
                '}';
    }
}
