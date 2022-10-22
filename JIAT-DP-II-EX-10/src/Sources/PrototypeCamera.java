/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sources;

/**
 *
 * @author grays
 */
public class PrototypeCamera implements Prototype {

    private String brand;
    private String model;
    private String type;
    private String sensor;
    private String image_sensor;
    private String video_resolution;
    private String storage;
    private boolean flash;
    private boolean lcd_display;

    public PrototypeCamera(String brand, String model, String type, String sensor, String image_sensor, String video_resolution, String storage, boolean flash, boolean lcd_display) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.sensor = sensor;
        this.image_sensor = image_sensor;
        this.video_resolution = video_resolution;
        this.storage = storage;
        this.flash = flash;
        this.lcd_display = lcd_display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getImage_sensor() {
        return image_sensor;
    }

    public void setImage_sensor(String image_sensor) {
        this.image_sensor = image_sensor;
    }

    public String getVideo_resolution() {
        return video_resolution;
    }

    public void setVideo_resolution(String video_resolution) {
        this.video_resolution = video_resolution;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public boolean isFlash() {
        return flash;
    }

    public void setFlash(boolean flash) {
        this.flash = flash;
    }

    public boolean isLcd_display() {
        return lcd_display;
    }

    public void setLcd_display(boolean lcd_display) {
        this.lcd_display = lcd_display;
    }

    @Override
    public PrototypeCamera clone() {
        return new PrototypeCamera(this.brand, this.model, this.type, sensor, this.image_sensor, this.video_resolution, this.storage, this.flash, this.lcd_display);
    }

    @Override
    public String toString() {
        String isFlash = this.flash ? "Yes" : "No";
        String isLcd = this.lcd_display ? "Yes" : "No";
        return "brand=" + brand + "\n Model=" + model + "\n Type=" + type + "\n sensor=" + sensor + "\n image_sensor=" + image_sensor + "\n video_resolution=" + video_resolution + "\n storage=" + storage + "\n flash=" +isFlash+"\n lcd_display=" + isLcd;
    }

}
