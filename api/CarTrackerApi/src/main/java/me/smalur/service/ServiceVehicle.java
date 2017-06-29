package me.smalur.service;

import me.smalur.entity.Vehicle;

import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */
public interface ServiceVehicle {// TODO: 6/29/2017
    List<Vehicle> put (List<Vehicle> v);
    Vehicle find (String vim);
    Vehicle update(Vehicle v);
    Vehicle create(Vehicle v);

}
