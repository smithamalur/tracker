package me.smalur.service;

import me.smalur.entity.Alerts;
import me.smalur.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Smitha on 6/29/2017.
 */

@Service
public class AlertServiceImpl implements AlertService {

    @Autowired
    private AlertRepository alertRepository;

    public void createAlert(List<Alerts> alerts) {
        for (Alerts alert : alerts) {
            alertRepository.createAlert(alert);
        }
    }
}
