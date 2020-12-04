package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {


    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of test.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("The test are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test for shapes")
    class TestShapes {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 4.0);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeCollectorQuantity());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 4.0);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square ("Circle", 4.0);
            shapeCollector.addFigure(shape);
            //When
            Shape selectedShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, selectedShape);

        }

        @Test
        void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle("Circle", 4.0);
            Shape shape1 = new Square("Square", 5.0);
            ArrayList<Shape> tempList = new ArrayList<>();
            //When
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            tempList.add(shape);
            tempList.add(shape1);
            String result = tempList.toString();
            List<Shape> shapeResultList = shapeCollector.getShapeCollector();
            //Then
            Assertions.assertEquals(result, shapeResultList.toString());

        }
    }
}
