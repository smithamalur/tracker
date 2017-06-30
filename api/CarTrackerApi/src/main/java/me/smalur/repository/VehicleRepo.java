package me.smalur.repository;

import me.smalur.entity.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */

public interface VehicleRepo {

    Vehicle find(String vin);
    void  update(Vehicle v);
    void insert(Vehicle v);

}
