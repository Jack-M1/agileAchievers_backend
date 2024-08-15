package org.example.models;

public class Employee {

    private String name;
    private double salary;
    private String bankAccountNum;
    private String nationalInsuranceNum;

    public Employee(final String name, final double salary,
                    final String bankAccountNum,
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
