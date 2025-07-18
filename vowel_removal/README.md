# Vowel Remover – Java

This Java program removes all vowels (`a`, `e`, `i`, `o`, `u`) from a given input string and prints the result. It performs a **case-insensitive vowel removal** using regular expressions.

## 🔍 Example

### Input:
```java
 I am in nitte college
```
OUTPUT 

 m n ntt cllg

🧠 Description
Key Features:
Converts the original string to lowercase using:

java
Copy
Edit
s1.toLowerCase();
Uses the regex pattern [aeiou] with replaceAll() to eliminate vowels:

java
Copy
Edit
s1.replaceAll("[aeiou]", "")
Regex Explanation:
[aeiou]: matches any lowercase vowel

replaceAll(..., ""): replaces each matched vowel with an empty string