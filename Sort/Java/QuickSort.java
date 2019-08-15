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

// Merge Sort

public class Solution {

  public void quickSort(int[] a) {
    if (a == null || a.length == 0) { return; }

    sort(a, 0, a.length - 1);
  }

  private void sort(int[] a, int start, int end) {
    if (start >= end) { return; }

    // two pointers
    int left = start, right = end;
    int pivot = a[(start + end) / 2];

    // partition
    // pivot could be in both left and right partition
    while (left <= right) {
      // find first position that left side violate a[left] < pivot
      while (left <= right && a[left] < pivot) { ++left; }
      // find first position that right side violate a[right] > pivot
      while (left <= right && a[right] > pivot) { --right; }
      // swap
      if (left <= right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        left++;
        right--;
      }
    }

    // right now, left is right, and right is left
    sort(a, start, right);
    sort(a, left, end);
  }
}