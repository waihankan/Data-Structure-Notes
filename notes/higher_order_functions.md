

## Higher Order Function
- use inheritance to simulate HOF


```java
public class TenX implements IntUnaryFunction{
    public int apply(int x) {
        return 10 * x;
    }
}
```

### The idea is to pass in the entire object (TenX) in this case


```java
public class HoFDemo {
    public static int doTwice(TenX f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        System.out.println(doTwice(new TenX(), 2)); // create a new object TenX and an input
    }
}
 ```

 ### make it more general (this should go on top, written below just to learn)
 ```java
 public interface IntUnaryFunction {
    public int apply(int x);
    }
 ```