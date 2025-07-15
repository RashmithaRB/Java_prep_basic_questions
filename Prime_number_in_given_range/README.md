# 🧮 Prime Number Finder

This Java program prints all prime numbers up to a user-defined range and counts the total number of prime numbers within that range. It uses a simplified version of the **Sieve of Eratosthenes** algorithm.

## 📁 Package Structure

- **Package Name:** `placement`
- **Class Name:** `prime_num`

## 🚀 Program Flow

1. The user is prompted to enter a number `n` (the range).
2. The program initializes an array `res[]` of size `n`, assuming all numbers are prime.
3. It marks non-prime numbers (composites) by checking divisibility from 2 up to √n.
4. It then prints all prime numbers up to `n` and the total count.

## 🔢 Logic Overview

- Initialize an array `res[]` of size `range` with all elements set to 1 (true for prime).
- Set `res[0]` and `res[1]` to 0 since 0 and 1 are not primes.
- For every number `i` from 2 to √range:
  - If `res[i]` is 1, mark its multiples as non-prime by setting `res[j] = 0`.

### 🧠 Key Concepts Used
- Sieve of Eratosthenes
- Time Complexity: O(n log log n) (although current inner loop can be optimized)
- Use of boolean-like integer array to mark primes
- Square root optimization

## ✅ Sample Input/Output

### Input
Enter the range:
30

### Output
2
3
5
7
11
13
17
19
23
29
count:10


## 🔍 Example Explanation

From 0 to 30, the prime numbers are:
**2, 3, 5, 7, 11, 13, 17, 19, 23, 29**  
Hence, count = **10**

## 🛠️ How to Run

1. Save the file as `prime_num.java` inside the `placement` folder.
2. Compile and run using:

```bash
javac placement/prime_num.java
java placement.prime_num
```