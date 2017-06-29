package me.smalur.repository;

import me.smalur.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Smitha on 6/29/2017.
 */
@Repository
public class VehicleRepoImpl implements VehicleRepo{

    @PersistenceContext
    private EntityManager entityManager;

    public Vehicle find(String vin) {
        return entityManager.find(Vehicle.class, vin);
    }

    public Vehicle create(Vehicle v) {
         entityManager.persist(v);
         return v;
    }

    public Vehicle update(Vehicle v) {
        return entityManager.merge(v);
    }
}
