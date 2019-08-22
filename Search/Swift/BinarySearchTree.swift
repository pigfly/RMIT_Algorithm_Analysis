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

// Binary Search

public enum BinarySearchTree<T: Comparable> {
  case empty
  case leaf(T)
  indirect case node(BinarySearchTree, T, BinarySearchTree)

  /* How many nodes are in this subtree. Performance: O(n). */
  public var count: Int {
    switch self {
    case .empty: return 0
    case .leaf: return 1
    case let .node(left, _, right): return left.count + 1 + right.count
    }
  }

  /* Distance of this node to its lowest leaf. Performance: O(n). */
  public var height: Int {
    switch self {
    case .empty: return -1
    case .leaf: return 0
    case let .node(left, _, right): return 1 + max(left.height, right.height)
    }
  }

  /*
    Inserts a new element into the tree.
    Performance: runs in O(h) time, where h is the height of the tree.
  */
  public func insert(newValue: T) -> BinarySearchTree {
    switch self {
    case .empty:
      return .leaf(newValue)

    case .leaf(let value):
      if newValue < value {
        return .node(.leaf(newValue), value, .empty)
      } else {
        return .node(.empty, value, .leaf(newValue))
      }

    case .node(let left, let value, let right):
      if newValue < value {
        return .node(left.insert(newValue), value, right)
      } else {
        return .node(left, value, right.insert(newValue))
      }
    }
  }

  /*
    Finds the "highest" node with the specified value.
    Performance: runs in O(h) time, where h is the height of the tree.
  */
  public func search(x: T) -> BinarySearchTree? {
    switch self {
    case .empty:
      return nil
    case .leaf(let y):
      return (x == y) ? self : nil
    case let .node(left, y, right):
      if x < y {
        return left.search(x)
      } else if y < x {
        return right.search(x)
      } else {
        return self
      }
    }
  }

  public func contains(x: T) -> Bool {
    return search(x) != nil
  }

  /*
    Returns the leftmost descendent. O(h) time.
  */
  public func minimum() -> BinarySearchTree {
    var node = self
    var prev = node
    while case let .node(next, _, _) = node {
      prev = node
      node = next
    }
    if case .leaf = node {
      return node
    }
    return prev
  }

  /*
    Returns the rightmost descendent. O(h) time.
  */
  public func maximum() -> BinarySearchTree {
    var node = self
    var prev = node
    while case let .node(_, _, next) = node {
      prev = node
      node = next
    }
    if case .leaf = node {
      return node
    }
    return prev
  }
}

extension BinarySearchTree: CustomDebugStringConvertible {
  public var debugDescription: String {
    switch self {
    case .empty: return "."
    case .leaf(let value): return "\(value)"
    case .node(let left, let value, let right):
      return "(\(left.debugDescription) <- \(value) -> \(right.debugDescription))"
    }
  }
}
