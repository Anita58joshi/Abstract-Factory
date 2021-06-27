package com.anita.factory;

import com.anita.test.factory.PaymentRequest;

public abstract class Payment {

    protected PaymentRequest paymentRequest;



    public void initializeRequest(PaymentRequest paymentRequest){
        this.paymentRequest = paymentRequest;
    }



    public Boolean validate(){
        if(paymentRequest.getAmount()!= null){
            int valuesign = paymentRequest.getAmount().compareTo(0D);

            if(valuesign == 1)
            {
                return true;
            }
            return false;
        }
        return true;


    }

    public abstract Object pay();
}
