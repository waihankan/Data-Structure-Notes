# Asymptotics 


### Math Requirements

##### Arithmetic Summation (Last Term Squared)
```java
- 1 + 2 + 3 + 4 + ... + N
- 1 + 3 + 5 + 7 + ... + N
- 10 + 20 + 30 + ... + N 
Theta(N^2)
- 1 + 2 + 3 + ... + logN     // Theta(Log^2N)
```

##### Geometric Summation (Last Term)
```java
- 1 + 2 + 4 + 8 + ... + N
- 1 + 3 + 9 + 27 + ... + N
- 10 + 100 + 1000 + ... + N
Theta(N)
- 10 + 100 + 1000 + ... + logN   // Theta(logN)
```

#### Sequences

1, 2, 3, 4, 5, ..., N
1, 2, 4, 8, ... 2^N

> **Summation** is used to count **Work Done**
> **Sequence** is used to count **Number of Iterations**
> If the **work** inside the loop is constant, just count the number of iterations is enough

<hr>

Tips:
- start from f(0) or f(1) based on convenience
- f(i) is i_th element in the **sequence**
- set the number of elements in sequence = k
- g(N) = f(k)
- find k, k is the Theta(  )


```java
1, 2, 4, 8, 16, ..., N
f(0) = 2^0
f(1) = 2^1
f(2) = 2^2
...
f(k) = 2^k

g(N) = 2^k
g(N) = N // last term

N = 2^k
k = log(N)
```



## For Loops
>   
    1. find the exit condition i < g(N)
    2. find the increment
    3. work done inside the loop as function of i = f(i)
    4. Runtime = Summation of f(i) + ... + f(g(N))

Loop1 
```java
public void loop1(int N) {
    for (int i = 0; i < N; i++) {
        System.out.println(i);
    }
}
```

Analysis:
- constant work inside loop, so count iterations
- 1, 2, 3, 4, 5, ..., N
Therefore Theta(N)
<hr>

Loop2
```java
public void loop2(int N) {
    for(int i = 0; i < N * N; i++) {
        int[] x = new int[i];
    }
}
```
Analysis:
- not constant work, so combine work functions
- 0 + 1 + 2 + 3 + ... + N^2
- arithmetic series = Theta(N^4)

<hr>

Loop3
```java
public void loop3(int N) {
    for(int i = 1; i < N; i = i *2) {
        int x = i;
    }
}
```
Analysis:
- constant work inside loop
- count iterations
- 1, 2, 4, 8, 16, ..., N
- Runtime = Theta(logN)

<hr>

Loop4
```java
public void loop4(int N) {
    for(int i = 1; i < N; i = i *2) {
        int [] x = new int[i];
    }
}
```
Analysis:
- not constant work, combine work function
- 1 + 2 + 4 + 6 + ... + N
- Geometric Series
- Runtime = Theta(N)


```java
public void dLoop1(int N) {
	for (int i = 1; i < N; i = i * 2) {
		for (int j = 0; j < 10; j = j + 1) {
			System.out.println(i + j);
		}
	}
}
```
Analysis:
- inside loop constant
- outside loop O(logN)
- Runtime Theta(logN)

<hr>

```java
public void dLoop2(int N) {
	for (int i = 1; i < N; i = i + 1) {
		for (int j = 1; j < i; j = j * 2) {
			int[] x = new int[j];
		}
	}
}
```
Analysis:
- count work functions
- 1 + 2 + 4 + ... + i
- theta(i) ? but no, it'll be f(i)
- 1 + 2 + 3 + ... + N
- Arithemic Series
- Theta(N^2)

```java
public void dLoop3(int N) {
	for (int i = 1; i < N * N; i = i + 1) {
		for (int j = 1; j < Math.sqrt(i); j = j + 1) {
			int[] x = new int[j];
		}
	}
}
```
Analysis:
- inner loop not constant work, so +
- 1 + 2 + 3 + ... + sqrt(i)
- theta(sqrt(i))? no, f(i) = sqrt(i)^2
- 1 + 2 + 3 + ... + N^2
- Runtime = Theta(N^4)