import java.util.ArrayList;
import java.util.Stack;

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

// Given a singly linked list, determine if it is a palindrome.

// Example 1:

// Input: 1->2
// Output: false
// Example 2:

// Input: 1->2->2->1
// Output: true
// Follow up:
// Could you do it in O(n) time and O(1) space?


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  // use array
  public boolean isPalindromeV1(ListNode head) {
    if (head == null) { return true; }

    ArrayList<Integer> list = new ArrayList<>();
    ListNode current = head;

    while (current != null) {
      list.add(current.val);
      current = current.next;
    }

    int listSize = list.size();
    for (int i = 0; i < listSize / 2; i++) {
      int num1 = list.get(i), num2 = list.get(listSize - 1 - i);
      if (num1 != num2) {
        return false;
      }
    }

    return true;
  }

  // use stack, two pointers
  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) { return true; }

    Stack<Integer> firstHalfValues = new Stack<>();
    ListNode fast = head, slow = head;

    firstHalfValues.add(head.val);
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      firstHalfValues.add(slow.val);
    }

    // when total number is odd
    if (fast.next == null) {
      firstHalfValues.pop();
    }

    while (slow.next != null) {
      slow = slow.next;
      if (firstHalfValues.pop() != slow.val) { return false; }
    }

    return true;
  }
}
