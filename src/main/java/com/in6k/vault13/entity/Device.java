package com.in6k.vault13.entity;

/**
 * Created by Artem Klots on 8/10/16.
 */
public class Device {
    private Integer id;
    private String title;
    private String model;
    private String producer;
    private String serialNumber;
    private String comment;

    public Device(String title, String model, String producer, String serialNumber, String comment) {
        this.title = title;
        this.producer = producer;
        this.model = model;
        this.serialNumber = serialNumber;
        this.comment = comment;
    }

    public Device(String title, String model, String producer, String serialNumber) {
        this.title = title;
        this.producer = producer;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public Device(Integer id, String title, String model, String producer, String serialNumber, String comment) {
        this(title, model, producer, serialNumber, comment);
        this.id = id;
    }

    public Device(Integer id, String title, String model, String producer, String serialNumber) {
        this(title, model, producer, serialNumber);
        this.id = id;
    }

    public Device(Device device) {
        this.title = device.getTitle();
        this.producer = device.getProducer();
        this.model = device.getModel();
        this.serialNumber = device.getSerialNumber();
        this.comment = device.getComment();
    }

    public Device(Integer id, Device device) {
        this(device);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
