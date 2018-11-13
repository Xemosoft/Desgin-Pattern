# 3. Prototype Pattern
Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

**Source Code**
1. Shape.java
```java
package com.prototype;

public abstract class Shape implements Cloneable{

    private String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone()  {
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}


```
2. Circle.java
```java
package com.prototype;

public class Circle extends Shape {


    @Override
    void draw() {
        System.out.println("inside circle::draw method");
    }
}

```
3. Triangle.java
```java
package com.prototype;

public class Triangle extends Shape {
    
    @Override
    void draw() {
        System.out.println("inside triangle::draw method");
    }
}

```
4. Cache.java
```java
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

```
5. Main.java
```java
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

```