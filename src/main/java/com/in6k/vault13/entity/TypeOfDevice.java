package com.in6k.vault13.entity;

/**
 * Created by employee on 8/10/16.
 */
public class TypeOfDevice {
    private Integer id;
    private String title;

    public TypeOfDevice(String title) {
        this.title = title;
    }

    public TypeOfDevice(Integer id, String title) {
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
        return "TypeOfDevice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
