# Iterators and Iterables


> The list implements Iterable<TypeInsideList>
    - implement public Iterator<TypeInsideList> iterator();

> Make a class for iterator
    - private class MyIterator<TypeInsideList> implements Iterator<T>
        - constructor
        - override `public boolean hasNext()`
        - override `public T next()`

- the list has to implements `Iterable<T>`
- `Iterable` interface has public Iterator<T> iterator();
- this method returns a new iterator (but usually you need to create your own custom iterator class)


```java
Iterator<TypeInsideCollection> itr = c.iterator(); // this will return an iterator object
```


#### Iterator

- implement hasNext()
- implement next()

```java
// the T here should be the type of the thing that we're comparing
private class CustomIterator implements Iterator<T> {
    private int index = 0;
    private int[] arr;

    public CustomIterable(T[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
       return index < elements.length; 
    }

    @Override
    public T next() {
        if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return elements[index++];
    }
} 

```


```java
import java.util.Iterator;

public class CustomIterable<T> implements Iterable<T> {
    private T[] elements;

    public CustomIterable(T[] elements) {
        this.elements = elements;
    }

  dfdfadf  @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            // Implement hasNext() logic here
            return index < elements.length;
        }

        @Override
        public T next() {
            // Implement next() logic here
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return elements[index++];
        }

        // Optionally, implement the remove() method if needed
        @Override
        public void remove() {
            // Implement remove() logic here
            // This method is optional and may not be needed for all iterators
        }
    }

    public static void main(String[] args) {
        // Create and use your custom iterable collection
        Integer[] numbers = { 1, 2, 3, 4, 5 };
        CustomIterable<Integer> customIterable = new CustomIterable<>(numbers);

        for (Integer number : customIterable) {
            System.out.println(number);
        }
    }
}
```


for (int i = 1; i < N, i++) {
    for (int j = 1; j < i, j = j*2) {
        System.out.println("HI");
    }
}