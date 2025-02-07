package com.base.presentation.controllers;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import com.base.domain.dto.CarDTO;
import com.base.service.UserService;

@Path("/api/v1/car")
public class CarController {

    @Inject
    UserService userService;

    @POST
    public Response createAvatar(CarDTO car) {

        return userService.createCar(car);

    }

}
