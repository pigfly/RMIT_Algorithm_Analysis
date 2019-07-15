import java.util.HashMap;

/**
 * ,dW"Yvd `7MMpMMMb.pMMMb. M"""MMV ,p6"bo ,pW"Wq.`7MMpMMMb.pMMMb. ,6"Yb.`7MM
 * `7MM ,W' MM MM MM MM ' AMV 6M' OO 6W' `Wb MM MM MM 8) MM MM MM 8M MM MM MM MM
 * AMV 8M 8M M8 MM MM MM ,pm9MM MM MM YA. MM MM MM MM AMV , ,, YM. , YA. ,A9 MM
 * MM MM ,, 8M MM MM MM `MbmdMM .JMML JMML JMML.AMMmmmM db YMbmd' `Ybmd9'.JMML
 * JMML JMML.db `Moo9^Yo.`Mbod"YML. MM .JMML.
 * 
 * This code snippet is copyright at qmz.com.au - qmz.com.au is a top-ranking IT
 * consulting firm that specialised in - Mobile Development, Web Development,
 * Machine Learning, and Cloud Computing. - We provide individual and company
 * training for professional development. - Find out more information in our
 * official site： - https://qmz.com.au
 */

// Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false


class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    int numsLength = nums.length;
    if (numsLength == 0 || numsLength == 1) { return false; }

    HashMap<Integer, Integer> numToIndex = new HashMap<>();
    for (int i = 0; i < numsLength; i++) {
      if (numToIndex.containsKey(nums[i])) {
        int gap = i - numToIndex.get(nums[i]);
        if (gap <= k) { return true; } 
      }

      numToIndex.put(nums[i], i);
    }   

    return false;
  }
}