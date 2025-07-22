# 🍫 Chocolate Distribution Problem - Java Implementation- Leetcode 135(candy)

This Java program solves the classic **Chocolate Distribution** (or **Candy Distribution**) problem where each student must get at least one chocolate, and students with higher scores than their neighbors must receive more chocolates than them.

---

## 📌 Problem Statement

You are given an array of integers representing student ratings or scores. Distribute chocolates such that:

1. Every student gets at least **one chocolate**.
2. A student with a **higher rating** than an adjacent student must get **more chocolates** than them.

Return the **minimum total chocolates** that must be distributed.

---

## 🧠 Logic & Approach

This is a **Greedy Algorithm** based solution using two passes:

### 🔹 Step 1: Left to Right Pass

- If a student has a higher rating than the previous one, they get one more chocolate than the previous.

```java
for (int i = 1; i < a.length; i++) {
    if (a[i] > a[i - 1]) {
        res[i] = res[i - 1] + 1;
    } else {
        res[i] = 1;
    }
}
```
🔹 Step 2: Right to Left Pass
Ensure that students with a higher rating than the next student also have more chocolates:

Take the maximum of current chocolates vs what they’d get from this condition.
```bash
for (int i = a.length - 2; i >= 0; i--) {
    if (a[i] > a[i + 1]) {
        res[i] = Math.max(res[i], res[i + 1] + 1);
    }
}
```
🔹 Step 3: Sum Up Chocolates
Add all values in the res[] array to get the total chocolates needed.
