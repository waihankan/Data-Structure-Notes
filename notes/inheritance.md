extends -> "is a";  copy the parent methods into the child, write more code sepcifically for the child itslef.


**Cannot Override a static method** IMPORTANT

- private methods are not inherited with extends
- **protected** methods are inherited tho.
- super() refers to the object above me
- super() is only useful when the child method is overrding the parent's method?
- 
- super().public_method ? - no
- java automatically calls the parent's constructor; super();
- but be careful here, make sure you're calling the correct ocnstructor; for example, super(x)

- side note: try to use already implemented methods to make a new method * 
-



## Boring Construtor
- child construcotr also calls the parent constructor. right thing to do. done automaticallly
- At the start of the constructor, Java forces an implicit call to super(), which calls the default constructor of the class.

## is A vs Has a 
- extends -> "Is a", NOTT "HAS A"
- Set is not a list, set has a list (so don't use extend on this)

- "is a" -> inheritance
- "has a" -> different objects, car has an engine, but car is not an engine






## 

## Encapsulated
- encapsulated means its implementaiton is completely hidden (abstraction in a way)
- enforces barrieres with syntax (private, protected, public, etc.)
- try to think high level, try to make the code higher level
- from the outside, functionality is the same, it's a question of asthetics



# Implementation inheritance could break encapsulation (that's bad)

- **whose calling the mehtod?**
- 



Dynamic Method Selection 

- check compile time makes sense
- compiler only looks at **declaration**
- looks okay to compile -> compile and go to runtime
- super cautious, doesn't compile if **sometimes** work

#### Runtime
- 



- (casting) will trick the compiler and force to go to runtime.
- (cast) if we know it's gonna work (make the compiler less cautious)

- casting only changes compile time type (temporary)
- casting doesn't affect runtime type

- but if you make the casting wrong, it will raise a runtime error at somepoint.
- the point is to cast properly (know by the programmer)













