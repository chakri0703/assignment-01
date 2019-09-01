package com.thoughtworks.bootcamp;

public class Bill {

    private double amount;
    Bill(double amount){
        this.amount=amount;
    }
    public double settle() {
        return this.amount;
    }
}
