# 🔁 Reverse Character Order in a Sentence (Preserving Word Lengths)

This Java program reverses **all characters** in a sentence while **preserving the original word lengths** and **spacing pattern**.

---

## 📌 Problem Statement

Given a sentence:
- Remove all spaces and reverse the characters.
- Then, reconstruct the sentence such that:
  - Each word has the **same length** as in the original sentence.
  - Characters from the reversed string are used **in order**, preserving **space positions**.

---

## 🧠 Example Walkthrough

### ✅ Test Case:
**Input:**
Hi Nitte


**Steps:**
1. Remove spaces: `"HiNitte"`
2. Reverse: `"ettiNiH"`
3. Original word lengths: `2` and `5`
4. Distribute reversed characters:
   - First word (length 2): `"et"`
   - Second word (length 5): `"tiNiH"`

**Output:**
et tiNiH


---

## 🚀 Program Logic

1. **Split** the input string by whitespace into an array of words.
2. **Concatenate** all words into a single string (removing spaces).
3. **Reverse** this string.
4. **Rebuild** the sentence:
   - Take characters from the reversed string.
   - Assign them back to words of the **original lengths**.
   - Maintain original word spacing.

---

## 🧪 Sample Input & Output

### Input
Hi Nitte




### Output
et tiNiH



---

## 💻 Code Explanation

```java
String s = "Hi Nitte";
StringBuilder sb = new StringBuilder();
String[] res = s.split("[\\s]");

// Concatenate all characters (remove spaces)
for(String ss: res) {
    sb.append(ss);
}

// Reverse all characters
sb.reverse();

// Distribute reversed characters into original word lengths
int k = 0;
for(String ss: res) {
    System.out.print(sb.substring(k, k + ss.length()) + " ");
    k += ss.length();
}
```