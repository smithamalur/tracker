package me.smalur.controller;

import me.smalur.entity.Readings;
import me.smalur.service.ServiceReading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */
@RestController
@CrossOrigin(origins ="http://mocker.egen.io", maxAge=3600)
@RequestMapping(value = "readings")
public class ControllerReading {
    @Autowired
    private ServiceReading readingService;

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ServiceReading createReading(@RequestBody Readings vehicleReading){
        readingService.update(vehicleReading);
        return readingService;
    }

}
