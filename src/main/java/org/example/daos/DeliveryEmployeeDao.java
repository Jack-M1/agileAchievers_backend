package org.example.daos;

import org.example.models.Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeliveryEmployeeDao {
    public static final int BANK_ACCOUNT_NUM_INDEX = 3;
    public static final int NATIONAL_INSURANCE_NUM_INDEX = 4;
    public static final int DELIVERY_EMPLOYEE_ID_INDEX = 5;

    public List<Employee> getAllDeliveryEmployees() throws SQLException {
        List<Employee> deliveryEmployees = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()) {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "SELECT id, name as `delivery_emp_name`, salary,"
                            + " bank_acc, ni FROM Employee WHERE type = 1;"
            );

            while (resultSet.next()) {
                Employee deliveryEmployee = new Employee(
                        resultSet.getString("delivery_emp_name"),
                        resultSet.getDouble("salary"),
                        resultSet.getString("bank_acc"),
                        resultSet.getString("ni")
                );
                deliveryEmployees.add(deliveryEmployee);
            }
        }

        return deliveryEmployees;
    }
}
