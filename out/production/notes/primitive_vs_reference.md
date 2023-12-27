# Primitive types

1. byte
2. char
3. short
4. int
5. long
6. float
7. double
8. boolean

**Most importantly, primitive types are copied by value. Changes made to the primitive variable inside the method have no effect on the original variable outside of the method.**

```java
public class PrimitiveExample {
    public static void main(String[] args) {
        int x = 10;
        int y = x; // copy by value  
        // x = 10, y = 10
        
        y = 20;
        // x = 10, y = 20
    }
}


// another example

private class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public setName(String name) {
        this.name = name;
    }
}



public class ReferenceCopyExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = p1;
        // here, p1 and p2 are pointing to one object, "Alice"
    }

    p2.setName("Bob");
    // this will set "Alice" to "Bob".
    // therefore, p1.name = p2.name = Bob
}
```

> **NOTE*** In passing arguments to a method, `a copy of the reference to an object` is passed. The reference itself is therefore passed by value.

```java
class Person {
    String name;
}

public class Example {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        
        modifyPerson(person);
        
        System.out.println(person.name); // Output: Bob
    }

    static void modifyPerson(Person p) {
        p.name = "Bob"; // Changes the object's state
        p = new Person(); // Does not change the original reference
        p.name = "Charlie";
    }
}
```


# Arrays

*Instantiation of Arrays*

```java
int [] arrayNum = {0, 1, 2, 3};
int [] arrayNum = new int[4]; // creates array, default = 0
```

**Default value is zeros or false for primitive data types and null for objects**