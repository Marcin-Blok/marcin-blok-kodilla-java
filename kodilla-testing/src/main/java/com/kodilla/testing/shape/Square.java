package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;

    public Square(String shapeName) {
        this.shapeName = shapeName;
    }


    public String getShapeName() {
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        return shapeName.hashCode();
    }
}
