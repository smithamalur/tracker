package me.smalur.service;

import me.smalur.entity.Vehicle;
import me.smalur.exception.BadRequestException;
import me.smalur.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */
@Service
public class ServiceVehicleImpl implements ServiceVehicle{
    @Autowired
    VehicleRepo vrep;
    @Transactional
    public List<Vehicle> put(List<Vehicle> v){
        if( v== null || v.size()==0){
            throw new BadRequestException("PUT request must have a body")
        }

        for(Vehicle vehicle: v){
            Vehicle tempvehicle = this.find(vehicle.getVin());
            if(tempvehicle == null){
                this.create(vehicle);

            }
            else{
                this.update(vehicle);
            }
        }
        return v;
    }
    public Vehicle find(String vin) {
        return vrep.find(vin);
    }

    public Vehicle update(Vehicle v) {
        Vehicle tempvehicle = this.find(v.getVin());
        if(tempvehicle == null)
            throw new ResourceNotFoundException(v.getVin()+"Unavailable");

        return vrep.update(v);
    }


    public Vehicle create(Vehicle v) {
        Vehicle tempvehicle = this.find(v.getVin());

        if(tempvehicle != null){
            throw new BadRequestException(v.getVin()+"already exists");
        }
        return vrep.create(v);
    }
}
