<img src="https://www.rmit.edu.au/content/dam/rmit-ui/logo/rmit-logo@2x.png" alt="RMIT 2019" width="160" height="55"> RMIT 2019 Algorithm Analysis
======================================

Special thanks to [QMZiT](https://qmz.com.au) 

This is a production repo of [RMIT 2019 Algorithm Analysis](http://www1.rmit.edu.au/courses/004302).

Hands-on training on real coding interview questions, for fun (-:

## I came here because I want to ...

###### ... understand

* ⏱ [How to ask question](http://www.catb.org/~esr/faqs/smart-questions.html)
* ✈️ [Where to ask question](https://github.com/pigfly/RMIT_Algorithm_Analysis/issues)
* 👨‍💻👩‍💻 Am I asking stupid question ?
    * There is no stupid question, if you think something is not clear, ask away in [where to ask question](https://github.com/pigfly/RMIT_Algorithm_Analysis/issues) or in canvas.

###### ... lookup

* HTML Standard. [HTML Spec](https://html.spec.whatwg.org/)

###### ... check style guide

* Java Style Guide. [Google Java Guide](https://google.github.io/styleguide/javaguide.html)
* Swift Style Guide. [Google Swift Guide](https://google.github.io/swift/)

##### 2019 Semester 2
- [week1](./2019s2/week1)


##### Data Structures
* [Array](#array)
* [String](#string)
* [Linked List](#linked-list)
* [Stack](#stack)
* [Tree](#tree)
* [Dynamic programming](#dynamic-programming)
* [Depth-first search](#depth-first-search)
* [Math](#math)
* [Search](#search)
* [Sort](#sort)
* [Union Find](#union-find)

##### Array
| Title | Solution | Difficulty | Time | Space |
| ----- | -------- | ---------- | ---- | ----- |
[Max Consecutive Ones](./Array/Java/MaxConsecutiveOnes.java)| [Java](./Array/Java/MaxConsecutiveOnes.java), [Swift](./Array/Swift/MaxConsecutiveOnes.swift)| Easy| O(n)| O(1)|
[Heaters](./Array/Java/Heaters.java)| [Java](./Array/Java/Heaters.java), [Swift](./Array/Swift/Heaters.swift)| Easy| O(nlogn)| O(1)|
[Number of Boomerangs](./Array/Java/NumberOfBoomerangs.java)| [Java](./Array/Java/NumberOfBoomerangs.java), [Swift](./Array/Swift/NumberOfBoomerangs.swift)| Easy| O(n ^ 2)| O(n)|
[Valid Tic-Tac-Toe State](./Array/Java/ValidTicTacToeState.java)| [Java](./Array/Java/ValidTicTacToeState.java), [Swift](./Array/Swift/ValidTicTacToeState.swift)| Medium| O(n ^ 2)| O(n ^ 2)|
[Island Perimeter](./Array/Java/IslandPerimeter.java)| [Java](./Array/Java/IslandPerimeter.java), [Swift](./Array/Swift/IslandPerimeter.swift)| Easy| O(nm)| O(1)|
[Majority Element](./Array/Java/MajorityElement.java)| [Java](./Array/Java/MajorityElement.java), [Swift](./Array/Swift/MajorityElement.swift)| Easy| O(n)| O(1)|
[Majority Element II](./Array/Java/MajorityElementII.java)| [Java](./Array/Java/MajorityElementII.java), [Swift](./Array/Swift/MajorityElementII.swift)| Medium| O(n)| O(1)|
[Intersection of Two Arrays](./Array/Java/IntersectionOfTwoArrays.java)| [Java](./Array/Java/IntersectionOfTwoArrays.java), [Swift](./Array/Swift/IntersectionOfTwoArrays.swift)| Easy| O(n)| O(n)|
[Intersection of Two Arrays II](./Array/Java/IntersectionOfTwoArraysII.java)| [Java](./Array/Java/IntersectionOfTwoArraysII.java), [Swift](./Array/Swift/IntersectionOfTwoArraysII.swift)| Easy| O(n)| O(n)|
[Contains Duplicate](./Array/Java/ContainsDuplicate.java)| [Java](./Array/Java/ContainsDuplicate.java), [Swift](./Array/Swift/ContainsDuplicate.swift)| Easy| O(n)| O(n)|
[Contains Duplicate II](./Array/Java/ContainsDuplicateII.java)| [Java](./Array/Java/ContainsDuplicateII.java), [Swift](./Array/Swift/ContainsDuplicateII.swift)| Easy| O(n)| O(n)|
[Remove Duplicates from Sorted Array](./Array/Java/RemoveDuplicatesFromSortedArray.java)| [Java](./Array/Java/RemoveDuplicatesFromSortedArray.java), [Swift](./Array/Swift/RemoveDuplicatesFromSortedArray.swift)| Easy| O(n)| O(1)|
[Remove Duplicates from Sorted Array II](./Array/Java/RemoveDuplicatesFromSortedArrayII.java)| [Java](./Array/Java/RemoveDuplicatesFromSortedArrayII.java), [Swift](./Array/Swift/RemoveDuplicatesFromSortedArrayII.swift)| Medium| O(n)| O(1)|
[Move Zeroes](./Array/Java/MoveZeroes.java)| [Java](./Array/Java/MoveZeroes.java), [Swift](./Array/Swift/MoveZeroes.swift)| Easy| O(n)| O(1)|
[Remove Element](./Array/Java/RemoveElement.java)| [Java](./Array/Java/RemoveElement.java), [Swift](./Array/Swift/RemoveElement.swift)| Easy| O(n)| O(1)|
[Subsets](./Array/Java/Subsets.java)| [Java](./Array/Java/Subsets.java), [Swift](./Array/Swift/Subsets.swift)| Easy| O(n)| O(1)|
[Two Sum](./Array/Java/TwoSum.java)| [Java](./Array/Java/TwoSum.java), [Swift](./Array/Swift/TwoSum.swift)| Easy| O(n)| O(n)|
[3Sum](./Array/Java/ThreeSum.java)| [Java](./Array/Java/ThreeSum.java), [Swift](./Array/Swift/ThreeSum.swift)| Medium| O(n^2)| O(nC3)|
[3Sum Closest](https://leetcode.com/problems/3sum-closest/)| [Swift](./Array/ThreeSum.swift)| Medium| O(n^2)| O(nC3)|
[4Sum](https://leetcode.com/problems/4sum/)| [Swift](./Array/FourSum.swift)| Medium| O(n^3)| O(nC4)|
[Summary Ranges](https://leetcode.com/problems/summary-ranges/)| [Swift](./Array/SummaryRanges.swift)| Medium| O(n)| O(n)|
[Shortest Word Distance](https://leetcode.com/problems/shortest-word-distance/)| [Swift](./Array/ShortestWordDistance.swift)| Easy| O(n)| O(1)|
[Shortest Word Distance III](https://leetcode.com/problems/shortest-word-distance-iii/)| [Swift](./Array/ShortestWordDistanceIII.swift)| Medium| O(n)| O(1)|
[Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)| [Swift](./Array/MinimumSizeSubarraySum.swift)| Medium| O(n)| O(1)|
[Maximum Size Subarray Sum Equals k](https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/)| [Swift](./Array/MaximumSizeSubarraySumEqualsK.swift)| Medium| O(n)| O(n)|
[Smallest Range](https://leetcode.com/problems/smallest-range/)| [Swift](./Array/SmallestRange.swift)| Hard | O(nm)| O(nm)|
[Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)| [Swift](./Array/ProductExceptSelf.swift)| Medium| O(n)| O(n)|
[Rotate Array](https://leetcode.com/problems/rotate-array/)| [Swift](./Array/RotateArray.swift)| Easy| O(n)| O(1)|
[Rotate Image](https://leetcode.com/problems/rotate-image/)| [Swift](./Array/RotateImage.swift)| Medium| O(n^2)| O(1)|
[Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)| [Swift](./Array/SpiralMatrix.swift)| Medium| O(n^2)| O(1)|
[Spiral Matrix II](https://leetcode.com/problems/spiral-matrix/)| [Swift](./Array/SpiralMatrixII.swift)| Medium| O(n^2)| O(1)|
[Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)| [Swift](./Array/ValidSudoku.swift)| Easy| O(n^2)| O(n)|
[Set Matrix Zero](https://leetcode.com/problems/set-matrix-zeroes/)| [Swift](./Array/SetMatrixZero.swift)| Medium| O(n^2)| O(1)|
[Next Permutation](https://leetcode.com/problems/next-permutation/)| [Swift](./Array/NextPermutation.swift)| Medium| O(n)| O(1)|
[Gas Station](https://leetcode.com/problems/gas-station/)| [Swift](./Array/GasStation.swift)| Medium| O(n)| O(1)|
[Game of Life](https://leetcode.com/problems/game-of-life/)| [Swift](./Array/GameLife.swift)| Medium| O(n)| O(1)|
[Task Scheduler](https://leetcode.com/problems/task-scheduler/)| [Swift](./Array/TaskScheduler.swift)| Medium| O(nlogn)| O(n)|
[Sliding Window Maximum ](https://leetcode.com/problems/sliding-window-maximum/)| [Swift](./Array/SlidingWindowMaximum.swift)| Hard| O(n)| O(n)|
[Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)| [Swift](./Array/LongestConsecutiveSequence.swift)| Hard| O(n)| O(n)|


##### String
| Title | Solution | Difficulty | Time | Space |
| ----- | -------- | ---------- | ---- | ----- |
[Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)| [Swift](./String/FizzBuzz.swift)| Easy| O(n)| O(1)|
[First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/)| [Swift](./String/FirstUniqueCharacterInString.swift)| Easy| O(n)| O(1)|
[Keyboard Row](https://leetcode.com/problems/keyboard-row/)| [Swift](./String/KeyboardRow.swift)| Easy| O(nm)| O(n)|
[Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)| [Swift](./String/ValidPalindrome.swift)| Easy| O(n)| O(n)|
[Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/)| [Swift](./String/ValidPalindromeII.swift)| Easy| O(n)| O(n)|
[Detect Capital](https://leetcode.com/problems/detect-capital/)| [Swift](./String/DetectCapital.swift)| Easy| O(n)| O(1)|
[Count and Say](https://leetcode.com/problems/count-and-say/)| [Swift](./String/CountAndSay.swift)| Easy| O(n^2)| O(n)|
[Flip Game](https://leetcode.com/problems/flip-game/)| [Swift](./String/FlipGame.swift)| Easy| O(n)| O(n)|
[Implement strStr()](https://leetcode.com/problems/implement-strstr/)| [Swift](./String/StrStr.swift)| Easy| O(nm)| O(n)|
[Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)| [Swift](./String/IsomorphicStrings.swift)| Easy| O(n)| O(n)|
[Reverse String](https://leetcode.com/problems/reverse-string/)| [Swift](./String/ReverseString.swift)| Easy| O(n)| O(n)|
[Reverse String II](https://leetcode.com/problems/reverse-string-ii/)| [Swift](./String/ReverseStringII.swift)| Easy| O(n)| O(n)|
[Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)| [Swift](./String/ReverseVowelsOfAString.swift)| Easy| O(n)| O(n)|
[Length of Last Word](https://leetcode.com/problems/length-of-last-word/)| [Swift](./String/AddStrings.swift)| Easy| O(n)| O(n)|
[Add Strings](https://leetcode.com/problems/add-strings/)| [Swift](./String/LengthLastWord.swift)| Easy| O(n)| O(1)|
[Multiply Strings](https://leetcode.com/problems/multiply-strings/)| [Swift](./String/MultiplyStrings.swift)| Medium| O(n)| O(1)|
[Palindrome Permutation](https://leetcode.com/problems/palindrome-permutation/)| [Swift](./String/PalindromePermutation.swift)| Easy| O(n)| O(n)|
[Valid Anagram](https://leetcode.com/problems/valid-anagram/)| [Swift](./String/ValidAnagram.swift)| Easy| O(nlogn)| O(1)|
[Ransom Note](https://leetcode.com/problems/ransom-note/)| [Swift](./String/RansomNote.swift)| Easy| O(n)| O(n)|
[Group Anagrams](https://leetcode.com/problems/anagrams/)| [Swift](./String/GroupAnagrams.swift)| Medium| O(nmlogm + nlogn)| O(n)
[Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)| [Swift](./String/LongestCommonPrefix.swift)| Easy| O(nm)| O(m)|
[Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)| [Swift](./String/LongestSubstringWithoutRepeatingCharacters.swift)| Medium| O(n)| O(n)|
[One Edit Distance](https://leetcode.com/problems/one-edit-distance/)| [Swift](./String/OneEditDistance.swift)| Medium| O(n)| O(n)|
[Word Pattern](https://leetcode.com/problems/word-pattern/)| [Swift](./String/WordPattern.swift)| Easy| O(n)| O(n)|
[Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)| [Swift](./Array/MinimumWindowSubstring.swift)| Hard| O(n^2)| O(n)|
[Text Justification](https://leetcode.com/problems/text-justification/)| [Swift](./String/TextJustification.swift)| Hard| O(n)| O(n)|

##### Linked List
| Title | Solution | Difficulty | Time | Space |
| ----- | -------- | ---------- | ---- | ----- |
[Reverse Linked List](./LinkedList/Java/ReverseLinkedList.java)| [Java](./LinkedList/Java/ReverseLinkedList.java), [Swift](./LinkedList/Swift/ReverseLinkedList.swift)| Easy| O(n)| O(1)|
[Palindrome Linked List](./LinkedList/Java/PalindromeLinkedList.java)| [Java](./LinkedList/Java/PalindromeLinkedList.java), [Swift](./LinkedList/Swift/PalindromeLinkedList.swift)| Easy| O(n)| O(1)|
[Reverse Nodes In k-Groups](./LinkedList/Java/ReverseNodesInKGroups.java)| [Java](./LinkedList/Java/ReverseNodesInKGroups.java), [Swift](./LinkedList/Swift/ReverseNodesInKGroups.swift)| Easy| O(n)| O(1)|
[Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)| [Swift](./LinkedList/SwapNodesInPairs.swift)| Easy| O(n)| O(1)|
[Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)| [Swift](./LinkedList/RemoveLinkedListElements.swift)| Easy| O(n)| O(1)|
[Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)| [Swift](./LinkedList/RemoveDuplicatesFromSortedList.swift)| Easy| O(n)| O(1)|
[Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)| [Swift](./LinkedList/RemoveDuplicatesFromSortedListII.swift)| Medium| O(n)| O(1)|
[Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)| [Swift](./LinkedList/RemoveNthFromEnd.swift)| Easy| O(n)| O(1)|
[Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)| [Swift](./LinkedList/OddEvenLinkedList.swift)| Medium| O(n)| O(1)|
[Rotate List](https://leetcode.com/problems/rotate-list/)| [Swift](./LinkedList/RotateList.swift)| Medium| O(n)| O(1)|
[Reorder List](https://leetcode.com/problems/reorder-list/)| [Swift](./LinkedList/ReorderList.swift)| Medium| O(n)| O(1)|
[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)| [Swift](./LinkedList/MergeTwoSortedLists.swift)| Easy| O(n)| O(1)|
[Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)| [Swift](./LinkedList/MergeKSortedLists.swift)| Hard| O(mlogn)| O(1)|
[Partition List](https://leetcode.com/problems/partition-list/)| [Swift](./LinkedList/PartitionList.swift)| Medium| O(n)| O(1)|

##### Stack
| Title | Solution | Difficulty | Time | Space |
| ----- | -------- | ---------- | ---- | ----- |
[Valid Parentheses](./Stack/Java/ValidParentheses.java)| [Java](./Stack/Java/ValidParentheses.java), [Swift](./Stack/Swift/ValidParentheses.swift)| Easy| O(n)| O(n)|
[Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/)| [Swift](./Stack/LongestValidParentheses.swift)| Hard| O(n)| O(n)|
[Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)| [Swift](./Stack/EvaluateReversePolishNotation.swift)| Medium| O(n)| O(n)|
[Simplify Path](https://leetcode.com/problems/simplify-path/)| [Swift](./Stack/SimplifyPath.swift)| Medium| O(n)| O(n)|
[Remove K Digits](https://leetcode.com/problems/remove-k-digits/)| [Swift](./Stack/RemoveKDigits.swift)| Medium| O(n)| O(n)|
[Ternary Expression Parser](https://leetcode.com/problems/ternary-expression-parser/)| [Swift](./Stack/TernaryExpressionParser.swift)| Medium| O(n)| O(n)|
[Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)| [Swift](./Stack/PreorderTraversal.swift)| Medium| O(n)| O(n)|
[Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)| [Swift](./Stack/InorderTraversal.swift)| Medium| O(n)| O(n)|
[Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)| [Swift](./Stack/PostorderTraversal.swift)| Hard| O(n)| O(n)|

##### Search
| Title | Solution | Difficulty | Time | Space |
| ----- | -------- | ---------- | ---- | ----- |
[Binary Search](./Search/Java/BinarySearch.java)| [Java](./Search/Java/BinarySearch.java), [Swift](./Search/Swift/BinarySearch.swift)| Easy| O(logn)| O(1)|
[First Position of Target](./Search/Java/FirstPositionOfTarget.java)| [Java](./Search/Java/FirstPositionOfTarget.java), [Swift](./Search/Swift/FirstPositionOfTarget.swift)| Easy| O(logn)| O(1)|
[Last Position of Target](./Search/Java/LastPositionOfTarget.java)| [Java](./Search/Java/LastPositionOfTarget.java), [Swift](./Search/Swift/LastPositionOfTarget.swift)| Easy| O(logn)| O(1)|
[First Bad Version](./Search/Java/FirstBadVersion.java)| [Java](./Search/Java/FirstBadVersion.java), [Swift](./Search/Swift/FirstBadVersion.swift)| Easy| O(logn)| O(1)|

###### ... understand the structure

```none
┌──────────────┐    ┌──────────────┐
│   G    ├────▶         Q    │
└───────┬──────┘    └──────┬───────┘
        │                  │        
┌───────▼──────────────────▼───────┐
│             D.P.              │
└───────▲──────────────────▲───────┘
        │                  │        
┌───────┴──────┐    ┌──────┴───────┐
│    Tree      │    │  Advanced    │
└──────────────┘    └──────────────┘
```


