#### Intro to Java

- [ ] LinkedList, ArrayList
- [ ] Inheritance
- [ ] Dynamic Method Selection
- [ ] Comparators, Comparables
- [ ] Iterators, Iterables
--- 
#### Asymptotic Analysis and ADTs

- [ ] Asymptotics Analysis
- [ ] ADTs [Sets, Maps, BSTs]
- [ ] Disjoint Sets
- [ ] Binary Search Tree
- [ ] B-Trees (2-3 Tree, 2-3-4 Tree)
- [ ] LLRBs
- [ ] Hashing
- [ ] Heaps and Priority Queues
---
#### Trees and Graphs

- [ ] Tree and Graph Traversal
- [ ] DFS, BFS, Pre-order, Post-order, etc.
- [ ] Tries
- [ ] Shortest Paths | Dijkstra's and A*
- [ ] Minimum Spanning Trees
- [ ] Directed Acyclic Graphs | Topological Sort [Reverse Post Order DFS]
---
#### Sorting

- [ ] Selection
- [ ] Insertion
- [ ] Heapsort
- [ ] MergeSort
- [ ] QuickSort
- [ ] Counting Sort
- [ ] Radix [LSD and MSD]


--- 

# Sorting Table

|      Name      | Memory | Best Case Runtime | Worst Case Runtime | Stable | Notes |
|:--------------:|:------:| :-----------------: | :------------------: | :------: | :-----: |
| Selection Sort | Theta(1)       | O(N^2)    | O(N^2).   | No       | Worst Algorithm       |
| Insertion Sort | Theta(1)       | O(N)      | O(N^2)   |  Yes      | Good for mostly sorted      |
|   Heap Sort    | Theta(1)       | O(N)      | O(NlogN) |  No      | Bad Cache       |
|   Merge Sort   | Theta(N)       | O(NlogN)  | O(NlogN) |  Yes       | Best Stable       |
|   Quick Sort   | Theta(logN)    | O(NlogN)  | O(N^2)   |  Depends      | Best Unstable       |
| Counting Sort  | Theta(N + R)   | O(N + R)  | O(N + R) |  Yes      | *Counting*      |
|      LSD       | Theta(N + R)   | O(WN + WR)| O(WN + WR)| Yes       | *Linear*       |
|      MSD       | Theta(N + WR). | O(N + R)  | O(WN +WR) | Yes       | Linear      |
