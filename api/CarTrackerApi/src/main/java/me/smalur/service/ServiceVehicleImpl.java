package me.smalur.service;

import me.smalur.entity.Vehicle;
import me.smalur.exception.ResourceNotFoundException;
import me.smalur.repository.VehicleRepo;
import me.smalur.repository.VehicleRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */
@Service
public class ServiceVehicleImpl implements ServiceVehicle {

    @Autowired
    private VehicleRepo vehicleRepository;

    @Transactional
    public void insert(List<Vehicle> vehicleList) {
        for (Vehicle v : vehicleList) {
            Vehicle existingVehicle = vehicleRepository.find(v.getVin());
            if (existingVehicle == null) {
                vehicleRepository.insert(v);
            }
            vehicleRepository.update(v);
        }
    }
}