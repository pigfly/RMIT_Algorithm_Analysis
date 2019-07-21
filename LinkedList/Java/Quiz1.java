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

// Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

// You should preserve the original relative order of the nodes in each of the two partitions.

// Example
// Example 1:

// Input:  list = null, x = 0
// Output: null	
// Explanation: The empty list Satisfy the conditions by itself.
// Example 2:

// Input:  list = 1->4->3->2->5->2->null, x = 3
// Output: 1->2->2->4->3->5->null	
// Explanation:  keep the original relative order of the nodes in each of the two partitions.


/**
 * what's the output of the following code ?
 */

//  public class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }
 

public class Solution {
    void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            System.out.print("->");
            node = node.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        Listnode head = node1;
        print(head);

        node1 = node2;
        print(head);
    }
}
