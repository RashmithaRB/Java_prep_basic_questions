# 🔠 Word with Most Repeating Characters - Java Program

This Java program finds the word(s) in a sentence that have the **most repeating characters** and prints them.

---

## 📌 Problem Statement

Given a string containing multiple words, find the word(s) that have the **highest number of repeating characters**. If multiple words tie for the maximum repeat count, all such words should be printed.

If no characters repeat in any word, return **-1**.

---

## 🧠 Logic & Approach

1. **Split** the sentence into individual words using whitespace.
2. For each word:
   - Count the frequency of each character using a **HashMap**.
   - Sum all character counts that are greater than 1 (i.e., repeating characters).
3. Keep track of the **maximum repeat sum** found.
4. Collect words that match this maximum repeat sum.
5. Print them, or `-1` if none are found.

---

## 📦 Example

### Input:
```java
String s = "google google Microsoft are big companies";
```
Output:

Final result: google

Explanation:
"google" has 3 repeating characters: 2 g's and 2 o's → Total = 4

"Microsoft", "are", "big", and "companies" have fewer or no repeats.

## Input String	                    Output
"aabb ccdd xyz"	                    ccdd aabb
"Cameron Blue"	                    -1
"hello there general kenobi"	    general
"aaa bbb ccc aaa"	                aaa bbb ccc