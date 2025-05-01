package com.example.LowLevelDesign.BookMyShow.models;

import java.util.List;

public class Region extends BaseModel {
    private String name;
    private List<Theatre> theatreList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }
}
