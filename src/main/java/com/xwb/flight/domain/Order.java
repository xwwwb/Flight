package com.xwb.flight.domain;

import com.xwb.flight.domain.Flight;
import com.xwb.flight.domain.PassengerFt;

import java.util.Date;

public class Order {

    private String oid;
    private Date orderTime;
    private int orderAmount;
    private int orderStatus;
    private String username;
    private int fid;
    private int pid;
    private Flight flight;
    private PassengerFt passengerFt;

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", orderTime=" + orderTime +
                ", orderAmount=" + orderAmount +
                ", orderStatus=" + orderStatus +
                ", username='" + username + '\'' +
                ", fid=" + fid +
                ", pid=" + pid +
                ", flight=" + flight +
                ", passengerFt=" + passengerFt +
                '}';
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public PassengerFt getPassengerFt() {
        return passengerFt;
    }

    public void setPassengerFt(PassengerFt passengerFt) {
        this.passengerFt = passengerFt;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

}

