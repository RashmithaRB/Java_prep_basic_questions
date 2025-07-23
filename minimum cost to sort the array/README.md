# 🔄 Minimum Cost to Sort Array by Swapping

This Java program calculates the **minimum cost required to sort an array**. The cost of each **swap** between two elements is calculated as the **sum of those two elements**.

---

## 📌 Problem Statement

Given an unsorted array of integers, **sort it using swaps**, where the **cost of each swap** is defined as:

cost = arr[i] + arr[j] (for every swap between arr[i] and arr[j])


Return the **total minimum cost** to sort the array using this logic.

---

## 🧠 Algorithm Logic

1. Clone and sort the input array.
2. Compare each element in the original array with the sorted one.
3. If the current element is not in the correct position:
   - Find the correct position of the expected value.
   - Swap the elements.
   - Add the **sum of the swapped elements** to the total cost.
4. Continue until the array becomes sorted.

---

## 📦 Example

### Input:
```java
int[] a = {7, 10, 8, 9};
```
Output:

min cost: 36

Explanation:

Swap 10 and 9 → Cost = 10 + 9 = 19

Swap 8 and 9 → Cost = 8 + 9 = 17

Total = 19 + 17 = 36