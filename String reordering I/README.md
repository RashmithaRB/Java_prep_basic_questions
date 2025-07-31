# 🔁 Character Reordering in a Sentence – Java Program

This Java program rearranges characters in a sentence such that each word retains the **length and spacing of the original**, but the **characters come from the sentence reversed word by word**.

---

## 📌 Problem Statement

Given a sentence, reorder characters in such a way that:
- Words retain their original lengths and positions.
- Characters are taken **in reverse order of the words**.

---

## 🧠 Understanding Through Examples

### ✅ Test Case 1:
**Input:**  
Hi Nitte

**Step-by-step:**
- Words: `["Hi", "Nitte"]`
- Reverse words: `["Nitte", "Hi"]`
- Concatenate: `"NitteHi"`
- Reassign characters maintaining original word lengths:
  - First word: length 2 → "Ni"
  - Second word: length 5 → "tteHi"
- **Output:**
Ni tteHi


---

### ✅ Test Case 2:
**Input:**  
Hello Friends


**Output:**  
Frien dsHello



---

### ✅ Test Case 3:
**Input:**  
I am Bad

**Output:**
B ad amI


---

## 🧠 How It Works – Logic Explained

1. **Split the sentence** into words using `split("\\s")`.

2. **Reverse the word array**, and concatenate all reversed words into a single string (`sb`).

3. **Reassign characters** back to each word in original order by:
   - Tracking the length of each word.
   - Taking corresponding number of characters from the reversed string.

---

## 🧪 Sample Input & Output

```java
Input:  I am Bad
Output: B ad amI

Input:  Hello Friends
Output: Frien dsHello
