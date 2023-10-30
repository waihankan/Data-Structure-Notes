# Depth First Search

DFS and BFS Runtime = ==O (V + E)==

- If the tree is dense, BFS will use more memory
- If the tree is sparse and not dense, DFS will use more memory (especially for spindly trees)


## Runtime O(V + E) (for ==Adjacency List==)
#### Runtime O(V<sup>2</sup>) for ==Adjacency Matrix==


# Pseudocode

**Depth First Search**
```java
private void dfs(Graph G, int v) {
    marked[v] = true;
    for (neighbor : G.adj(v)) {
        if (!marked[neighbor]) {
            edgeTo[neighbor] = v;
            dfs(G, neighbor);
        }
    }
}
```


**Breadth First Search**
```java
private void bfs(Graph G, int v) {
    marked[v] = true;
    queue.enqueue(v)

    while queue is not empty:
        exploreNode = queue.dequeue();

        # process node here

        for (neighbor: G.adj(exploreNode)) {
            if (!marked[neighbor]) {
                queue.enqueue(neighbor);
                edgeTo[neighbor] = exploreNode;
                marked[neighbor];
            }
        }
}
```
