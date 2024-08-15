package org.example.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.example.exceptions.FailedToCreateException;
import org.example.exceptions.InvalidException;
import org.example.models.DeliveryEmployeeRequest;
import org.example.models.Employee;
import org.example.models.UserRole;
import org.example.services.DeliveryEmployeeService;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api("Engineering Academy Delivery Employee API")
@Path("/api")
public class DeliveryEmployeeController {
    DeliveryEmployeeService deliveryEmployeeService;

    public DeliveryEmployeeController(
            final DeliveryEmployeeService deliveryEmployeeService) {
        this.deliveryEmployeeService = deliveryEmployeeService;
    }

    @GET
    @Path("/delivery")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed({UserRole.ADMIN, UserRole.HR})
    @ApiOperation(
            value = "Returns a list of delivery employees",
            authorizations = @Authorization(value = HttpHeaders.AUTHORIZATION),
            response = Employee.class
    )
    public Response getDeliveryEmployees() throws SQLException {
        return Response
                .ok()
                .entity(deliveryEmployeeService.getAllDeliveryEmployees())
                .build();
    }

    @POST
    @Path("/delivery")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createDeliveryEmployee(
            final DeliveryEmployeeRequest deliveryEmployeeRequest) {
        try {
            return Response
                    .status(Response.Status.CREATED)
                    .entity(deliveryEmployeeService.createDeliveryEmployee(
                            deliveryEmployeeRequest))
                    .build();
        } catch (FailedToCreateException | SQLException e) {
            System.out.println(e);
            return Response.serverError().build();
        } catch (InvalidException e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage()).build();
        }
    }
}
