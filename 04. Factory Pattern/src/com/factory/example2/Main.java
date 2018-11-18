package com.factory.example2;

public class Main {


    public static void main(String[] args) {


        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.draw();

        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        triangle.draw();

    }

}
