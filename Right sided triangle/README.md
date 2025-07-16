# Right-Aligned Triangle Pattern – Java

This Java program prints a **right-aligned triangle** made of asterisks (`*`), centered horizontally in the console.

## 🔍 Example Output (for `n = 5`)

                *
              * *
            * * *
          * * * *
        * * * * *


## 🧠 Description

The program constructs a right triangle pattern with increasing rows of asterisks. The triangle is aligned to the right by inserting extra spaces before the stars on each line. To center the triangle in the console, an additional fixed number of spaces (`20`) is prepended.

### Core Logic

- Outer loop handles the number of rows.
- First inner loop prints 20 leading spaces to roughly center the pattern.
- Second inner loop prints decreasing spaces to shift stars to the right.
- Third inner loop prints increasing number of stars (`*`) for each row.

## 📌 Features

- Right-aligned triangle pattern
- Neatly centered on the screen
- Easily customizable row size

## 🚀 Getting Started

### Prerequisites

- Java installed (JDK)
- Code editor or terminal

### How to Run

```bash
javac right_triangle.java
java placement.right_triangle
```