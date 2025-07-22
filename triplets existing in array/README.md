# 🔢 Triplet Sum Checker - Java Program

This Java program checks whether any **three numbers** (triplet) in an array sum up to a given `target_sum`. If such a triplet exists, it prints their indices.

---

## 📌 Problem Statement

Given an integer array `a[]` and a target sum `T`, determine whether there exists any **triplet (a[i], a[j], a[k])** such that:

a[i] + a[j] + a[k] == T and i < j < k


If such a triplet is found, print the indices; otherwise, print "No triplets exist".

---

## 🧠 Logic & Approach

1. **Sort the array** to allow two-pointer traversal.
2. Fix the first element `a[i]` in a loop.
3. Use two pointers:
   - `j` starts from `i+1`
   - `k` starts from the end of the array.
4. Adjust the pointers to move towards the desired `target_sum`.
5. Stop as soon as one triplet is found.

---

## ⚙️ Algorithm Steps

1. Sort the array.
2. Loop while `i < k - 1`:
   - Set `j = i + 1`
   - While `a[i] + a[j] + a[k] > target_sum`: decrement `k`.
   - If sum matches: print indices and exit.
   - Otherwise: move `i` forward.

---

## 📦 Example

### Input:
```java
int[] a = {2, 4, 1, 0, 7, 8, 5, 6, 3, 9};
int target_sum = 13;
```
