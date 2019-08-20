```
/**                                                                                 
  ,dW"Yvd `7MMpMMMb.pMMMb.  M"""MMV     ,p6"bo   ,pW"Wq.`7MMpMMMb.pMMMb.      ,6"Yb.`7MM  `7MM  
 ,W'   MM   MM    MM    MM  '  AMV     6M'  OO  6W'   `Wb MM    MM    MM     8)   MM  MM    MM  
 8M    MM   MM    MM    MM    AMV      8M       8M     M8 MM    MM    MM      ,pm9MM  MM    MM  
 YA.   MM   MM    MM    MM   AMV  , ,, YM.    , YA.   ,A9 MM    MM    MM  ,, 8M   MM  MM    MM  
  `MbmdMM .JMML  JMML  JMML.AMMmmmM db  YMbmd'   `Ybmd9'.JMML  JMML  JMML.db `Moo9^Yo.`Mbod"YML.
       MM                                                                                       
     .JMML.                                                                                     
       
 * This code snippet is copyright at qmz.com.au
 * - qmz.com.au is a top-ranking IT consulting firm that specialised in
 * - Mobile Development, Web Development, Machine Learning, and Cloud Computing.
 * - We provide individual and company training for professional development.
 * - Find out more information in our official site：
 * - https://qmz.com.au                                                                   
 */
 ```

# Depth-First Search

Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data structures. It starts at a source node and explores as far as possible along each branch before backtracking.

Depth-first search can be used on both directed and undirected graphs.

## Animated example

Here's how depth-first search works on a graph:

![Animated example](./DFS_Animated.gif)

Let's say we start the search from node `A`. In depth-first search we look at the starting node's first neighbor and visit that. In the example that is node `B`. Then we look at node `B`'s first neighbor and visit it. This is node `D`. Since `D` doesn't have any unvisited neighbors of its own, we backtrack to node `B` and go to its other neighbor `E`. And so on, until we've visited all the nodes in the graph.

Each time we visit the first neighbor and keep going until there's nowhere left to go, and then we backtrack to a point where there are again nodes to visit. When we've backtracked all the way to node `A`, the search is complete.

For the example, the nodes were visited in the order `A`, `B`, `D`, `E`, `H`, `F`, `G`, `C`.

The depth-first search process can also be visualized as a tree:

![Traversal tree](./TraversalTree.png)

The parent of a node is the one that "discovered" that node. The root of the tree is the node you started the depth-first search from. Whenever there's a branch, that's where we backtracked.

## The code

Simple recursive implementation of depth-first search:

```swift
func depthFirstSearch(_ graph: Graph, source: Node) -> [String] {
  var nodesExplored = [source.label]
  source.visited = true

  for edge in source.neighbors {
    if !edge.neighbor.visited {
      nodesExplored += depthFirstSearch(graph, source: edge.neighbor)
    }
  }
  return nodesExplored
}
```

Where a [breadth-first search](./BreadthFirstSearch.md) visits all immediate neighbors first, a depth-first search tries to go as deep down the tree or graph as it can.

Put this code in a playground and test it like so:

```swift
let graph = Graph()

let nodeA = graph.addNode("a")
let nodeB = graph.addNode("b")
let nodeC = graph.addNode("c")
let nodeD = graph.addNode("d")
let nodeE = graph.addNode("e")
let nodeF = graph.addNode("f")
let nodeG = graph.addNode("g")
let nodeH = graph.addNode("h")

graph.addEdge(nodeA, neighbor: nodeB)
graph.addEdge(nodeA, neighbor: nodeC)
graph.addEdge(nodeB, neighbor: nodeD)
graph.addEdge(nodeB, neighbor: nodeE)
graph.addEdge(nodeC, neighbor: nodeF)
graph.addEdge(nodeC, neighbor: nodeG)
graph.addEdge(nodeE, neighbor: nodeH)
graph.addEdge(nodeE, neighbor: nodeF)
graph.addEdge(nodeF, neighbor: nodeG)

let nodesExplored = depthFirstSearch(graph, source: nodeA)
print(nodesExplored)
```

This will output: `["a", "b", "d", "e", "h", "f", "g", "c"]`
