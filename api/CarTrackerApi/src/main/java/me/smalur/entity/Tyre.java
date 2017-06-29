package me.smalur.entity;

import javax.persistence.Id;

/**
 * Created by Smitha on 6/29/2017.
 */
public class Tyre {
    @Id
    private String id;


    private float frontLeft;

    private float frontRight;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(float frontLeft) {
        this.frontLeft = frontLeft;
    }

    public float getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(float frontRight) {
        this.frontRight = frontRight;
    }

    public float getRearleft() {
        return rearleft;
    }

    public void setRearleft(float rearleft) {
        this.rearleft = rearleft;
    }

    public float getRearRight() {
        return rearRight;
    }

    public void setRearRight(float rearRight) {
        this.rearRight = rearRight;
    }

    private float rearleft;

    private float rearRight;


}
