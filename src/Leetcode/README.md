# LeetCode solutions by topic

All LeetCode Java sources live here. Difficulty is metadata in the index below; directories follow topics.

```text
Leetcode/
├── NeetCode/       # Problems in NeetCode 150 / 250, grouped by topic
├── Additional/     # Problems outside those curated lists, also grouped by topic
├── ListNode.java   # Existing shared helper; not a problem
└── README.md       # Topic map and complete problem index
```

## Topic map

Start with coverage of all NeetCode 150 topics, then deepen it with NeetCode 250.
Every roadmap topic has a directory, including topics with no Java problems yet.

The repository contains **86 distinct NeetCode problems** (70 from 150, plus 16 additional problems from 250), **88 implementations**, and **19 Additional problem files**.
These counts describe source files, not Accepted results or current understanding. `Choose_K_Elems` is unfinished.

| Topic | From 150 | Added by 250 | Local state |
| --- | --- | --- | --- |
| [Arrays & Hashing](NeetCode/ArraysAndHashing/) | 1 | 5 | Code present; review separately |
| [Two Pointers](NeetCode/TwoPointers/) | 3 | 2 | Code present; review separately |
| [Sliding Window](NeetCode/SlidingWindow/) | 6 | 1 | Code present; review separately |
| [Stack](NeetCode/Stack/) | 6 | 7 | Code present; review separately |
| [Binary Search](NeetCode/BinarySearch/) | 7 | 1 | Code present; review separately |
| [Linked List](NeetCode/LinkedList/) | 11 | 0 | Code present; review separately |
| [Trees](NeetCode/Tree/) | 15 | 0 | Code present; review separately |
| [Heap / Priority Queue](NeetCode/Heap/) | 7 | 0 | Code present; review separately |
| [Backtracking](NeetCode/Backtracking/) | 5 | 0 | Code present; review separately |
| [Tries](NeetCode/Tries/) | 3 | 0 | Code present; review separately |
| [Graphs](NeetCode/Graphs/) | 0 | 0 | Not started |
| [Advanced Graphs](NeetCode/AdvancedGraphs/) | 0 | 0 | Not started |
| [1-D Dynamic Programming](NeetCode/DynamicProgramming1D/) | 0 | 0 | Not started |
| [2-D Dynamic Programming](NeetCode/DynamicProgramming2D/) | 1 | 0 | Code present; review separately |
| [Greedy](NeetCode/Greedy/) | 0 | 0 | Not started |
| [Intervals](NeetCode/Intervals/) | 2 | 0 | Code present; review separately |
| [Math & Geometry](NeetCode/MathAndGeometry/) | 2 | 0 | Code present; review separately |
| [Bit Manipulation](NeetCode/BitManipulation/) | 1 | 0 | Code present; review separately |

Some topics overlap. Folder placement follows NeetCode's learning categories where available: for example, #75 Sort Colors and #122 Stock II are under Arrays & Hashing, and #268 Missing Number is under Bit Manipulation even though the current solution uses arithmetic.
Additional problems use the most relevant local topic; these placements do not imply curated-list membership.

## How to add a problem

1. Identify the actual problem number, not just the Java class name.
2. If it belongs to NeetCode 150 or 250, use `NeetCode/<Topic>/`; otherwise use `Additional/<Topic>/`.
3. Match the Java `package` to the directory and update this index. Difficulty stays in the table or a source comment.
4. Keep a second implementation when useful. If class names collide, place one in a `Variants` subpackage.
5. Check understanding separately in Obsidian. A source file does not establish independent mastery.

## Preserved implementations and helpers

- #3 has both `SlidingWindow/LengthOfLongestSubstring.java` and `SlidingWindow/StringWithoutRep.java`.
- #56 has `Intervals/MergeIntervals.java` and `Intervals/Variants/MergeIntervals.java`; their APIs and implementations remain distinct.
- `SlidingWindow/MaxProfit.java` is #121 (one transaction). `ArraysAndHashing/MaxProfit.java` is #122 (multiple transactions).
- `NeetCode/Tree/TreeNode.java`, `NeetCode/LinkedList/ListNode.java`, `NeetCode/LinkedList/Node.java`, `NeetCode/Intervals/Interval.java`, and the root `ListNode.java` are helpers, excluded from problem counts. Their existing visibility and APIs are preserved.

## Classification sources

Checked on 2026-10-22. Topic labels and NeetCode 150 flags come from the [official NeetCode problem data](https://github.com/neetcode-gh/leetcode/blob/main/.problemSiteData.json).
The 250 membership check uses the [250-ID manifest](https://github.com/siansiansu/leetctl/blob/main/data/sets/neetcode250.toml), whose source snapshot is dated **2026-08-17**; the [official 250 list](https://neetcode.io/practice/practice/neetcode250) remains the reference for future changes.
The official data file also contains NeetCode All problems, so presence there alone is not treated as 250 membership.

## NeetCode problem index

| # | Problem | Difficulty | List | Java source |
| --- | --- | --- | --- | --- |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | 150 + 250 | [NeetCode/LinkedList/AddTwoNumbers.java](NeetCode/LinkedList/AddTwoNumbers.java) |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | 150 + 250 | [NeetCode/SlidingWindow/LengthOfLongestSubstring.java](NeetCode/SlidingWindow/LengthOfLongestSubstring.java) |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | 150 + 250 | [NeetCode/SlidingWindow/StringWithoutRep.java](NeetCode/SlidingWindow/StringWithoutRep.java) |
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard | 150 + 250 | [NeetCode/BinarySearch/Median.java](NeetCode/BinarySearch/Median.java) |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | 150 + 250 | [NeetCode/TwoPointers/ContainerWithMostWater.java](NeetCode/TwoPointers/ContainerWithMostWater.java) |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | 150 + 250 | [NeetCode/TwoPointers/ThreeSum.java](NeetCode/TwoPointers/ThreeSum.java) |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | 150 + 250 | [NeetCode/LinkedList/RemoveNthFromEnd.java](NeetCode/LinkedList/RemoveNthFromEnd.java) |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | 150 + 250 | [NeetCode/Stack/ValidParentheses.java](NeetCode/Stack/ValidParentheses.java) |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | 150 + 250 | [NeetCode/LinkedList/MergeTwoLists.java](NeetCode/LinkedList/MergeTwoLists.java) |
| 23 | [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | 150 + 250 | [NeetCode/LinkedList/MergeKLists.java](NeetCode/LinkedList/MergeKLists.java) |
| 25 | [Reverse Nodes In K Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | Hard | 150 + 250 | [NeetCode/LinkedList/ReverseKgroups.java](NeetCode/LinkedList/ReverseKgroups.java) |
| 33 | [Search In Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | 150 + 250 | [NeetCode/BinarySearch/RotatedSearch.java](NeetCode/BinarySearch/RotatedSearch.java) |
| 39 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | 150 + 250 | [NeetCode/Backtracking/CombinationSum.java](NeetCode/Backtracking/CombinationSum.java) |
| 40 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium | 150 + 250 | [NeetCode/Backtracking/CombinationSum2.java](NeetCode/Backtracking/CombinationSum2.java) |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | 150 + 250 | [NeetCode/TwoPointers/TrappingRainWater.java](NeetCode/TwoPointers/TrappingRainWater.java) |
| 46 | [Permutations](https://leetcode.com/problems/permutations/) | Medium | 150 + 250 | [NeetCode/Backtracking/Permutations.java](NeetCode/Backtracking/Permutations.java) |
| 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | 150 + 250 | [NeetCode/Intervals/MergeIntervals.java](NeetCode/Intervals/MergeIntervals.java) |
| 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | 150 + 250 | [NeetCode/Intervals/Variants/MergeIntervals.java](NeetCode/Intervals/Variants/MergeIntervals.java) |
| 66 | [Plus One](https://leetcode.com/problems/plus-one/) | Easy | 150 + 250 | [NeetCode/MathAndGeometry/PlusOne.java](NeetCode/MathAndGeometry/PlusOne.java) |
| 69 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | Easy | 250 only | [NeetCode/BinarySearch/Sqrt.java](NeetCode/BinarySearch/Sqrt.java) |
| 71 | [Simplify Path](https://leetcode.com/problems/simplify-path/) | Medium | 250 only | [NeetCode/Stack/SimplifyPath.java](NeetCode/Stack/SimplifyPath.java) |
| 74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium | 150 + 250 | [NeetCode/BinarySearch/SearchMatrix.java](NeetCode/BinarySearch/SearchMatrix.java) |
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Medium | 250 only | [NeetCode/ArraysAndHashing/SortColors.java](NeetCode/ArraysAndHashing/SortColors.java) |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard | 150 + 250 | [NeetCode/SlidingWindow/MinimumWindow.java](NeetCode/SlidingWindow/MinimumWindow.java) |
| 78 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | 150 + 250 | [NeetCode/Backtracking/Subsets.java](NeetCode/Backtracking/Subsets.java) |
| 84 | [Largest Rectangle In Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | 150 + 250 | [NeetCode/Stack/LargestRectangleInHistogram.java](NeetCode/Stack/LargestRectangleInHistogram.java) |
| 90 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | Medium | 150 + 250 | [NeetCode/Backtracking/Subsets2.java](NeetCode/Backtracking/Subsets2.java) |
| 97 | [Interleaving String](https://leetcode.com/problems/interleaving-string/) | Medium | 150 + 250 | [NeetCode/DynamicProgramming2D/InterleavingString.java](NeetCode/DynamicProgramming2D/InterleavingString.java) |
| 98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | 150 + 250 | [NeetCode/Tree/IsValidBST.java](NeetCode/Tree/IsValidBST.java) |
| 100 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy | 150 + 250 | [NeetCode/Tree/IsSameTree.java](NeetCode/Tree/IsSameTree.java) |
| 102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium | 150 + 250 | [NeetCode/Tree/LevelOrder.java](NeetCode/Tree/LevelOrder.java) |
| 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | 150 + 250 | [NeetCode/Tree/MaxDepth.java](NeetCode/Tree/MaxDepth.java) |
| 105 | [Construct Binary Tree From Preorder And Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | 150 + 250 | [NeetCode/Tree/BuildTree.java](NeetCode/Tree/BuildTree.java) |
| 110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | Easy | 150 + 250 | [NeetCode/Tree/IsBalanced.java](NeetCode/Tree/IsBalanced.java) |
| 121 | [Best Time to Buy And Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | 150 + 250 | [NeetCode/SlidingWindow/MaxProfit.java](NeetCode/SlidingWindow/MaxProfit.java) |
| 122 | [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | Medium | 250 only | [NeetCode/ArraysAndHashing/MaxProfit.java](NeetCode/ArraysAndHashing/MaxProfit.java) |
| 124 | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | Hard | 150 + 250 | [NeetCode/Tree/MaxPathSum.java](NeetCode/Tree/MaxPathSum.java) |
| 128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Medium | 150 + 250 | [NeetCode/ArraysAndHashing/LongestConsecutiveSequence.java](NeetCode/ArraysAndHashing/LongestConsecutiveSequence.java) |
| 138 | [Copy List With Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/) | Medium | 150 + 250 | [NeetCode/LinkedList/CopyRandomList.java](NeetCode/LinkedList/CopyRandomList.java) |
| 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy | 150 + 250 | [NeetCode/LinkedList/HasCycle.java](NeetCode/LinkedList/HasCycle.java) |
| 143 | [Reorder List](https://leetcode.com/problems/reorder-list/) | Medium | 150 + 250 | [NeetCode/LinkedList/ReorderList.java](NeetCode/LinkedList/ReorderList.java) |
| 146 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | Medium | 150 + 250 | [NeetCode/LinkedList/LRUCache.java](NeetCode/LinkedList/LRUCache.java) |
| 150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | Medium | 150 + 250 | [NeetCode/Stack/EvalRPN.java](NeetCode/Stack/EvalRPN.java) |
| 153 | [Find Minimum In Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | 150 + 250 | [NeetCode/BinarySearch/FindMin.java](NeetCode/BinarySearch/FindMin.java) |
| 155 | [Min Stack](https://leetcode.com/problems/min-stack/) | Medium | 150 + 250 | [NeetCode/Stack/MinStack.java](NeetCode/Stack/MinStack.java) |
| 199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | Medium | 150 + 250 | [NeetCode/Tree/RightSideView.java](NeetCode/Tree/RightSideView.java) |
| 202 | [Happy Number](https://leetcode.com/problems/happy-number/) | Easy | 150 + 250 | [NeetCode/MathAndGeometry/HappyNumber.java](NeetCode/MathAndGeometry/HappyNumber.java) |
| 206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | 150 + 250 | [NeetCode/LinkedList/ReverseList.java](NeetCode/LinkedList/ReverseList.java) |
| 208 | [Implement Trie Prefix Tree](https://leetcode.com/problems/implement-trie-prefix-tree/) | Medium | 150 + 250 | [NeetCode/Tries/Trie.java](NeetCode/Tries/Trie.java) |
| 209 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Medium | 250 only | [NeetCode/SlidingWindow/MinimumSizeSubarraySum.java](NeetCode/SlidingWindow/MinimumSizeSubarraySum.java) |
| 211 | [Design Add And Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) | Medium | 150 + 250 | [NeetCode/Tries/WordDictionary.java](NeetCode/Tries/WordDictionary.java) |
| 212 | [Word Search II](https://leetcode.com/problems/word-search-ii/) | Hard | 150 + 250 | [NeetCode/Tries/WordSearch.java](NeetCode/Tries/WordSearch.java) |
| 215 | [Kth Largest Element In An Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Medium | 150 + 250 | [NeetCode/Heap/FindKthLargest.java](NeetCode/Heap/FindKthLargest.java) |
| 225 | [Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | Easy | 250 only | [NeetCode/Stack/StackUsingQueues.java](NeetCode/Stack/StackUsingQueues.java) |
| 226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | 150 + 250 | [NeetCode/Tree/InvertTree.java](NeetCode/Tree/InvertTree.java) |
| 229 | Majority Element II | Medium | 250 only | [NeetCode/ArraysAndHashing/MajorityElementII.java](NeetCode/ArraysAndHashing/MajorityElementII.java) |
| 230 | [Kth Smallest Element In a Bst](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Medium | 150 + 250 | [NeetCode/Tree/kthSmallest.java](NeetCode/Tree/kthSmallest.java) |
| 232 | Implement Queue using Stacks | Easy | 250 only | [NeetCode/Stack/QueueUsingStack.java](NeetCode/Stack/QueueUsingStack.java) |
| 235 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | Medium | 150 + 250 | [NeetCode/Tree/LowestCommonAncestor.java](NeetCode/Tree/LowestCommonAncestor.java) |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard | 150 + 250 | [NeetCode/SlidingWindow/MaxSlidingWindow.java](NeetCode/SlidingWindow/MaxSlidingWindow.java) |
| 252 | [Meeting Rooms](https://leetcode.com/problems/meeting-rooms/) | Easy | 150 + 250 | [NeetCode/Intervals/MeetingRoom.java](NeetCode/Intervals/MeetingRoom.java) |
| 268 | [Missing Number](https://leetcode.com/problems/missing-number/) | Easy | 150 + 250 | [NeetCode/BitManipulation/MissingNumber.java](NeetCode/BitManipulation/MissingNumber.java) |
| 287 | [Find The Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | Medium | 150 + 250 | [NeetCode/LinkedList/FindDuplicate.java](NeetCode/LinkedList/FindDuplicate.java) |
| 295 | [Find Median From Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | 150 + 250 | [NeetCode/Heap/MedianFinder.java](NeetCode/Heap/MedianFinder.java) |
| 297 | [Serialize And Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | Hard | 150 + 250 | [NeetCode/Tree/Codec.java](NeetCode/Tree/Codec.java) |
| 304 | [Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/) | Medium | 250 only | [NeetCode/ArraysAndHashing/NumMatrix.java](NeetCode/ArraysAndHashing/NumMatrix.java) |
| 355 | [Design Twitter](https://leetcode.com/problems/design-twitter/) | Medium | 150 + 250 | [NeetCode/Heap/Twitter.java](NeetCode/Heap/Twitter.java) |
| 394 | [Decode String](https://leetcode.com/problems/decode-string/) | Medium | 250 only | [NeetCode/Stack/DecodeString.java](NeetCode/Stack/DecodeString.java) |
| 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium | 150 + 250 | [NeetCode/SlidingWindow/CharacterReplacement.java](NeetCode/SlidingWindow/CharacterReplacement.java) |
| 543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | 150 + 250 | [NeetCode/Tree/Diameter.java](NeetCode/Tree/Diameter.java) |
| 560 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Medium | 250 only | [NeetCode/ArraysAndHashing/SubArraySumEqualsK.java](NeetCode/ArraysAndHashing/SubArraySumEqualsK.java) |
| 567 | [Permutation In String](https://leetcode.com/problems/permutation-in-string/) | Medium | 150 + 250 | [NeetCode/SlidingWindow/CheckInclusion.java](NeetCode/SlidingWindow/CheckInclusion.java) |
| 572 | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/) | Easy | 150 + 250 | [NeetCode/Tree/IsSubtree.java](NeetCode/Tree/IsSubtree.java) |
| 621 | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | Medium | 150 + 250 | [NeetCode/Heap/TaskScheduler.java](NeetCode/Heap/TaskScheduler.java) |
| 680 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) | Easy | 250 only | [NeetCode/TwoPointers/ValidPalindromeII.java](NeetCode/TwoPointers/ValidPalindromeII.java) |
| 682 | [Baseball Game](https://leetcode.com/problems/baseball-game/) | Easy | 250 only | [NeetCode/Stack/BaseballGame.java](NeetCode/Stack/BaseballGame.java) |
| 703 | [Kth Largest Element In a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) | Easy | 150 + 250 | [NeetCode/Heap/KthLargest.java](NeetCode/Heap/KthLargest.java) |
| 704 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy | 150 + 250 | [NeetCode/BinarySearch/Search.java](NeetCode/BinarySearch/Search.java) |
| 735 | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/) | Medium | 250 only | [NeetCode/Stack/AsteroidCollision.java](NeetCode/Stack/AsteroidCollision.java) |
| 739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | Medium | 150 + 250 | [NeetCode/Stack/DailyTemp.java](NeetCode/Stack/DailyTemp.java) |
| 853 | [Car Fleet](https://leetcode.com/problems/car-fleet/) | Medium | 150 + 250 | [NeetCode/Stack/CarFleet.java](NeetCode/Stack/CarFleet.java) |
| 875 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | Medium | 150 + 250 | [NeetCode/BinarySearch/MinEatingSpeed.java](NeetCode/BinarySearch/MinEatingSpeed.java) |
| 881 | [Boats to Save People](https://leetcode.com/problems/boats-to-save-people/) | Medium | 250 only | [NeetCode/TwoPointers/BoatsToSavePeople.java](NeetCode/TwoPointers/BoatsToSavePeople.java) |
| 901 | [Online Stock Span](https://leetcode.com/problems/online-stock-span/) | Medium | 250 only | [NeetCode/Stack/StockSpanner.java](NeetCode/Stack/StockSpanner.java) |
| 973 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) | Medium | 150 + 250 | [NeetCode/Heap/kClosest.java](NeetCode/Heap/kClosest.java) |
| 981 | [Time Based Key Value Store](https://leetcode.com/problems/time-based-key-value-store/) | Medium | 150 + 250 | [NeetCode/BinarySearch/TimeMap.java](NeetCode/BinarySearch/TimeMap.java) |
| 1046 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) | Easy | 150 + 250 | [NeetCode/Heap/LastStoneWeight.java](NeetCode/Heap/LastStoneWeight.java) |
| 1448 | [Count Good Nodes In Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) | Medium | 150 + 250 | [NeetCode/Tree/GoodNodes.java](NeetCode/Tree/GoodNodes.java) |

## Additional problem index

These problems are outside both curated sets according to the classification sources above. Their implementations are kept by topic.

| # | Problem | Difficulty | List | Java source |
| --- | --- | --- | --- | --- |
| 8 | String to Integer (atoi) | Medium | Outside 150/250 | [Additional/Strings/Atoi.java](Additional/Strings/Atoi.java) |
| 119 | Pascal's Triangle II | Easy | Outside 150/250 | [Additional/MathAndGeometry/PascalTriangle.java](Additional/MathAndGeometry/PascalTriangle.java) |
| 389 | Find the Difference | Easy | Outside 150/250 | [Additional/BitManipulation/FindTheDifference.java](Additional/BitManipulation/FindTheDifference.java) |
| 441 | [Arranging Coins](https://leetcode.com/problems/arranging-coins/) | Easy | Outside 150/250 | [Additional/MathAndGeometry/ArrangeCoins.java](Additional/MathAndGeometry/ArrangeCoins.java) |
| 506 | Relative Ranks | Easy | Outside 150/250 | [Additional/ArraysAndHashing/RelativeRanks.java](Additional/ArraysAndHashing/RelativeRanks.java) |
| 643 | Maximum Average Subarray I | Easy | Outside 150/250 | [Additional/SlidingWindow/MaximumAverageSubarray.java](Additional/SlidingWindow/MaximumAverageSubarray.java) |
| 713 | Subarray Product Less Than K | Medium | Outside 150/250 | [Additional/SlidingWindow/SubarrayProductLessThanK.java](Additional/SlidingWindow/SubarrayProductLessThanK.java) |
| 724 | [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/) | Easy | Outside 150/250 | [Additional/ArraysAndHashing/FindPivotIndex.java](Additional/ArraysAndHashing/FindPivotIndex.java) |
| 896 | Monotonic Array | Easy | Outside 150/250 | [Additional/ArraysAndHashing/MonotonicArray.java](Additional/ArraysAndHashing/MonotonicArray.java) |
| 905 | Sort Array By Parity | Easy | Outside 150/250 | [Additional/TwoPointers/SortArrayByParity.java](Additional/TwoPointers/SortArrayByParity.java) |
| 1436 | Destination City | Easy | Outside 150/250 | [Additional/ArraysAndHashing/DestinationCity.java](Additional/ArraysAndHashing/DestinationCity.java) |
| 1550 | Three Consecutive Odds | Easy | Outside 150/250 | [Additional/ArraysAndHashing/ThreeOdds.java](Additional/ArraysAndHashing/ThreeOdds.java) |
| 1814 | Count Nice Pairs in an Array | Medium | Outside 150/250 | [Additional/ArraysAndHashing/CountNicePairs.java](Additional/ArraysAndHashing/CountNicePairs.java) |
| 2027 | Minimum Moves to Convert String | Easy | Outside 150/250 | [Additional/Greedy/MinimumMoves.java](Additional/Greedy/MinimumMoves.java) |
| 2042 | Check if Numbers Are Ascending in a Sentence | Easy | Outside 150/250 | [Additional/ArraysAndHashing/AreNumbersAscending.java](Additional/ArraysAndHashing/AreNumbersAscending.java) |
| 2578 | Split With Minimum Sum | Easy | Outside 150/250 | [Additional/Greedy/SplitNum.java](Additional/Greedy/SplitNum.java) |
| 2670 | Find the Distinct Difference Array | Easy | Outside 150/250 | [Additional/ArraysAndHashing/DistinctDifferenceArray.java](Additional/ArraysAndHashing/DistinctDifferenceArray.java) |
| 3146 | Permutation Difference between Two Strings | Easy | Outside 150/250 | [Additional/ArraysAndHashing/PermutationDiff.java](Additional/ArraysAndHashing/PermutationDiff.java) |
| 3478 | Choose K Elements With Maximum Sum — TODO stub | Medium | Outside 150/250 | [Additional/Heap/Choose_K_Elems.java](Additional/Heap/Choose_K_Elems.java) |
