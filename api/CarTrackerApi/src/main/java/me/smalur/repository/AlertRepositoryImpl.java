package me.smalur.repository;

import javafx.scene.control.Alert;
import me.smalur.entity.Alerts;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Smitha on 6/29/2017.
 */
@Repository
public class AlertRepositoryImpl implements AlertRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Alerts createAlert(Alerts alert) {
        entityManager.persist(alert);
        return alert;
    }


}
