# Heap

A Heap is a special Tree-based Data Structure in which the tree is a complete binary tree.

Properties of Heap
1. Complete Binary Tree
2. Heap Property (Min Heap -> min has to be the root)
3. Parent-Child Relationship;   left child = 2i + 1; right child = 2i + 2;
4. Parent = (k - 1) / 2; i = child index;
5. O(logN) for insertion, deletion, search (this is because of array implementation style)

Also known as `Heapify` = maintain property of heap data structure. takes O(logN)

**Priority Queue can be implemented using Heap**

- Not suitable for searching for an element other than maximum/minimum (O(n) in worst case)
- Better than binary tree in a way that heap allows duplicate keys

Min-Heap: Every Node is less than or equal to both of its children
Completeness: (push the leaves to the left)





