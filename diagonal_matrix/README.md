# Diagonal Matrix Traversal – Java

This Java program prints the diagonals of a 2D matrix (top-left to bottom-right) in a structured order, separating the **upper diagonals** (starting from the first column) and **lower diagonals** (starting from the top row, excluding the first column).

## 🔍 Example Matrix

```java
int[][] mat = {
    {10, 20, 30, 40, 50},
    { 5,  6,  7,  8,  9},
    {11, 22, 33, 44, 55},
    {16, 17, 18, 19, 20}
};

✅ Output:

10
5 20
11 6 30
16 22 7 40
17 33 8 50
18 44 9
19 55
20


🧠 Description
The matrix is traversed diagonally:

Upper half: Starts from the first column and moves downward diagonally.

Lower half: Starts from the top row (excluding the first element) and moves upward diagonally.

🧠 Logic & Approach
First Loop (Upper Diagonals):
Iterates through each row index of the first column.
For each start point (i,0), prints all diagonal elements up to the top row.

Second Loop (Lower Diagonals):
Starts from the second column of the first row.
For each start point (0,j), prints all diagonal elements down to the bottom row.

Diagonal elements satisfy the condition:
For a given diagonal, the sum of row and column indices remains constant.

Key Concepts Used:
Matrix traversal using (i, j) coordinates where i + j is constant along diagonals.

Two parts:

First loop handles top-left to main diagonal

Second loop handles diagonals starting after the main diagonal

📌 Features
Works for non-square matrices

Easy to understand and efficient traversal

Handles both upper and lower triangular diagonal sets
