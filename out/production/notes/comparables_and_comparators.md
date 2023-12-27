# Comparables and Comparators

The recommended practice for `Comparable` is 
```java
public class MyClass implements Comparable<MyClass> {
    // constuctors
    // MyClass methods
    // compareTo must be "public" method

    // if I'm younger than other, return negative
    // if I'm equal as other, return 0
    // if I'm greater than other, return positive
    @Override
    public int compareTo(Movie m){
        return this.year - m.year;
    }
}
```

### Problems with Comparable

- there is only one CompareTo method.
- Use Comaprator<MyClass> in order to implement different methods
- Unlike Comparable, Comparators are external to the element type we are comparing. **It's a separate class**

<hr>

--- To create a comparator for specific MyClass attribute (Custom Comparator)
1. create a class that implements Comparator (and thus compare( ) method that does the work previously done by comparetTo( ))
2. Make an instance of Comparator Class
3. call the overloaded sort( )method.

```java
public class RatingCompare implements Comparator<Movie> {
    // compare is public, and has two inputs
    // Comparator is like a machine that compares two inputs
    // Comparator is separate from the class itself
    // only one compare method in each class!!
    public int compare(Movie m1, Movie m2) {
        return m1.getRating() - m2.getRating;
    }

}

public class MovieNameCompare implements Comparator<Movie> {

    // use advantage of the built-in implemented String "compareTo" Method
    public int compare(Movie m1, Movie m2) {
        return m1.getMovieName().compareTo(m2.getMovieName());
    }
}
```


## From lecture videos (Josh)

- wrote comparators classes inside the `MyClass` as a nested class

```java
// static because it doesn't need to access attributes of MyClass
// made it private just to match with Java practices
// will use getNameComparator to make this work

private static NameComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass m1, MyClass m2) {
        // 
    }
}

// why static? 
// because getNameComparator is an instance method under MyClass, NameComparator is a static class
// therefore, this method has to be static in order to access static class
public static Comparator<MyClass> getNameComparator() {
    return new NameComparator;
}
```

In main class, (another file)
```java
Comparator<MyClass> nc = MyClass.getNameComparator();
```
<hr>
<br>

> To summarize, if sorting of objects needs to be based on natural order then use Comparable whereas if you sorting needs to be done on attributes of different objects, then use Comparator in Java.