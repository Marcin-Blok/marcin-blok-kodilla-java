package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }


    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Circle circle = new Circle("Koło");
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(1, shapeCollector.listOfShapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("Kwadrat");
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("Trójkąt");
        shapeCollector.addFigure(triangle);
        //When
        Shape figure = shapeCollector.getFigure(0);

        //Then
        Assertions.assertSame(triangle, figure);
    }


}
