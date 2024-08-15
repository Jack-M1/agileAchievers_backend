package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryEmployeeRequest {
    private String name;
    private double salary;
    private String bankAccountNum;
    private String nationalInsuranceNum;

    @JsonCreator
    public DeliveryEmployeeRequest(@JsonProperty("name") final String name,
                                   @JsonProperty("salary") final double salary,
                                   @JsonProperty("bank_acc")
                                   final String bankAccountNum,
                                   @JsonProperty("ni")
                                   final String nationalInsuranceNum) {
        this.name = name;
        this.salary = salary;
        this.bankAccountNum = bankAccountNum;
        this.nationalInsuranceNum = nationalInsuranceNum;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(final String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getNationalInsuranceNum() {
        return nationalInsuranceNum;
    }

    public void setNationalInsuranceNum(final String nationalInsuranceNum) {
        this.nationalInsuranceNum = nationalInsuranceNum;
    }
}
