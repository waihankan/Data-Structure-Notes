# Java Generics


```java
public class Printer<T> {
    private T var;
    
    public Printer() {
        // constructor
    }
}

Printer<Integer> printer = new Printer()
```

- In newer Java, you don't need to put the <Type> on the right hand side anymore.

```java
ArrayList<Cat> cats = new ArrayList<>();
cats.add(new Cat("Tom"));
```

bounded generic type
```java
<T extends another class>
          OR 
<T extends interface>
```

**interfaces can be generic too**

```java

public class MyClass implements Myinterface<T> {

}
```

### Safe and recommended way of implementing *Comparable**
```java
public class Animal implements Comparable<Animal> {

}
```