package com.yigim1.yigim1.service;


import com.yigim1.yigim1.model.Pay;

public class Servis {


    public Pay checkPayment(Pay pay){
        System.out.println("id: " + pay.getId() + " amount: "
                + pay.getAmount() + " currency: " + pay.getCurrency() +" transactionId: "
                + pay.getTransactionId() + "agent: "
                + pay.getAgent() + "pmbm: "
                + pay.getPbmb());
        return pay;
    }

}
