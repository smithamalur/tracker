package me.smalur.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Smitha on 6/29/2017.
 */
@Entity
public class Readings {

    @Id
    @Column(columnDefinition = "CHAR(17)")
    private String vin;

    private double latitude;
    private double longitude;

    @Column (columnDefinition = "VARCHAR(24)")
    private String timestamp;

    private float fuelVolume;

    private float speed;

    private float engineHp;

    @Type(type = "numeric_boolean")
    private boolean checkEngineLoghtOn;

    @Type(type = "numeric_boolean")
    private boolean engineCoolantLow;

    @Type(type = "numeric_boolean")
    private boolean cruiseControlOn;

    private float engineRpm;

    @OneToOne
    private Tyre tyre;

    @Column(columnDefinition = "numeric_boolean")
    private boolean alert;

    @Column(columnDefinition = "VARCHAR(5)")
    private String priority;

    public Readings(){
        this.vin =vin;
        this.alert =false;
        this.priority = "NIL";
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(float engineHp) {
        this.engineHp = engineHp;
    }

    public boolean isCheckEngineLoghtOn() {
        return checkEngineLoghtOn;
    }

    public void setCheckEngineLoghtOn(boolean checkEngineLoghtOn) {
        this.checkEngineLoghtOn = checkEngineLoghtOn;
    }

    public boolean isEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public float getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(float engineRpm) {
        this.engineRpm = engineRpm;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public boolean isAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        this.alert = alert;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
