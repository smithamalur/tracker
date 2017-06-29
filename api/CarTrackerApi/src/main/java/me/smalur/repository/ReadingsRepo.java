package me.smalur.repository;

import me.smalur.entity.Readings;
import org.springframework.stereotype.Repository;

/**
 * Created by Smitha on 6/29/2017.
 */
public interface ReadingsRepo {

    Readings create(Readings reading);
}
