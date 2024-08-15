package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesEmployeeRequest {
    private int salesId;
    private double commissionRate;

    @JsonCreator
    public SalesEmployeeRequest(@JsonProperty("salesId")
                                    final int salesId,
                                @JsonProperty("commissionRate")
                                    final double commissionRate) {
        this.commissionRate = commissionRate;
        this.salesId = salesId;
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
