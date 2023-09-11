package com.xwb.flight.domain;


import java.util.Date;

public class Flight {
    //    fid  int
    private Integer fid;
    //    flight_num   varchar
    private String flightNum;
    //    flight_date  date
    private Date flightDate;
    //    departure_city   varchar
    private String departureCity;
    //    arrival_city varchar
    private String arrivalCity;
    //    departure_time   time  时分秒
    private Date departureTime;
    //    arrival_time time
    private Date arrivalTime;
    //    ticket_price int
    private Integer ticketPrice;
    //    ticket_left  int
    private Integer ticketLeft;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Integer getTicketLeft() {
        return ticketLeft;
    }

    public void setTicketLeft(Integer ticketLeft) {
        this.ticketLeft = ticketLeft;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fid=" + fid +
                ", flightNum='" + flightNum + '\'' +
                ", flightDate=" + flightDate +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", ticketPrice=" + ticketPrice +
                ", ticketLeft=" + ticketLeft +
                '}';
    }
}


