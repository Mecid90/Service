package com.yigim1.yigim1.model;


public class Pay {
    private int id;
    private double amount;
    private int currency;
    private int transactionId;
    private String agent;
    private String pbmb;
    private String refNumber;

    public Pay() {
    }

    public Pay(int id, double amount, int currency, int transactionId, String agent, String pbmb, String refNumber) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.transactionId = transactionId;
        this.agent = agent;
        this.pbmb = pbmb;
        this.refNumber = refNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getPbmb() {
        return pbmb;
    }

    public void setPbmb(String pbmb) {
        this.pbmb = pbmb;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "id=" + id +
                ", amount=" + amount +
                ", currency=" + currency +
                ", transactionId=" + transactionId +
                ", agent='" + agent + '\'' +
                ", pbmb='" + pbmb + '\'' +
                ", refNumber=" + refNumber +
                '}';
    }
}
