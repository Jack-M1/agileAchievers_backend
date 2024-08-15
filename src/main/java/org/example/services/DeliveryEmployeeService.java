package org.example.services;

import org.example.daos.DeliveryEmployeeDao;
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

}
