package com.miejemplo.model;

import java.util.ArrayList;
import java.util.List;

public class Mascota {

    private long id;
    private String name;
    private List<String> photoUrls;
    private String status;

    public Mascota(long id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.photoUrls = new ArrayList<>();
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public List<String> getPhotoUrls() { return photoUrls; }
    public String getStatus() { return status; }
    public void setId(long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setStatus(String status) { this.status = status; }
}