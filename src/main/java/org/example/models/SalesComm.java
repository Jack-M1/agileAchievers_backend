package org.example.models;

public class SalesComm {
    private int salesId;
    private double commissionRate;

    public SalesComm(final int salesId, final double commissionRate) {
        this.salesId = salesId;
        this.commissionRate = commissionRate;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(final int salesId) {
        this.salesId = salesId;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(final double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
