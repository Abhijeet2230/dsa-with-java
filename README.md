# DSA with Java

A collection of Data Structures and Algorithms problems solved using Java.

## Problems

### 📊 Arrays

<details>
<summary><b>Square of Sorted Array</b></summary>

**Approach:**
1. Square each element in the input array.
2. Use `Arrays.sort()` to sort the resulting squares.

**Complexity:**
- **Time:** $O(n \log n)$ due to sorting.
- **Space:** $O(n)$ for the result array.

[View Solution](dsa-problems/src/array/SquareOfStoredArray.java) | [LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array/)
</details>

<details>
<summary><b>Move Zeros</b></summary>

**Approach:**
- Use two pointers: a "slow" pointer (`j`) for the next available non-zero position and a "fast" pointer (`i`) to iterate.
- When a non-zero element is found at `i`, swap it with the element at `j` and increment `j`.

**Complexity:**
- **Time:** $O(n)$ - Single pass through the array.
- **Space:** $O(1)$ - Done in-place.

[View Solution](dsa-problems/src/array/MoveZeros.java) | [LeetCode](https://leetcode.com/problems/move-zeroes/)
</details>

<details>
<summary><b>Contains Duplicate</b></summary>

**Approach:**
- Use a `HashSet` to store elements as we iterate.
- If `set.add(ele)` returns `false`, it means the element is already present, so return `true`.

**Complexity:**
- **Time:** $O(n)$ - On average, set operations are $O(1)$.
- **Space:** $O(n)$ - To store elements in the set.

[View Solution](dsa-problems/src/array/ContainDuplicate.java) | [LeetCode](https://leetcode.com/problems/contains-duplicate/)
</details>

<details>
<summary><b>Majority Element</b></summary>

**Approach:**
1. **Sorting:** Sort the array; the majority element will always be at index `n/2`.
2. **Boyer-Moore Voting:** Track a `candidate` and a `count`. Increment count if we see the candidate, decrement otherwise. If count hits 0, pick the current element as the new candidate.

**Complexity:**
- **Time:** $O(n)$ for Voting, $O(n \log n)$ for Sorting.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/MajorityElement.java) | [LeetCode](https://leetcode.com/problems/majority-element/)
</details>

<details>
<summary><b>Reverse Array</b></summary>

**Approach:**
- Use two pointers starting from both ends (`start` and `end`).
- Swap elements at these pointers and move them towards the center until they meet.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/ReverseArray.java)
</details>

<details>
<summary><b>Two Sum</b></summary>

**Approach:**
- Use a `HashMap` to store `Value -> Index`.
- For each number, calculate `complement = target - current`.
- If the complement exists in the map, return the stored index and current index.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(n)$.

[View Solution](dsa-problems/src/array/TwoSum.java) | [LeetCode](https://leetcode.com/problems/two-sum/)
</details>

<details>
<summary><b>Convert 1D Array Into 2D</b></summary>

**Approach:**
- Check if total elements match `m * n`.
- Use nested loops or a single counter to map 1D indices to 2D `[i][j]` positions.

**Complexity:**
- **Time:** $O(m \times n)$.
- **Space:** $O(m \times n)$ for the output matrix.

[View Solution](dsa-problems/src/array/Convert1DArrayInto2D.java) | [LeetCode](https://leetcode.com/problems/convert-1d-array-into-2d-array/)
</details>

<details>
<summary><b>Merge Sorted Array</b></summary>

**Approach:**
- Since `nums1` has extra space, fill it from the **back** to avoid overwriting elements.
- Compare the largest elements of `nums1` and `nums2` and place the larger one at the end.

**Complexity:**
- **Time:** $O(m+n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/MergeSortedArray.java) | [LeetCode](https://leetcode.com/problems/merge-sorted-array/)
</details>

<details>
<summary><b>Numbers Disappeared in Array</b></summary>

**Approach:**
- Iterate through the array and for each value `x`, mark the element at index `|x|-1` as negative.
- After marking, any index `i` that still has a positive value means the number `i+1` was never seen.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$ if modifying in-place, $O(n)$ if using a boolean array.

[View Solution](dsa-problems/src/array/NoDisappearedInArray.java) | [LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
</details>

<details>
<summary><b>Range Sum Query (Prefix Sum)</b></summary>

**Approach:**
- **Precompute:** Create a `prefixSum` array where `prefix[i]` stores the sum of elements from `0` to `i`.
- **Query:** `sumRange(i, j) = prefix[j] - prefix[i-1]`.

**Complexity:**
- **Time:** $O(n)$ for setup, $O(1)$ per query.
- **Space:** $O(n)$.

[View Solution](dsa-problems/src/array/NumArray.java) | [LeetCode](https://leetcode.com/problems/range-sum-query-immutable/)
</details>

<details>
<summary><b>Remove Duplicates from Sorted Array</b></summary>

**Approach:**
- Use a slow pointer `j` to keep track of the unique elements' position.
- Iterate with `i`, and whenever `nums[i]` is different from `nums[j-1]`, move it to index `j`.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/RemoveDuplicateFromSortedArray.java) | [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
</details>

<details>
<summary><b>Remove Elements</b></summary>

**Approach:**
- Similar to moving zeros: iterate through the array and copy all elements that are **not** equal to `val` to the front.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/RemoveElements.java) | [LeetCode](https://leetcode.com/problems/remove-element/)
</details>

<details>
<summary><b>Binary Search</b></summary>

**Approach:**
- Maintain `low` and `high` pointers.
- Calculate `mid` and compare with target. Shrink the search space by half each time.

**Complexity:**
- **Time:** $O(\log n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/BinarySearch.java) | [LeetCode](https://leetcode.com/problems/binary-search/)
</details>

<details>
<summary><b>Maximum Average Subarray I</b></summary>

**Approach:**
- Use the **Sliding Window** technique.
- Calculate sum of first `k` elements.
- Slide the window by adding the next element and subtracting the one that fell off the back.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/MaxAvgSubArray.java) | [LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)
</details>

<details>
<summary><b>Best Time to Buy and Sell Stock</b></summary>

**Approach:**
- Track the `minPrice` seen so far.
- For each price, calculate potential `profit = currentPrice - minPrice`.
- Update `maxProfit` if current profit is higher.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/BestTimeToBuyAndSellStock.java) | [LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
</details>

<details>
<summary><b>Merge Sort</b></summary>

**Approach:**
- **Divide:** Split the array into two halves recursively.
- **Conquer:** Sort each half.
- **Combine:** Merge the two sorted halves into a single sorted array.

**Complexity:**
- **Time:** $O(n \log n)$.
- **Space:** $O(n)$.

[View Solution](dsa-problems/src/array/MergeSort.java)
</details>

<details>
<summary><b>Product of Array Except Self</b></summary>

**Approach:**
1. Create an `answer` array where `answer[i]` is the product of all elements to the **left** of `i`.
2. Iterate backwards and multiply each `answer[i]` by the product of all elements to the **right** of `i` using a running `suffix` variable.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$ (ignoring the output array).

[View Solution](dsa-problems/src/array/ProductOfArrayExceptSelf.java) | [LeetCode](https://leetcode.com/problems/product-of-array-except-self/)
</details>

<details>
<summary><b>Rotate Array</b></summary>

**Approach:**
- Reverse the entire array.
- Reverse the first `k` elements.
- Reverse the remaining `n-k` elements.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/RightRotateArrayByK.java) | [LeetCode](https://leetcode.com/problems/rotate-array/)
</details>

<details>
<summary><b>3Sum</b></summary>

**Approach:**
- Sort the array first.
- Iterate with pointer `i`. For each `i`, use two pointers (`j` and `k`) to find pairs such that `nums[i] + nums[j] + nums[k] == 0`.
- Skip duplicates to ensure unique triplets.

**Complexity:**
- **Time:** $O(n^2)$.
- **Space:** $O(n)$ or $O(\log n)$ depending on sorting implementation.

[View Solution](dsa-problems/src/array/ThreeSum.java) | [LeetCode](https://leetcode.com/problems/3sum/)
</details>

<details>
<summary><b>Two Sum II (Sorted Input)</b></summary>

**Approach:**
- Since the array is sorted, use two pointers (`start` and `end`).
- If `sum > target`, move the end pointer left. If `sum < target`, move the start pointer right.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/array/TwoSumII.java) | [LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
</details>

---

### 🔤 Strings

<details>
<summary><b>Longest Common Prefix</b></summary>

**Approach:**
- Sort the array of strings.
- Compare only the **first** and the **last** string in the sorted array (as they are the most different). The prefix shared by these two is the prefix shared by all.

**Complexity:**
- **Time:** $O(n \log n \times k)$ where $k$ is string length.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/string/LongestCommonPrefix.java) | [LeetCode](https://leetcode.com/problems/longest-common-prefix/)
</details>

<details>
<summary><b>Ransom Note</b></summary>

**Approach:**
- Create a frequency array (size 26) for the `magazine` characters.
- Iterate through the `ransomNote`, decrementing counts. If a count drops below zero, return `false`.

**Complexity:**
- **Time:** $O(n+m)$.
- **Space:** $O(1)$ (fixed alphabet size).

[View Solution](dsa-problems/src/string/RansomNote.java) | [LeetCode](https://leetcode.com/problems/ransom-note/)
</details>

<details>
<summary><b>Valid Anagram</b></summary>

**Approach:**
- Use a frequency array to count character occurrences. Increment for string `s` and decrement for string `t`. All counts must be zero at the end.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/string/ValidAnagram.java) | [LeetCode](https://leetcode.com/problems/valid-anagram/)
</details>

<details>
<summary><b>Backspace String Compare</b></summary>

**Approach:**
- Iterate both strings from the **end** towards the beginning.
- Maintain a `skip` count for `#` characters. Compare the next valid characters from both strings.

**Complexity:**
- **Time:** $O(n+m)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/string/BackspaceStringCompare.java) | [LeetCode](https://leetcode.com/problems/backspace-string-compare/)
</details>

<details>
<summary><b>Reverse String</b></summary>

**Approach:**
- Classic two-pointer swap from both ends.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/string/ReverseString.java) | [LeetCode](https://leetcode.com/problems/reverse-string/)
</details>

<details>
<summary><b>Valid Palindrome</b></summary>

**Approach:**
- Filter the string to keep only alphanumeric characters and convert to lowercase.
- Use two pointers to check if the filtered string reads the same forwards and backwards.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(n)$ for the filtered string.

[View Solution](dsa-problems/src/string/ValidPalindrome.java) | [LeetCode](https://leetcode.com/problems/valid-palindrome/)
</details>

<details>
<summary><b>Valid Palindrome II</b></summary>

**Approach:**
- Use two pointers. If a mismatch is found, check if the remaining substring is a palindrome by skipping either the left character or the right character.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/string/ValidPalindromeII.java) | [LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)
</details>

<details>
<summary><b>Group Anagrams</b></summary>

**Approach:**
- Use a `HashMap` where the **key** is a sorted version of the string (or a frequency string) and the **value** is a list of anagrams.

**Complexity:**
- **Time:** $O(n \times k \log k)$ for sorting keys.
- **Space:** $O(n \times k)$.

[View Solution](dsa-problems/src/string/GroupAnagram.java) | [LeetCode](https://leetcode.com/problems/group-anagrams/)
</details>

<details>
<summary><b>Is Subsequence</b></summary>

**Approach:**
- Use two pointers: one for string `s` and one for `t`.
- Advance the `s` pointer only when characters match. If `s` pointer reaches the end, it's a subsequence.

**Complexity:**
- **Time:** $O(\text{length of } t)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/string/IsSubsequence.java) | [LeetCode](https://leetcode.com/problems/is-subsequence/)
</details>

---

### 🔗 LinkedList

<details>
<summary><b>Implementation & Basics</b></summary>

**Details:**
- Custom Singly Linked List implementation with methods for `get`, `addAtHead`, `addAtTail`, `addAtIndex`, and `deleteAtIndex`.

[View Implementation](dsa-problems/src/LinkedList/LL.java)
</details>

<details>
<summary><b>Reverse Linked List</b></summary>

**Approach:**
- Use three pointers: `prev`, `curr`, and `next`.
- In each step, point `curr.next` to `prev`, then move pointers forward.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(1)$.

[View Solution](dsa-problems/src/LinkedList/ReverseLinkedList.java) | [LeetCode](https://leetcode.com/problems/reverse-linked-list/)
</details>

---

### 🥞 Stack

<details>
<summary><b>Valid Parentheses</b></summary>

**Approach:**
- Use a `Stack`. For every opening bracket, push it.
- For every closing bracket, check if it matches the top of the stack and pop. If stack is empty or mismatch, return `false`.

**Complexity:**
- **Time:** $O(n)$.
- **Space:** $O(n)$.

[View Solution](dsa-problems/src/stack/ValidParantheses.java) | [LeetCode](https://leetcode.com/problems/valid-parentheses/)
</details>

<details>
<summary><b>Custom Stack Implementation</b></summary>

**Details:**
- Array-based stack implementation with `push`, `pop`, `peek`, and a special `increment` operation.

[View Implementation](dsa-problems/src/stack/CustomStack.java)
</details>
