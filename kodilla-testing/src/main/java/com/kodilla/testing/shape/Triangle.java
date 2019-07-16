package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double triangleSide;
    double triangleHeight;

    public Triangle(double triangleSide, double triangleHeight) {
        this.triangleSide = triangleSide;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return triangleHeight*triangleSide*0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.triangleSide, triangleSide) != 0) return false;
        return Double.compare(triangle.triangleHeight, triangleHeight) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(triangleSide);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(triangleHeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

