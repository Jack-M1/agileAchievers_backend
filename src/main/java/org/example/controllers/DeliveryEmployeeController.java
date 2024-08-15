package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.services.DeliveryEmployeeService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
    public Response getDeliveryEmployees() throws SQLException {
        return Response
                .ok()
                .entity(deliveryEmployeeService.getAllDeliveryEmployees())
                .build();
    }
}
