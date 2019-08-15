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
  
  public void mergeSort(int[] a) {
    if (a == null || a.length == 0) { return; }

    // performance consideration
    // pass in temp list
    int[] temp = new int[a.length];
    sort(a, 0, a.length - 1, temp);
  }

  private void sort(int[] a, int start, int end, int[] temp) {
    if (start >= end) { return; }

    // sort the left half of the list
    sort(a, start, (start + end) / 2, temp);
    // sort the right half of the list
    sort(a, (start + end) / 2 + 1, end, temp);
    // merge two sorted list
    merge(a, start, end, temp);
  }

  // merge two sorted list
  private void merge(int[] a, int start, int end, int[] temp) {
    int middleIndex = (start + end) / 2;
    int leftIndex = start, rightIndex = middleIndex + 1;
    int tempIndex = start;

    // if there is still elements in both lists that remains unmerged    
    while (leftIndex <= middleIndex && rightIndex <= end) {
      if (a[leftIndex] <= a[rightIndex]) {
        temp[tempIndex++] = a[leftIndex++];
      } else {
        temp[tempIndex++] = a[rightIndex++];
      }
    }

    while (leftIndex <= middleIndex) {
      temp[tempIndex++] = a[leftIndex++];
    }

    while (rightIndex <= end) {
      temp[tempIndex++] = a[rightIndex++];
    }

    // copy over
    for (int i = start; i <= end; i++) {
      a[i] = temp[i];
    }
  }
}
