Level Order

Depth First Tree (recursive)

preOrder(node x) {
    if (x == null) return
    print(x.key)
    preOrder(x.left)
    preOrder(x.right)
}

Call Stacks:
- preOrder(D)
- preOrder(B)
- preOrder(A)



Graph = Tree - One constraint (more than one path)

will have cycles

Simple graph - no edges to itself (no length 1 loop)
             - no two edges that connect the same node

61B - simple graphs

Directed - edges have arrow
Undirected

Acyclic: no cycle
Cyclic: one full cycle

Edges with label - throw numbers on them

Nodes = vertices


Questions:
- are there cycles
- visit every station exactly once
- visit each edge exactly once


s-t Path
Connectivity
Biconnectivity

