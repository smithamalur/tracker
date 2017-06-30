package me.smalur.repository;

import me.smalur.entity.Alerts;

/**
 * Created by Smitha on 6/29/2017.
 */
public interface AlertRepository {

    Alerts createAlert(Alerts alert);
}