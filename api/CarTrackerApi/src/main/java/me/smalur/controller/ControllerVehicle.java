package me.smalur.controller;

import me.smalur.entity.Vehicle;
import me.smalur.service.ServiceVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */
@CrossOrigin(origins = {"http://mocker.egen.io","http://localhost:8080"}, maxAge = 3600)
@RestController
@RequestMapping(value="vehicles")
public class ControllerVehicle {

    @Autowired
    private ServiceVehicle vehicleService;

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void insert(@RequestBody List<Vehicle> vehicle) {
        vehicleService.insert(vehicle);
    }
}

