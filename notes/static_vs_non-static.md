# Static vs Non-Static


#### Static
- Static methods are kinda like class attributes.
- Declare using the word `static`
- Static methods are called on the class itself.
- Often used for utility functions
- **Cannot access the instance-level variables or methods of the class**

<hr>

#### Non-Static (aka) Instance
- associated with instances (objects) of a class
- **have access to `static` variables and methods**

```java
// filename MathUtils.java (static method example)
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

// call a static method
int result = MathUtils.add(5, 10); // 15

// -----------------------------------------------------
// filename Circle.java (instance method example)
public class Circle {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius; // same as this.radius
    }
}

// call a non-static method
// need to declare an object first
Circle c = new Circle(5.0);
c.calculateArea(); // pi * 25
```

> **Note*** It is conventional to make the filename (including the case) the same as the class name.

> need at least one class with a main method for the program to start execution.

> Constructors cannot be `static` since the main job of constructor is to build an instance.

#### Outro on Static Variables.
TL, DR: Static Variables are Dangerous

- static variables can be accessed from an instance method, however this is not considered a good coding practice.

- Static Variables should not be changed throughout the runtime. (although this is technically possible)