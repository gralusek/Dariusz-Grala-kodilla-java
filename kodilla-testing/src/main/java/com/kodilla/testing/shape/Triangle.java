package com.kodilla.testing.shape;

class Triangle implements Shape {
    private String shapeName;
    private double sideLength;
    private double heigth;

    public Triangle(String shapeName, double sideLength, double heigth) {
        this.shapeName = shapeName;
        this.sideLength = sideLength;
        this.heigth = heigth;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return sideLength * heigth / 2;
    }
}
