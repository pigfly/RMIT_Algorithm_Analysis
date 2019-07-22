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

// Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

// If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

// You may not alter the values in the nodes, only nodes itself may be changed.
// Only constant memory is allowed.

// Example
// Example 1

// Input:
// list = 1->2->3->4->5->null
// k = 2
// Output:
// 2->1->4->3->5
// Example 2

// Input:
// list = 1->2->3->4->5->null
// k = 3
// Output:
// 3->2->1->4->5


/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
  /**
   * @param head: a ListNode
   * @param k: An integer
   * @return: a ListNode
   */
  public ListNode reverseKGroup(ListNode head, int k) {
    // D->1->2->3->4->5->6->7
    // D->[3->2->1]->[6->5->4]->7
    ListNode dummy = new ListNode(0);
    // D->head
    dummy.next = head;

    ListNode prev = dummy;
    // say if you wish to reverse 3->[4->5->6]
    // then the prev would be 3
    while (prev != null) {
      prev = reverseNextKNodes(prev, k);
    }

    return dummy.next;
  }

  // head->node1->node2->...->nodeK->nodeK+1
  // =>
  // head->nodeK->nodeK-1->...>node2->node1->nodeK+1
  private ListNode reverseNextKNodes(ListNode head, int k) {
    ListNode cur = head;
    ListNode node1 = head.next;

    for (int i = 0; i < k; i++) {
      if (cur == null) { return null; }

      cur = cur.next;
    }

    // find kth node
    if (cur == null) { return null; }
    ListNode nodeK = cur;
    ListNode nodeKPlus1 = cur.next;

    // reverse
    ListNode prev = head;
    cur = head.next;

    while (cur != nodeKPlus1) {
      ListNode temp = cur.next;
      cur.next = prev;
      prev = cur;
      cur = temp;
    }

    // connect to nodeK+1
    head.next = nodeK;
    node1.next = nodeKPlus1;

    return node1;
  }
}
