package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;

    public Circle(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        return shapeName.hashCode();
    }
}
