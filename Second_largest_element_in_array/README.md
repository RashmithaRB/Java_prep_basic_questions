# 🔢 Second Largest Element Finder

This Java program finds the **second largest number** in a given array of integers using a single-pass traversal.

## 📁 Package Structure

- **Package Name:** `placement`
- **Class Name:** `Second_large`

## 🚀 What It Does

Given an array of integers, the program efficiently identifies the **second highest value** without sorting the array.

### ✅ Example

For the array:
```java
{48, 6, 23, 706, 88, 13, 65, 91, 100}

Largest: 706

Second Largest: 100

### Logic Explanation
Initialize:

largest = arr[0]

second_largest = -1 (or use Integer.MIN_VALUE for broader range)

Traverse the array:

If current value > largest, update second_largest = largest, then largest = current

If current value is less than largest but greater than second_largest, update second_largest

### 🧠 Key Concepts
One-pass traversal (O(n) time)

Conditional comparisons to avoid sorting

Edge case handling (if all elements are same or only one unique value)

#### 🧪 Sample Output
```
Input array: [48, 6, 23, 706, 88, 13, 65, 91, 100]
Output: 100
```

### 📌 Note
The current implementation returns -1 if there's no valid second largest value.

You may replace -1 with Integer.MIN_VALUE or throw a custom exception for more robust behavior.

For arrays with all identical elements, result will be -1.