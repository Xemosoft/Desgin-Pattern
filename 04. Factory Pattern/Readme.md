# 4. Factory Pattern
In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

* Example 1 :

1. Shape.java
```java
package com.factory.example2;

public interface Shape {
    void draw();
}

```

2. ShapeType.java
```java
package com.factory.example2;

public enum  ShapeType {
    TRIANGLE,SQUARE,CIRCLE
}

```

3. Square.java
```java
package com.factory.example2;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

```

4. Circle.java
```java
package com.factory.example2;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

```

5. Triangle.java
```java
package com.factory.example2;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

```

6. Main.java
```java
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

```

* Example 2 :
1. Page.java
```java
package com.factory.example1;

public abstract class Page {
}

```

2. CartPage.java
```java
package com.factory.example1;

public class CartPage extends Page {
}

```

3. ItemPage.java
```java
package com.factory.example1;

public class ItemPage extends Page {
}

```

4. CommentPage.java
```java
package com.factory.example1;

public class CommentPage extends Page {
}

```

5. PostPage.java
```java
package com.factory.example1;

public class PostPage extends Page {
}

```

6. Website.java
```java
package com.factory.example1;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    protected abstract void createWebsite();

}

```

7. Shop.java
```java
package com.factory.example1;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
    }
}

```

8. Blog.java
```java
package com.factory.example1;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new CommentPage());
    }
}

```

9. WebsiteFactory.java
```java
package com.factory.example1;

public class WebsiteFactory {

    public static Website getSite(String type) {
        switch (type.toLowerCase()) {
            case "shop":
                return new Shop();
            case "blog":
                return new Blog();
            default:
                return null;
        }
    }

}

```

10. Main.java
```java
package com.factory.example1;

public class Main {

    public static void main(String[] args) {


        Website site = WebsiteFactory.getSite("blog");
        System.out.println(site.getPages());


        Website shop = WebsiteFactory.getSite("shop");
        System.out.println(shop.getPages());


    }

}

```