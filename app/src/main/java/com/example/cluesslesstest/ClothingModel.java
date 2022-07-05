package com.example.cluesslesstest;

public class ClothingModel {

    private int clothingId;
    private String clothingName;
    private String clothingColour;
    private String clothingType;

    public ClothingModel(int clothingId, String clothingName, String clothingColour, String clothingType) {
        this.clothingId = clothingId;
        this.clothingName = clothingName;
        this.clothingColour = clothingColour;
        this.clothingType = clothingType;
    }

    public int getClothingId() {
        return clothingId;
    }

    public void setClothingId(int clothingId) {
        this.clothingId = clothingId;
    }

    public String getClothingName() {
        return clothingName;
    }

    public void setClothingName(String clothingName) {
        this.clothingName = clothingName;
    }

    public String getClothingColour() {
        return clothingColour;
    }

    public void setClothingColour(String clothingColour) {
        this.clothingColour = clothingColour;
    }

    public String getClothingType() {
        return clothingType;
    }

    public void setClothingType(String clothingType) {
        this.clothingType = clothingType;
    }

    @Override
    public String toString() {
        return "ClothingModel{" +
                "clothingid=" + clothingId +
                ", clothingName='" + clothingName + '\'' +
                ", clothingColour='" + clothingColour + '\'' +
                ", clothingType='" + clothingType + '\'' +
                '}';
    }
}
