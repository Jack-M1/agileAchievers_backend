package org.example.services;

import org.example.daos.SalesEmployeeDao;
import org.example.exceptions.Entity;
import org.example.exceptions.FailedToCreateException;
import org.example.exceptions.InvalidException;
import org.example.models.SalesEmployeeRequest;

import java.sql.SQLException;

public class SalesEmployeeService {
    SalesEmployeeDao salesEmployeeDao;

    public SalesEmployeeService(final SalesEmployeeDao salesEmployeeDao) {
        this.salesEmployeeDao = salesEmployeeDao;
    }

    public int createSalesEmployee(final SalesEmployeeRequest
                                           salesEmployeeRequest) throws
            SQLException, InvalidException, FailedToCreateException {
        int id = salesEmployeeDao.createSalesEmployee(salesEmployeeRequest);

        if (id == -1) {
            throw new FailedToCreateException(Entity.SALESEMPLOYEE);
        }
        return id;
    }
}
