# HashTable

Data -> Reduced Function (% 10) -> Index

- Bucket = each list


Why Custom Hash Functions if each object in java has hashcode() method?

- The problem lies within the `equals` method 


```java
private class ColoredNumber {
    private int num;
}

/**
 * Equals method: first checks if the other object is of the same type as this object.
 * If it is the same type, the other object is renamed as `otherCn`,
 * and then we proceed to check for the variables inside.
 */
@Override
public boolean equals(Object o) {
    if (o instanceof ColoredNumber otherCn) {
        return this.num == otherCn.num;
    }
}
```

The reason we need custom hashcode is because, the default hashcode uses `memory address`
So, it is possible that two identical, but different objects will have different hashcodes.
Here is an example

```java
HashSet<ColoredNumber> hs = new HashSet<>();
for (int i = 0; i < 20; i++) {
    hs.add(new ColoredNumber(i));
}

ColoredNumber twelve = new ColoredNumber(12);  // this twelve may have a different memory address
                                               // than the previous twelve(which is in the HashSet we built)

hs.contains(twelve);        // this is undeterministic
```

**Equals and HashCode has to be consistent**


### Summary
- if you override equals, you also need to override hashcode
- **if the two objects are equal, they must have the same hashcode**

#### What could go wrong with immuatable keys in Hashset (Java allows tho)

- hashcode of an object changes if it got mutated
- therefore, this will affect the `contains()` method.,

```java

List<Integer> arrL = new ArrayList<>();
HashSet<List<Integer>> hs = new HashSet<>();

arrL.add(1);
arrL.add(2);

hs.add(arrL);
hs.contains(arrL);      // returns true

// however, if arrL got mutated: 
arrL.add(5);            // will have a different hashCode
hs.contains(arrL);      // may or may not be true*
```


1. Repeated calls on same object should return same code
2. Calls on equal object should return equal codes
<!-- 3. Equal codes should also correspond to the identical objects -->

```java
@Override
public int hashCode() {
    return yearOffered + courseNumber;
}

public boolean equals(Object o) {
    Course c = (Course) o;
    return c.courseCode == courseCode;
    // the correct one should be return c.courseCode == courseCode &&
    // c.yearOffered == yearOffered && c.staff.equals(staff);
}
```
