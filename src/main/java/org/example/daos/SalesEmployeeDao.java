package org.example.daos;


import org.example.models.SalesEmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesEmployeeDao {
    public int createSalesEmployee(
            final SalesEmployeeRequest salesEmployeeRequest
            ) throws SQLException {
        Connection connection = DatabaseConnector.getConnection();
        String insertStatement =
                "INSERT INTO SalesComm (id, commission_rate)"
                + " VALUES (?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(
                insertStatement);

        preparedStatement.setInt(1,
                salesEmployeeRequest.getSalesId());
        preparedStatement.setDouble(2,
                salesEmployeeRequest.getCommissionRate());

        preparedStatement.executeUpdate();

        ResultSet rs = preparedStatement.getGeneratedKeys();

        if (rs.next()) {
            return rs.getInt(1);
        }
        return -1;
    }
}
