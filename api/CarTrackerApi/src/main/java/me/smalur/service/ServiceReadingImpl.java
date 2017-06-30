package me.smalur.service;


import me.smalur.entity.Alerts;
import me.smalur.entity.Readings;
import me.smalur.entity.Vehicle;
import me.smalur.exception.ResourceNotFoundException;
import me.smalur.repository.ReadingsRepo;
import me.smalur.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */
@Service
public class ServiceReadingImpl implements ServiceReading{
    @Autowired
    private ReadingsRepo readingRepository;
    @Autowired
    private VehicleRepo vehicleRepository;
    @Autowired
    private AlertServiceImpl alertService;

    @Transactional
    public Readings update(Readings vehicleReading) {
        Vehicle existingVehicle = vehicleRepository.find(vehicleReading.getVin());
        if(existingVehicle==null)
            throw new ResourceNotFoundException("Vehicle with id= "+vehicleReading.getVin()+" not found");
        List<Alerts> alerts = getAlerts(vehicleReading, existingVehicle);
        alertService.createAlert(alerts);
        return readingRepository.createReadings(vehicleReading);
    }

    private List<Alerts> getAlerts(Readings vehicleReading, Vehicle existingVehicle) {
        List<Alerts> alertsList = new ArrayList<Alerts>();

        if(vehicleReading.getEngineRpm()>existingVehicle.getRedlineRpm()) {
            Alerts newAlert = new Alerts();
            newAlert.setVin(vehicleReading.getVin());
            newAlert.setTimestamp(Calendar.getInstance().getTime());
            newAlert.setMessage("High Engine Rpm");
            newAlert.setPriority("HIGH");
            alertsList.add(newAlert);
        }

        if(vehicleReading.getFuelVolume()< (0.1*existingVehicle.getMaxFuelVolume())) {
            Alerts newAlert = new Alerts();
            newAlert.setVin(vehicleReading.getVin());
            newAlert.setTimestamp(Calendar.getInstance().getTime());
            newAlert.setMessage("Fuel Volume is reduced ");
            newAlert.setPriority("MEDIUM");
            alertsList.add(newAlert);
        }

        if(vehicleReading.getTire().getFrontLeft()<32 || vehicleReading.getTire().getFrontLeft()>36) {
            Alerts newAlert = new Alerts();
            newAlert.setVin(vehicleReading.getVin());
            newAlert.setTimestamp(Calendar.getInstance().getTime());
            newAlert.setMessage("Front left tire pressure is low");
            newAlert.setPriority("LOW");
            alertsList.add(newAlert);
        }

        if(vehicleReading.getTire().getFrontRight()<32 || vehicleReading.getTire().getFrontRight()>36) {
            Alerts newAlert = new Alerts();
            newAlert.setVin(vehicleReading.getVin());
            newAlert.setTimestamp(Calendar.getInstance().getTime());
            newAlert.setMessage("Front right tire pressure is low");
            newAlert.setPriority("LOW");
            alertsList.add(newAlert);
        }

        if(vehicleReading.getTire().getRearLeft()<32 || vehicleReading.getTire().getRearLeft()>36) {
            Alerts newAlert = new Alerts();
            newAlert.setVin(vehicleReading.getVin());
            newAlert.setTimestamp(Calendar.getInstance().getTime());
            newAlert.setMessage("Rear left tire pressure is low");
            newAlert.setPriority("LOW");
            alertsList.add(newAlert);
        }

        if(vehicleReading.getTire().getRearRight()<32 || vehicleReading.getTire().getRearRight()>36) {
            Alerts newAlert = new Alerts();
            newAlert.setVin(vehicleReading.getVin());
            newAlert.setTimestamp(Calendar.getInstance().getTime());
            newAlert.setMessage("Rear right tire pressure is low");
            newAlert.setPriority("LOW");
            alertsList.add(newAlert);
        }

        if(vehicleReading.isCheckEngineLightOn()||vehicleReading.isEngineCoolantLow()) {
            Alerts newAlert = new Alerts();
            newAlert.setVin(vehicleReading.getVin());
            newAlert.setTimestamp(Calendar.getInstance().getTime());
            if(vehicleReading.isCheckEngineLightOn()) {
                newAlert.setMessage("light is on");
            } else  {
                newAlert.setMessage("coolant is low");
            }
            newAlert.setPriority("LOW");
            alertsList.add(newAlert);
        }
        return alertsList;
    }

}
