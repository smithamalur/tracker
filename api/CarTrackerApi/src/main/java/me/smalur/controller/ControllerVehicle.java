package me.smalur.controller;

import com.sun.org.apache.regexp.internal.RE;
import me.smalur.entity.Vehicle;
import me.smalur.service.ServiceVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */
@RestController //@Controller + @Responsebody
@RequestMapping(path="vehicles")
public class ControllerVehicle {

    @Autowired
    ServiceVehicle servicevehicle;

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> get(){
        return null;

    }
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> put(@RequestBody List<Vehicle> vehicles){

        return servicevehicle.put(vehicles);

    }
}
