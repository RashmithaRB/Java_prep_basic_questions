# Staircase Problem – Recursive Ways Calculator (Java)

This Java program calculates the number of distinct ways to climb a staircase of `n` steps, where you can climb **either 1 step or 2 steps at a time**. This is a classic problem in dynamic programming, and the current implementation uses **recursion**.

## 🔍 Problem Statement

Given `n` steps, you can take either 1 or 2 steps at a time. Find how many distinct ways you can climb to the top.

### Example

If `n = 4`, the possible combinations are:
- 1+1+1+1
- 1+1+2
- 1+2+1
- 2+1+1
- 2+2

✅ **Total Ways = 5**

## 📌 Program Behavior

- Prompts the user to enter a number (`n`) from the console.
- Calculates the number of ways recursively using:

ways(n) = ways(n-1) + ways(n-2)

markdown
Copy code
- Base cases:
- If `n == 1` → 1 way
- If `n == 2` → 2 ways

## 🧠 Logic Explained

This problem is structurally identical to the Fibonacci sequence:
ways(n) = ways(n-1) + ways(n-2)

- The idea is that to reach step `n`, you either come from `n-1` (1 step) or `n-2` (2 steps).
- So the total ways is the sum of the ways to reach those two previous steps.

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Java IDE or terminal for running the program

### How to Compile and Run

```bash
javac loop.java
java placement.loop
```