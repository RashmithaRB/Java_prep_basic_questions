# 🔢 Factor Combinations Finder – Java Program

This Java program finds all **unique combinations of factors** (excluding 1 and the number itself) for a given number. It helps you understand how numbers can be broken down into products of other numbers and how to generate meaningful groupings of those factors.

---

## 📌 Problem Statement

Given a number `n`, the goal is to find all unique **factor combinations** such that the product of numbers in each combination equals `n`.

**Constraints:**
- Only factors greater than 1 and less than `n` are considered.
- Duplicate and permuted combinations are not allowed.

### ✅ Example:

**Input:**  
n = 32



**Output:**
[2, 16]
[2, 2, 8]
[2, 2, 2, 4]
[2, 2, 2, 2, 2]
[4, 8]


---

## 🧠 Logic Breakdown

### 1. **Prime Factorization**
The number is first broken into its prime factors using a loop from `2` to `sqrt(n)`. All factors are stored in a list.

```java
while(n % i == 0) {
    a.add(i);
    n /= i;
}
For n = 32, the prime factor list is:

[2, 2, 2, 2, 2]

2. Generate Grouped Combinations
Using the prime factors, the program generates combinations by:

Keeping part of the factors separate.

Multiplying the remaining ones to form a new product.

This is done to explore various ways the prime factors can be grouped together.

```java

while(j < dupli.size()) {
    multi *= dupli.get(j);
    j++;
}
adder.add(multi);
```

3. Reverse or Merge Factor Parts
To increase variety, the code reverses and merges parts of previous combinations, generating new valid sets.

```java

adder.add(res.get(i).get(var) * res.get(i).get(var - 1));
```

4. Remove Duplicates
To avoid repeated combinations or permutations (e.g., [2, 4] and [4, 2]), a Set is used. Sorting before insertion ensures that only unique combinations remain.

```java

Collections.sort(inner);
set.add(new ArrayList<>(inner));
```

🧪 Sample Output
For n = 32, the output is:


[2, 16]
[2, 2, 8]
[2, 2, 2, 4]
[2, 2, 2, 2, 2]
[4, 8]
