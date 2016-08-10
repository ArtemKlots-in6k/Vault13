package com.in6k.vault13.entity;

/**
 * Created by Artem Klots on 8/10/16.
 */
public class Device {
    private Integer id;
    private String title;

    public Device(String title) {
        this.title = title;
    }

    public Device(Integer id, String title) {
        this(title);
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

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
