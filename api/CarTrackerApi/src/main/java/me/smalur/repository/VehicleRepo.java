package me.smalur.repository;

import me.smalur.entity.Vehicle;

/**
 * Created by Smitha on 6/29/2017.
 */
public interface VehicleRepo {
    Vehicle find(String vin);

    Vehicle create(Vehicle v);

    Vehicle update(Vehicle v);
}
