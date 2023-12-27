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
    * O(1)   {in place algorithm}o


---

# Quick Sort / Partition Sort

- Partitioning
- All entries to the left of x are <= x.
- All entries to the right of x are >= x.

- **Partition method - can be done in O(N)**

- The pivot will be in the rightful place.

Quick Sort (bad approach)
1. Parition on the the leftmost item O(K)
2. Quicksort left half
3. Quicksort right half

> :warning: runtime depends on where pivot lands.

- if pivot lands in the middle -> best case
- if pivot is at the beginning or the end -> triangle

#### Runtime:
Best Case: O(NlogN)
Worst Case: O(N^2)
Average Case: O(NlogN)


### Stability ? -> depends on partitioning solution


:mushroom: It's a common practice to shuffle the array before applying quick sort, and this technique is known as "randomized quicksort."