# Spiral Matrix Traversal – Java

This Java program performs a **spiral traversal** of a 2D matrix and prints the elements in a clockwise spiral order. It handles any rectangular or square matrix.

## 🔍 Example

Given the matrix:

```java
int[][] nums = {
    {18, 17, 16},
    { 5,  4,  3},
    { 6,  7,  8}
};
Output:
18 17 16 3 8 7 6 5 4

The spiral traversal begins at the top-left corner and moves:

Left ➝ Right (top row)

Top ➝ Bottom (right column)

Right ➝ Left (bottom row)

Bottom ➝ Top (left column)

This process repeats inward for the remaining submatrix until all elements are printed.

Variables Used:
top, bottom: Track the current bounds of rows

left, right: Track the current bounds of columns

📌 Features
Supports square and rectangular matrices

Clean spiral traversal logic

No external libraries needed (uses only core Java)