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

# AVL Tree

An AVL tree is a self-balancing form of a [binary search tree](../../Search/Docs/BST.md), in which the height of subtrees differ at most by only 1.

A binary tree is *balanced* when its left and right subtrees contain roughly the same number of nodes. That is what makes searching the tree really fast. But if a binary search tree is unbalanced, searching can become really slow.

This is an example of an unbalanced tree:

![Unbalanced tree](../Assets/Unbalanced.png)

All the children are in the left branch and none are in the right. This is essentially the same as a [linked list](../../LinkedList/). As a result, searching takes **O(n)** time instead of the much faster **O(log n)** that you'd expect from a binary search tree.

A balanced version of that tree would look like this:

![Balanced tree](../Assets/Balanced.png)

One way to make the binary search tree balanced is to insert the nodes in a totally random order. But that doesn't guarantee success, nor is it always practical.

The other solution is to use a *self-balancing* binary tree. This type of data structure adjusts the tree to keep it balanced after you insert or delete nodes. The height of such a tree is guaranteed to be *log(n)* where *n* is the number nodes. On a balanced tree all insert, remove, and search operations take only **O(log n)** time. That means fast. ;-)

## Introducing the AVL tree

An AVL tree fixes any imbalances by "rotating" the tree to the left or right.

A node in an AVL tree is considered balanced if its subtrees differ in "height" by at most 1. The tree itself is balanced if all its nodes are balanced.

The *height* of a node is how many steps it takes to get to that node's lowest leaf. For example, in the following tree it takes three steps to go from A to E, so the height of A is 3. The height of B is 2, the height of C is 1, and the height of the others is 0 because they are leaf nodes.

![Node height](../Assets/Height.png)

As mentioned, in an AVL tree a node is balanced if its left and right subtree have the same height. It doesn't have to be the exact same height, but the difference may not be greater than 1. These are all examples of balanced trees:

![Balanced trees](../Assets/BalanceOK.png)

But the following are trees that are unbalanced, because the height of the left subtree is too large compared to the right subtree:

![Unbalanced trees](../Assets/BalanceNotOK.png)

The difference between the heights of the left and right subtrees is called the *balance factor*. It is calculated as follows:

	balance factor = abs(height(left subtree) - height(right subtree))

If after an insertion or deletion the balance factor becomes greater than 1, then we need to re-balance this part of the AVL tree. And that is done with rotations.

## Rotations
Each tree node keeps track of its current balance factor in a variable. After inserting a new node, we need to update the balance factor of its parent node. If that balance factor becomes greater than 1, we "rotate" part of that tree to restore the balance.

![Rotation0](../Assets/RotationStep0.jpg)

For the rotation we're using the terminology:
* *Root* - the parent node of the subtrees that will be rotated;
* *Pivot* - the node that will become parent (basically will be on the *Root*'s position) after rotation;
* *RotationSubtree* - subtree of the *Pivot* upon the side of rotation
* *OppositeSubtree* - subtree of the *Pivot* opposite the side of rotation

Let take an example of balancing the unbalanced tree using *Right* (clockwise direction) rotation:

![Rotation1](../Assets/RotationStep1.jpg) ![Rotation2](../Assets/RotationStep2.jpg) ![Rotation3](../Assets/RotationStep3.jpg)

The steps of rotation could be described by following:  

1. Assign the *RotationSubtree* as a new *OppositeSubtree* for the *Root*;
2. Assign the *Root* as a new *RotationSubtree* for the *Pivot*;
3. Check the final result


In pseudocode the algorithm above could be written as follows:
```
Root.OS = Pivot.RS
Pivot.RS = Root
Root = Pivot
```

This is a constant time operation - __O(1)__
Insertion never needs more than 2 rotations. Removal might require up to __log(n)__ rotations.

## The code

Most of the code in [AVLTree.swift](../Swift/AVLTree.swift) is just regular [binary search tree](../../Search/Docs/BST.md) stuff. You'll find this in any implementation of a binary search tree. For example, searching the tree is exactly the same. The only things that an AVL tree does slightly differently are inserting and deleting the nodes.

> **Note:** If you're a bit fuzzy on the regular operations of a binary search tree, I suggest you [catch up on those first](../../Search/Docs/BST.md). It will make the rest of the AVL tree easier to understand.

The interesting bits are in the `balance()` method which is called after inserting or deleting a node.

## See also

[AVL tree on Wikipedia](https://en.wikipedia.org/wiki/AVL_tree)
