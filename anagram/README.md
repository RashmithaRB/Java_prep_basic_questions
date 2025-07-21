# 🔁 Anagram Checker in Java

This Java program checks whether two given strings are **anagrams** of each other using two different approaches:
- **Sorting-based method**
- **HashMap frequency-count method**

---

## 📋 Problem Statement

Two strings are said to be anagrams if:
- They contain **exactly the same characters**, and
- The characters appear the **same number of times**, regardless of order.

---

## 🧪 Examples

### ✅ Anagram
Input: s1 = "listen", s2 = "silent"
Output: Yes, it is an anagram.

Input: s1 = "hello", s2 = "world"
Output: No, it is not an anagram.


---

## 🧠 Approach 1: Sorting Method (Commented in Code)

1. Convert both strings to character arrays.
2. Sort both arrays.
3. Compare the arrays character by character.
4. If all characters match in order, they are anagrams.

```java
char[] ch1 = s1.toCharArray();
char[] ch2 = s2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
return Arrays.equals(ch1, ch2);
```