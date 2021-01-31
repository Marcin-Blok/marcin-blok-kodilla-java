package com.kodilla.testing.shape;

public class Triangle implements Shape {


    private String shapeName;

    public Triangle(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        return shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return shapeName.hashCode();
    }
}
