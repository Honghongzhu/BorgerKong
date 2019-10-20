package com.example.borgerkong;

public class Item {
    private String name;
    private int cost;
    private String description;
    private int imageDrawableId;

    public Item(String name, int cost, String description){
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.imageDrawableId = imageDrawableId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost(){
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}
