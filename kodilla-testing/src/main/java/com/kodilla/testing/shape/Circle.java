package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return 3.14*circleRadius*circleRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.circleRadius, circleRadius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(circleRadius);
        return (int) (temp ^ (temp >>> 32));
    }
}
