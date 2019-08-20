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

# Breadth-First Search

Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures. It starts at a source node and explores the immediate neighbor nodes first, before moving to the next level neighbors.

Breadth-first search can be used on both directed and undirected graphs.

## Animated example

Here's how breadth-first search works on a graph:

![Animated example](./BFS_Animated.gif)

When we visit a node, we color it black. We also put its neighbor nodes into a queue. In the animation the nodes that are enqueued but not visited yet are shown in gray.

Let's follow the animated example. We start with the source node `A` and add it to a queue. In the animation this is shown as node `A` becoming gray.

```swift
queue.enqueue(A)
```

The queue is now `[ A ]`. The idea is that, as long as there are nodes in the queue, we visit the node that's at the front of the queue, and enqueue its immediate neighbor nodes if they have not been visited yet.

To start traversing the graph, we pull the first node off the queue, `A`, and color it black. Then we enqueue its two neighbor nodes `B` and `C`. This colors them gray.

```swift
queue.dequeue()   // A
queue.enqueue(B)
queue.enqueue(C)
```

The queue is now `[ B, C ]`. We dequeue `B`, and enqueue `B`'s neighbor nodes `D` and `E`.

```swift
queue.dequeue()   // B
queue.enqueue(D)
queue.enqueue(E)
```

The queue is now `[ C, D, E ]`. Dequeue `C`, and enqueue `C`'s neighbor nodes `F` and `G`.

```swift
queue.dequeue()   // C
queue.enqueue(F)
queue.enqueue(G)
```

The queue is now `[ D, E, F, G ]`. Dequeue `D`, which has no neighbor nodes.

```swift
queue.dequeue()   // D
```

The queue is now `[ E, F, G ]`. Dequeue `E` and enqueue its single neighbor node `H`. Note that `B` is also a neighbor for `E` but we've already visited `B`, so we're not adding it to the queue again.

```swift
queue.dequeue()   // E
queue.enqueue(H)
```

The queue is now `[ F, G, H ]`. Dequeue `F`, which has no unvisited neighbor nodes.

```swift
queue.dequeue()   // F
```

The queue is now `[ G, H ]`. Dequeue `G`, which has no unvisited neighbor nodes.

```swift
queue.dequeue()   // G
```

The queue is now `[ H ]`. Dequeue `H`, which has no unvisited neighbor nodes.

```swift
queue.dequeue()   // H
```

The queue is now empty, meaning that all nodes have been explored. The order in which the nodes were explored is `A`, `B`, `C`, `D`, `E`, `F`, `G`, `H`.

We can show this as a tree:

![The BFS tree](./TraversalTree.png)

The parent of a node is the one that "discovered" that node. The root of the tree is the node you started the breadth-first search from.

For an unweighted graph, this tree defines a shortest path from the starting node to every other node in the tree. So breadth-first search is one way to find the shortest path between two nodes in a graph.

## The code

Simple implementation of breadth-first search using a queue:

```swift
func breadthFirstSearch(_ graph: Graph, source: Node) -> [String] {
  var queue = Queue<Node>()
  queue.enqueue(source)

  var nodesExplored = [source.label]
  source.visited = true

  while let node = queue.dequeue() {
    for edge in node.neighbors {
      let neighborNode = edge.neighbor
      if !neighborNode.visited {
        queue.enqueue(neighborNode)
        neighborNode.visited = true
        nodesExplored.append(neighborNode.label)
      }
    }
  }

  return nodesExplored
}
```

While there are nodes in the queue, we visit the first one and then enqueue its immediate neighbors if they haven't been visited yet.

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

let nodesExplored = breadthFirstSearch(graph, source: nodeA)
print(nodesExplored)
```

This will output: `["a", "b", "c", "d", "e", "f", "g", "h"]`
