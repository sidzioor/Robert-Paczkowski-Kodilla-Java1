package com.kodilla.testing.shape;

public class Square implements Shape {
    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return squareSide * squareSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return Double.compare(square.squareSide, squareSide) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(squareSide);
        return (int) (temp ^ (temp >>> 32));
    }
}