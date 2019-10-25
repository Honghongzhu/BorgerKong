package com.example.borgerkong;

public class Item {
    private int itemID;
    private String name;
    private double cost;
    private String description;
    private int imageDrawableId;
    private int amountOrdered;
    private boolean ordered;

    public Item(int itemID, String name, double cost, String description, int imageDrawableId, int amountOrdered, boolean ordered){
        this.itemID = itemID;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.imageDrawableId = imageDrawableId;
        this.amountOrdered = amountOrdered;
        this.ordered = ordered;
    }

    public int getItemID(){
        return itemID;
    }

    public String getName(){
        return name;
    }

    public Double getCost(){
        return cost;
    }

    public String getDescription(){
        return description;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public int getAmountOrdered() {
        return amountOrdered;
    }

    public void setAmountOrdered(int amountOrdered) {
        this.amountOrdered = amountOrdered;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }
}
