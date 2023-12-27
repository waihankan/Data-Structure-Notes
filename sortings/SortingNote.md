# Selection Sort // swap the minimum with the first element of unsorted array.

#### Run Time:
- Theta(N<sup>2</sup>)
- O(N<sup>2</sup>)
- Omega(N<sup>2</sup>)

#### Space Complexity:
- O(1)  {in place sorting algorithm}

#### Not Stable

---

# Heap Sort (Max-Heap) Bad Cache Performance
> Bottom Up Heapification (takes log(N) of time)

#### Run Time:
- Theta(Nlog(N))
- O(Nlog(N))
- Omega(N)          {if all items are duplicate}

#### Space Complexity:
- O(1) {in place, must be max-heap}

---


# Merge Sort

- Split items into 2 roughly even pieces
- MergeSort each half (recursion)
- Merge the two sorted arrays
- ==Faster than heapSort==

1. **Time Complexity:**
    * Worst Case O(NlogN)
    * Best Case O(NlogN)
    * Average Case O(NlogN) 

2. **Space Complexity**
    * O(N)

3 **Stable Algorithm**

--- 

# Insertion Sort
- two pointers: i and j
- repeat i = 0 to N - 1;
    * Item i = traveling item
    * Swap item backward until traveler is in the rightful place

**:warning: IMPORTANT** The array is sorted from the start to item `i`.


1. **Time Complexity**
    * Worst Case O(N<sup>2</sup>)
    * Best Case O(N)
    * Average Case O(N<sup>2</sup>)

2. ** Space Complexity**
    * O(1)   {in place algorithm}