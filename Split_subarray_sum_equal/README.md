# 🔄 Array Splitter by Equal Sum

This Java program splits an integer array into two parts such that the **sum of elements in both parts is equal**. It prints both parts of the array if such a split is possible.

## 📁 Package Structure

- **Package Name:** `placement`
- **Class Name:** `split_array`

## 🚀 What It Does

1. Takes a predefined array of integers.
2. Calculates the total sum.
3. Splits the array at the point where the running sum becomes equal to half of the total sum.
4. Prints the two parts of the array.

### ✅ Example

Given array:
```java
{1, 2, 3, 4, 5, 5, 10}
```

Total Sum: 30

Target for each part: 15

Split:

First part: 1 2 3 4 5 → Sum = 15

Second part: 5 10 → Sum = 15

### 🧠 Core Logic
Calculate total sum of the array.

Traverse the array and keep a running sum.

When running sum == total/2, split at that point.

Print both sides.

### 📌 Assumptions
Input array is non-empty.

A valid split exists (the total sum is divisible by 2 and such partition is possible).

The program uses integer division (so it works only when the total sum is even).