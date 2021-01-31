package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public Shape shape;
    ArrayList<Shape> listOfShapes = new ArrayList<>();


    void addFigure(Shape shape) {
        if (shape != null) {
            listOfShapes.add(shape);
        }
    }


    boolean removeFigure(Shape shape) {
        boolean result = false;
        if (listOfShapes.contains(shape)) {
            listOfShapes.remove(shape);
            result = true;
        }
        return false;
    }

    Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n <= listOfShapes.size()) {
            shape = listOfShapes.get(n);
        }
        return shape;
    }

}
