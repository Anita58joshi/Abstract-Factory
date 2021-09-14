package com.anita.proxy;

public class ChequeProxy implements Payment {
    private Payment payment;
    private String signature;


    public void init(Payment payment,String signature ) {
        this.payment = payment;
        this.signature = signature;
    }

    @Override
    public void loadBalance(double amount) {
        if(signature.equals("Anita")){
            payment.loadBalance(amount);
        }else{
            System.out.println("Incorrect Signature");
        }

    }

    @Override
    public double checkBalance() {
        if(signature.equals("Anita")){

            return payment.checkBalance();
        }else{
            System.out.println("Incorrect Signature");
        }
        return 0;
    }

    @Override
    public void pay(double amount) {
        if(signature.equals("Anita")){
            payment.pay(amount);
        }else{
            System.out.println("Incorrect Signature");
        }

    }
}
