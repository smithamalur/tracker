package me.smalur.repository;

import me.smalur.entity.Readings;
import me.smalur.entity.Tyre;
import me.smalur.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Smitha on 6/29/2017.
 */
@Repository
public class ReadingsRepoimpl implements ReadingsRepo{

    @PersistenceContext
    private EntityManager entitymanager;

    public Readings create(Readings reading) {

        Tyre tire = reading.getTyre();
        entitymanager.persist(tire);

        Vehicle vehicle = entitymanager.find(Vehicle.class, reading.getVin());

        if(reading.isCheckEngineLoghtOn() || reading.isEngineCoolantLow()){
            reading.setPriority("LOW");
            reading.setAlert(true);
        }else if(tire.getFrontLeft()<32 || tire.getFrontLeft()>36 || tire.getFrontRight()<32
                ||tire.getFrontRight() >36 || tire.getRearleft()<32 || tire.getRearleft()>36
                || tire.getRearRight()<32 || tire.getRearRight()>36){
            reading.setAlert(true);
            reading.setPriority("LOW");

        }

        else if(reading.getFuelVolume() <(vehicle.getMaxFuelVolume() *0.1)){
            reading.setPriority("MEDIUM");
            reading.setAlert(true);
        }

        else if(reading.getEngineRpm()>vehicle.getRedlineRpm()){
            reading.setAlert(true);
            reading.setPriority("HIGH");
        }
        entitymanager.persist(reading);
        return reading;
    }
}
