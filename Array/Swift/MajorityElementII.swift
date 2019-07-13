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

// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Note: The algorithm should run in linear time and in O(1) space.

// Example 1:

// Input: [3,2,3]
// Output: [3]
// Example 2:

// Input: [1,1,1,3,3,2,2,2]
// Output: [1,2]

class Solution {
    func majorityElement(_ nums: [Int]) -> [Int] {
        var result: [Int] = []

        var candidate1: Int = .max, candidate2: Int = .max
        var counter1: Int = 0, counter2: Int = 0

        // Moore Voting
        // 1.find potential candidates
        for number in nums {
            // ❗️count first e.g. [8, 8, 7, 7, 7]
            if number == candidate1 {
                counter1 += 1
            } else if number == candidate2 {
                counter2 += 1
            } else if counter1 == 0 {
                candidate1 = number
                counter1 = 1
            } else if counter2 == 0 {
                candidate2 = number
                counter2 += 1
            } else {
                counter1 -= 1
                counter2 -= 1
            }
        }

        // 2.validate the candidates
        counter1 = 0
        counter2 = 0

        for number in nums {
            if number == candidate1 {
                counter1 += 1
            } else if number == candidate2 {
                counter2 += 1
            }
        }

        if counter1 > nums.count / 3 {
            result.append(candidate1)
        }

        if counter2 > nums.count / 3 {
            result.append(candidate2)
        }

        return result
    }
}