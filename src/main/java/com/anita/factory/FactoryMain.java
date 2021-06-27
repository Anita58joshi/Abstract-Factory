package com.anita.factory;

import com.anita.test.factory.PaymentRequest;

public class FactoryMain {
    public static void main(String[] args) {
        String operator = args[0];
        Double operand1 = Double.parseDouble(args[1]);
        Double operand2 = Double.parseDouble(args[2]);

        MathCommand mathCommand = MathCommandFactory.get(operator);
        System.out.println(mathCommand.calculate(1D,2D));

        Payment payment = PaymentFactory.get(PaymentType.ESEWA);
        payment.initializeRequest(new PaymentRequest("Kitkat",60D));
        System.out.println(payment.pay());



    }

}
