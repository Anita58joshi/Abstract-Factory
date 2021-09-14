package com.anita.proxy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AtmProxy implements Payment{

    private Payment payment;
    private int actualPin;


    public void init(Payment payment,int actualPin ) {
        this.payment = payment;
        this.actualPin = actualPin;
    }

    @Override
    public void loadBalance(double amount) {
        if(actualPin==123){
             payment.loadBalance(amount);
        }else{
            System.out.println("Incorrect Pin");
        }

    }

    @Override
    public double checkBalance() {
        if(actualPin==123){

            return payment.checkBalance();
        }else{
            System.out.println("Incorrect Pin");
        }
        return 0;
    }

    @Override
    public void pay(double amount) {
        if(actualPin==123){
            payment.pay(amount);
        }else{
            System.out.println("Incorrect Pin");
        }

    }
}
