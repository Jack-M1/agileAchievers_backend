package org.example.services;

import org.example.daos.DeliveryEmployeeDao;
import org.example.exceptions.Entity;
import org.example.exceptions.FailedToCreateException;
import org.example.exceptions.InvalidException;
import org.example.models.DeliveryEmployeeRequest;
import org.example.models.Employee;
import org.example.validators.DeliveryEmployeeValidator;

import java.sql.SQLException;
import java.util.List;

public class DeliveryEmployeeService {
    DeliveryEmployeeDao deliveryEmployeeDao;
    DeliveryEmployeeValidator deliveryEmployeeValidator;

    public DeliveryEmployeeService(
            final DeliveryEmployeeDao deliveryEmployeeDao,
            final DeliveryEmployeeValidator deliveryEmployeeValidator) {
        this.deliveryEmployeeDao = deliveryEmployeeDao;
        this.deliveryEmployeeValidator = deliveryEmployeeValidator;
    }

    public List<Employee> getAllDeliveryEmployees() throws SQLException {
        return deliveryEmployeeDao.getAllDeliveryEmployees();
    }

    public int createDeliveryEmployee(
            final DeliveryEmployeeRequest deliveryEmployeeRequest)
            throws SQLException, InvalidException, FailedToCreateException {
        deliveryEmployeeValidator
                .validateDeliveryEmployee(deliveryEmployeeRequest);

        int id = deliveryEmployeeDao.createDeliveryEmployee(
                deliveryEmployeeRequest);

        if (id == -1) {
            throw new FailedToCreateException(Entity.DELIVERY);
        }
        return id;
    }

}
