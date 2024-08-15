package org.example.validators;

import org.example.exceptions.Entity;
import org.example.exceptions.InvalidException;
import org.example.models.DeliveryEmployeeRequest;

public class DeliveryEmployeeValidator {

    private final int nameLength = 50;
    private final int niLength = 9;
    private final int bankNumLength = 8;
    private final int salaryMax = 100000000;

    public void validateDeliveryEmployee(
            final DeliveryEmployeeRequest deliveryEmployeeRequest)
            throws InvalidException {
        if (deliveryEmployeeRequest.getName().length() > nameLength) {
            throw new InvalidException(Entity.DELIVERY,
                    "Name is greater than 50 characters");
        }
        if (deliveryEmployeeRequest.getSalary() < 0
                || deliveryEmployeeRequest.getSalary() > salaryMax) {
            throw new InvalidException(Entity.DELIVERY,
                    "Salary is out of bounds.");
        }

        if (deliveryEmployeeRequest.getNationalInsuranceNum().length()
                > niLength) {
            throw new InvalidException(Entity.DELIVERY,
                    "NI Number is greater than 9 characters");
        }

        if (deliveryEmployeeRequest.getBankAccountNum().length()
                > bankNumLength) {
            throw new InvalidException(Entity.DELIVERY,
                    "Bank Acc Number is greater than 8 characters");
        }
    }
}
