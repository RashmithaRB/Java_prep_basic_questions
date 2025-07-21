# 🔁 Palindrome Checker in Java

This Java program checks whether a given string is a **palindrome**, meaning it reads the same forwards and backwards. It ignores spaces, punctuation, and capitalization.

---

## 🧠 What Is a Palindrome?

A **palindrome** is a word, phrase, or sequence that reads the same backward as forward after ignoring non-alphabetic characters and letter casing.

### Examples:
- ✅ `"A man, a plan, a canal: Panama"` → Palindrome  
- ❌ `"Hello, World!"` → Not a palindrome  

---

## 🧪 Example in This Code

### Input:
```java
String s = "I am in Panama: canalan,ac amanap nImai";

After cleaning

# 🔁 Palindrome Checker in Java

This Java program checks whether a given string is a **palindrome**, meaning it reads the same forwards and backwards. It ignores spaces, punctuation, and capitalization.

---

## 🧠 What Is a Palindrome?

A **palindrome** is a word, phrase, or sequence that reads the same backward as forward after ignoring non-alphabetic characters and letter casing.

### Examples:
- ✅ `"A man, a plan, a canal: Panama"` → Palindrome  
- ❌ `"Hello, World!"` → Not a palindrome  

---

## 🧪 Example in This Code

### Input:
```java
String s = "I am in Panama: canalan,ac amanap nImai";
```
Output: yes it is the pallindrome

## 💡 Logic Explanation

### 🔹 Step 1: Clean the Input String

To ensure accurate comparison, remove the following from the input:
- **Whitespaces** (spaces, tabs, etc.)
- **Punctuation characters** such as `:`, `@`, `,`, `-`
- **Convert the entire string to lowercase**

```java
s = s.replaceAll("[\\s@:,-]", "").toLowerCase().trim();
```


🔹 Step 2: Reverse the Cleaned String:
Create a reversed version of the cleaned string using StringBuilder:

tep 3: Compare Original vs Reversed:
Check if the cleaned string matches its reversed version: