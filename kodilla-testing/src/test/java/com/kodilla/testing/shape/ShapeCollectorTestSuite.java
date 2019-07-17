package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(12));
        //Than
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(5);
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Than
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Triangle(4, 7));
        shapeCollector.addFigure(new Circle(3));
        //When
        Shape retrievedFigure = shapeCollector.getFigure(1);
        //Than
        Assert.assertEquals(shapeCollector.getFigure(1), retrievedFigure);
    }
    @Test
    public void testGetField(){
        //Given
        Triangle triangle = new Triangle(4, 5);
        Square square = new Square(4);
        Circle circle = new Circle(3);
        //When
        double triangleResult = 4*5*0.5;
        double squareResult = 4*4;
        double circleResult = 3.14*3*3;
        //Than
        Assert.assertEquals(squareResult, square.getField(), 0.01);
        Assert.assertEquals(triangleResult, triangle.getField(), 0.01);
        Assert.assertEquals(circleResult, circle.getField(), 0.01);
    }
}
