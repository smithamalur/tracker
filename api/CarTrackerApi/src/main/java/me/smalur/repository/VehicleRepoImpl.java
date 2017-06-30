package me.smalur.repository;

import me.smalur.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */
@Repository
public class VehicleRepoImpl implements VehicleRepo{

    @PersistenceContext
    private EntityManager entityManager;



    public Vehicle find(String id) {
        return entityManager.find(Vehicle.class, id );

    }

    public void update(Vehicle vehicles)
    {
         entityManager.merge(vehicles);
    }

    public void insert(Vehicle v) {
        entityManager.persist(v);

    }

}
