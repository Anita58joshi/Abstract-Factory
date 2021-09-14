package com.anita.proxy;

public class ProxyTester {

    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//
//        bankAccount.setBalance(1000);
//
//        AtmProxy payment = new AtmProxy();
//        payment.init(bankAccount,123);
//        payment.loadBalance(1000);
//
//        ChequeProxy chequeProxy = new ChequeProxy();
//        chequeProxy.init(bankAccount,"Anu");
//        chequeProxy.loadBalance(1000);
//
//        System.out.println(chequeProxy.checkBalance());
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setBalance(1000);
//
//        checkout(PaymentType.ATM,bankAccount, 200);
//
//        System.out.println(bankAccount.getBalance());
//
//
//    }
//
//    public static void checkout(PaymentType paymentType, BankAccount bankAccount,double amount) {
//        switch (paymentType) {
//            case ATM:
//                checkoutWithAtm(bankAccount, amount);
//                break;
//            case CHEQUE:
//                checkoutWithCheque(bankAccount, amount);
//                break;
//
//
//        }
//    }
//
//    public static void checkoutWithAtm (BankAccount bankAccount, double amount){
//            AtmProxy atmProxy = new AtmProxy();
//        atmProxy.init(bankAccount,123);
//        atmProxy.pay(amount);
//        }
//    public static void checkoutWithCheque (BankAccount bankAccount,double amount){
//        ChequeProxy chequeProxy = new ChequeProxy();
//        chequeProxy.init(bankAccount,"Anu");
//        chequeProxy.pay(amount);
//
//    }

        Database database = new MeroshareProxyCache();

        String[] participants = database.getDepositoryParticipant();

        for (String participant : participants) {
            System.out.println(participant);
        }

        System.out.println("***********************");
        String[] participants1 = database.getDepositoryParticipant();

        for (String participant : participants1) {
            System.out.println(participant);
        }
    }


}
