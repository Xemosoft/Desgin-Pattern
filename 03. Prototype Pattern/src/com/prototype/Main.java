package com.prototype;

public class Main {

    public static void main(String[] args) throws Exception {

        Cache cache = new Cache();

        Circle circle = (Circle) cache.getShape("circle");
        circle.draw();

        Triangle triangle = (Triangle) cache.getShape("triangle");
        triangle.draw();

        Shape shape = cache.getShape("ci");
        shape.draw();

    }

}
