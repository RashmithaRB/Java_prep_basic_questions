# Inverted Left Triangle Pattern – Java

This Java program prints an **inverted left-aligned triangle** of asterisks (`*`) in the center of the console output.

## 🔍 Example Output

                * * * * *
                * * * *
                * * *
                * *
                *


## 🧠 Description

The pattern starts with 5 stars on the first line and decreases by one star per line, forming an inverted left triangle. To visually center the triangle horizontally on the screen, the program prepends each line with 20 spaces.

### Core Logic:
- Outer loop controls the rows.
- First inner loop adds 20 leading spaces for horizontal centering.
- Second inner loop prints decreasing number of asterisks.

## 📌 Features

- Simple and clean logic using nested loops
- Horizontally centered output
- Customizable triangle size by adjusting loop bounds

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK)
- A code editor (such as VS Code, IntelliJ IDEA, or Eclipse)

### How to Compile and Run

```bash
javac inverted_left_triangle.java
java placement.inverted_left_triangle
```