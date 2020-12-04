package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {

    public List<Shape> shapeCollector = new ArrayList<>();

    public List<Shape> getShapeCollector() {
        return shapeCollector;
    }

    public int getShapeCollectorQuantity() {
        return  shapeCollector.size();
    }

    public void addFigure(Shape shape) {
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapeCollector.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < shapeCollector.size() && n >= 0) {
            return shapeCollector.get(n);
        } else {
            return null;
        }
    }

    public void showFigure() {
        System.out.println(shapeCollector.toString());
    }
}
