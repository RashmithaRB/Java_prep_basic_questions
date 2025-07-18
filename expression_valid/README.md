# 🔍 Expression Validation Using Stack in Java

This Java program checks whether a given expression has **balanced parentheses** using a `Stack`. It supports validation for three types of brackets: `()`, `{}`, and `[]`.

---

## 📋 Problem Statement

Given a mathematical expression as a string, determine if the brackets in the expression are **valid** — meaning:

- Every opening bracket has a corresponding closing bracket.
- The brackets are correctly nested.

---

## ✅ Examples

[{(a+b)-(cd)-((e-f)(g+h))] → false
[(a+b}) → false


---

## 🧠 Logic & Approach

1. Traverse the expression character by character.
2. Push every opening bracket (`(`, `{`, `[`) onto a stack.
3. On encountering a closing bracket:
   - Check if the stack is not empty.
   - Pop the top element and ensure it matches the corresponding opening bracket.
4. If at any point brackets mismatch or stack operations fail, the expression is invalid.
5. Final validity is determined by whether all brackets were matched correctly.

---

## 🛠️ How to Run

### 💻 Prerequisites
- Java Development Kit (JDK)
- Any Java IDE or command line

### ⚙️ Compile & Run

```bash
javac expression_validation.java
java placement.expression_validation
```