# Dynamic Method Selection

```java
class A {
    void f(A obj);
}

class B extends A {
    void f(B obj);
}

class C extends B {
    void f(A obj);
}

class D extends C{
    void f(B obj);
    void f(C obj);
}
```

#### Compile Time

- Collect all methods with relating parameter with the same name starting from the static class, and all the way up to the root class. (*Exclude overwritten methods)

- Find the methods with the **most specific** parameter type to the argument passed in.

- **Lock-In** the method signature found OR **ERROR** if no method accepts the argument type or a superclass of its type.

#### RunTime

- Look in the class correspoinding to the dynamic type for identical signature locked in Compile time.

- If the signature exists, run that method 

- **Otherwise** keep checking the superclasses between dynamic type and the root class to see if other identical signature exists.

- If we cannot do better than the method we locked in, use the method we locked in during compile time.


## Casting

- Upcasting is casting to a supertype, while downcasting is casting to a subtype. Upcasting is always allowed, but downcasting involves a type check and can throw a ClassCastException.

> Casting must be done carefully. must know that the runtime works as well, otherwise, will rise to a `runtime` error, casting up is gaurantee that there will be no runtime error, because a child is `always` a parent.

> Downcasting can cause `runtime` errors. Because a parent is not necessarily a child.


### Downcasting
- so in downcasting, depends on the dynamic type. (don't lie compiler)
- no runtime error, only if the casted object == dynamic object
```java
Animal animal = new Dog();
Dog castedDog = (Dog) animal; // animal to dog
```

```java
// this will result in error
Animal animal = new Animal();
Dog mightNotBeADog = (Dog) animal; // ClassCastException: animal to dog (animal might not be a dog)
```


### Upcasting
```java
Dog dog = new Dog();
Animal animal = (Animal) dog; // dog to animal (dog is always an animal)
```


Upcasting is safe, Downcasting is not safe