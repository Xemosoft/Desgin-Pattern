package com.factory.example2;

public abstract class ShapeFactory {

    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
            default:
                return null;
        }
    }

}
