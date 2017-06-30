package me.smalur.repository;

import me.smalur.entity.Readings;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Created by Smitha on 6/29/2017.
 */
@Repository
public class ReadingsRepoimpl implements ReadingsRepo{


    @PersistenceContext
    private EntityManager entityManager;


    public Readings createReadings(Readings readings ) {

        entityManager.persist(readings.getTyre());
        entityManager.persist(readings);
        return readings;
    }


}
