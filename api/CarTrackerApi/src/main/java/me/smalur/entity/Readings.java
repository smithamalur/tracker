package me.smalur.entity;

/**
 * Created by Smitha on 6/29/2017.
 */
public class Readings {

    private String vin;

    private double latitude;

    private double longitude;

    private String timestamp;

    private float fuelVolume;

    private float speed;

    private float engineHp;

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

    private boolean checkEngineLoghtOn;

    private boolean engineCoolantLow;

    private boolean cruiseControlOn;

    private float engineRpm;

    private Tyre tyre;

}
