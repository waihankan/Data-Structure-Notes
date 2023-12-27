#Subtype Polymorphism

- instead of passing in the functions explicitly, we're passing the objects. The objects themselves have the functions in them. 


### > cannot compare all types of objects


solution: 

```java
// this is just an interface* therefore, have to be implemented in the actual class file.
public interface OurComparable {
    // intger return?
    /* returns a negative number if I'm less than other object
       returns 0 if I"im equal to obj
       returns a positive number if I'm greater than other object
    */
    public int compareTo(Object obj);
}

```


```java
public class Dog implements OurComparable {
    public String name;
    private int size;
    // constructor 
    // other methods

    // key demonstration below
    @Override
    public int compareTo(Object obj) {
        Dog otherDog = (Dog) Object;  // let the compiler know that this is a dog so that we can access .size method
        return this.size - otherDog.size;  // -ve, 0, +ve
    }
}
```

```java
public class Maximizer {
    public static OurComparable max(OurComparable[] items) {
        ...
    }
}
```


**The main idea is to use interface OurComparable and implement compareTo method in every customized class that we want to compare.**


## Two issues with OurComparable
- casting (if someone passes Dog vs Cat), the program will crash due to casting
- works for only classes that we write, unlike the builtin max function
- *use `Comparable<T>` to fix these two issues



## Comparator (machine that compares two objects)
- comparable is something that compares `itself` to another object!


```java
/*
    -ve if d1 < d2
    0 if d1 == d2
    +ve if d1 > d2
*/
public class NameComparator implements Comparator<Dog> {
    public int compare(Dog d1, Dog d2) {
        return d1.name.compareTo(d2.name);
    }
}
```

```java
Dog d4 = new Dog("chico", 54);
Dog d5 = new Dog("mushu", 15);

NameComparator nc = new NameComparator(); // instantiation because it's not a static class
nc.compare(d4, d5); // -ve -> d4 < d5;  +ve -> d4 > d5


```






<br>
<hr>



## Static class vs Non-static Class ?? Question
## Review implements and extends and Generic Templates



