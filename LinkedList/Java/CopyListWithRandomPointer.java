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

// A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

// Return a deep copy of the list.

// Input:
// {"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}

// Explanation:
// Node 1's value is 1, both of its next and random pointer points to Node 2.
// Node 2's value is 2, its next pointer points to null and its random pointer points to itself.
 

// Note:

// You must return the copy of the given head as a reference to the cloned list.


/**
 * Definition for singly-linked list with a random pointer.
 * class Node {
 *     int label;
 *     Node next, random;
 *     Node(int x) { this.label = x; }
 * };
 */
public class Solution {
  public Node copyRandomList(Node head) {
    if (head == null) { return head; }

    Node newHead = createNewRandomList(head);
    newHead = populateRandomNode(newHead);
    newHead = splitIntoTwoLists(newHead);

    return newHead;
  }

  // 1(2) -> 2(3) -> 3(1) -> null, () means random node
  // ->
  // 1(2) -> 1'(null) -> 2(3) -> 2'(null) -> 3(1) -> 3'(null) -> null, ' means duplication
  private Node createNewRandomList(Node head) {
    Node current = head;

    while (current != null) {
      Node newNode = new Node(current.val);
      newNode.next = current.next;
      current.next = newNode;

      current = newNode.next;
    }

    return head;
  }

  // 1(2) -> 2(3) -> 3(1) -> null, () means random node
  // ->
  // 1(2) -> 1'(2) -> 2(3) -> 2'(3) -> 3(1) -> 3'(1) -> null, ' means duplication
  private Node populateRandomNode(Node head) {
    Node current = head;

    while (current != null) {
      if (current.random != null) { current.next.random = current.random.next; }
      
      current = current.next.next;
    }

    return head;
  }

  // 1(2) -> 1'(2) -> 2(3) -> 2'(3) -> 3(1) -> 3'(1) -> null, ' means duplication
  // ->
  // 1(2) -> 2(3) -> 3(1) -> null, 1'(2) -> 2'(3) -> 3'(1) -> null
  private Node splitIntoTwoLists(Node head) {
    Node current = head;
    Node resolution = head.next;

    while (current != null) {
      Node temp = current.next;

      if (temp != null) {
        current.next = temp.next;
      } else {
        current.next = null;
        return resolution;
      }
      
      current = temp;
    }

    return resolution;
  }
}
