package com.yigim1.yigim1.model;

public class Check {

    private String refNumber;

    public Check(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    @Override
    public String toString() {
        return "Check{" +
                "refNumber='" + refNumber + '\'' +
                '}';
    }
}
