package com.manager.model;

public class Scupper {

    private Integer id;
    private Double roofArea;
    private Double scupperSideX;
    private Double scupperSideY;
    private Double realScupperArea;
    private Double activeScupperArea;
    private Double waterLevel;
    private Double bottomScupperLevelOverRoof;
    private Integer numberOfScuppers;

    public Scupper() {
    }

    public Integer getId() {
        return id;
    }

    public Scupper setId(Integer id) {
        this.id = id;
        return this;
    }

    public Double getRoofArea() {
        return roofArea;
    }

    public Scupper setRoofArea(Double roofArea) {
        this.roofArea = roofArea;
        return this;
    }

    public Double getScupperSideX() {
        return scupperSideX;
    }

    public Scupper setScupperSideX(Double scupperSideX) {
        this.scupperSideX = scupperSideX;
        return this;
    }

    public Double getScupperSideY() {
        return scupperSideY;
    }

    public Scupper setScupperSideY(Double scupperSideY) {
        this.scupperSideY = scupperSideY;
        return this;
    }

    public Double getRealScupperArea() {
        return realScupperArea;
    }

    public Scupper setRealScupperArea(Double realScupperArea) {
        this.realScupperArea = realScupperArea;
        return this;
    }

    public Double getActiveScupperArea() {
        return activeScupperArea;
    }

    public Scupper setActiveScupperArea(Double activeScupperArea) {
        this.activeScupperArea = activeScupperArea;
        return this;
    }

    public Double getWaterLevel() {
        return waterLevel;
    }

    public Scupper setWaterLevel(Double waterLevel) {
        this.waterLevel = waterLevel;
        return this;
    }

    public Double getBottomScupperLevelOverRoof() {
        return bottomScupperLevelOverRoof;
    }

    public Scupper setBottomScupperLevelOverRoof(Double bottomScupperLevelOverRoof) {
        this.bottomScupperLevelOverRoof = bottomScupperLevelOverRoof;
        return this;
    }

    public Integer getNumberOfScuppers() {
        return numberOfScuppers;
    }

    public Scupper setNumberOfScuppers(Integer numberOfScuppers) {
        this.numberOfScuppers = numberOfScuppers;
        return this;
    }

    public Scupper build() {
        Scupper scupper = new Scupper();
        scupper.id = this.id;
        scupper.roofArea = this.roofArea;
        scupper.scupperSideX = this.scupperSideX;
        scupper.scupperSideY = this.scupperSideY;
        scupper.realScupperArea = this.realScupperArea;
        scupper.activeScupperArea = this.activeScupperArea;
        scupper.waterLevel = this.waterLevel;
        scupper.bottomScupperLevelOverRoof = this.bottomScupperLevelOverRoof;
        scupper.numberOfScuppers = this.numberOfScuppers;
        return scupper;
    }
}
