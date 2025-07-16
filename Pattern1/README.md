# Four Pattern Printer – Java

This Java program prints a specific pattern of numbers aligned to the center of the console. The pattern changes depending on the value of `n` and is currently designed for `n = 3`.

## 📋 Pattern Output (for n = 3)

                2
              1   3
                4


## 🧠 Description

The logic of the program:
- Centers the output by printing spaces (20 spaces for each line).
- For odd-indexed rows, it prints a single number.
- For even-indexed rows, it prints two numbers: previous number - 1 and previous number + 1.
- The pattern is symmetric and is designed to resemble a diamond-like shape (depending on how the numbers grow).

## 📌 Features

- Simple logic using loops and conditionals
- Centered output using consistent spacing
- Flexible `n` value to increase the size of the pattern (with minor logic tweaks)

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Java IDE or terminal access

### Compilation & Execution

```bash
javac four_pattern.java
java placement.four_pattern
```
