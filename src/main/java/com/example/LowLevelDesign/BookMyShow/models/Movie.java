package com.example.LowLevelDesign.BookMyShow.models;

import java.util.List;

public class Movie extends BaseModel{

    private double rating;
    private String name;
    private List<Feature> features;


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
