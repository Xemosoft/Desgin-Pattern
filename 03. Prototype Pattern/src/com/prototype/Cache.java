package com.prototype;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private Map<String, Shape> cache = new HashMap<>();

    public Cache(){
        loadCache();
    }

    public Shape getShape(String type) {
        Shape clone = (Shape) cache.get(type).clone();
        return clone;
    }

    private void loadCache() {
        Circle circle = new Circle();
        circle.setType("circle");
        cache.put(circle.getType(),circle);

        Triangle triangle = new Triangle();
        triangle.setType("triangle");
        cache.put(triangle.getType(),triangle);
    }

}
