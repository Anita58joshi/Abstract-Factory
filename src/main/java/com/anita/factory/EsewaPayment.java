package com.anita.factory;

import com.anita.test.factory.PaymentRequest;

public class EsewaPayment extends Payment{



    @Override
    public Object pay() {
        return "Esewa Wallet payment for amount : "
                +paymentRequest.getAmount()+ "for the product : "
                + paymentRequest.getProduct();
    }
}
