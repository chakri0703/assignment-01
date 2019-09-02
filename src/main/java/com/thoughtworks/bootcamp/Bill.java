package com.thoughtworks.bootcamp;

import java.util.List;

public class Bill {

    private double amount;
    private  List<Friend> friend;
    String description;
    Friend friendPaid;


   public Bill(double amount,List friendList){
        this.amount=amount;
        this.friend=friendList;
    }
    public double settle() {
       return this.amount;

    }
}
