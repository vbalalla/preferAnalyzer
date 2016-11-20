package com.example.view;

import java.util.List;

/**
 * Created by vibodha on 11/19/16.
 */
public class Coordinates {
    private String type;
    private List<Long> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Long> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Long> coordinates) {
        this.coordinates = coordinates;
    }
}
