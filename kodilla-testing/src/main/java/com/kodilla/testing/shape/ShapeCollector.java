package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public int getShapesQuantity() {
        return shapes.size();
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape theShape = null;
        if (n >= 0 && n < shapes.size()){
            theShape = shapes.get(n);
        }
            return theShape;
    }

    public String showFigures() {
        return null;
    }
}
