package me.smalur.service;

import me.smalur.entity.Vehicle;

/**
 * Created by Smitha on 6/29/2017.
 */
public interface ServiceVehicle {
    Vehicle find (String vim);
    Vehicle update(Vehicle v);
    Vehicle create(Vehicle v);

}
