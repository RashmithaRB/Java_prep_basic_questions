🔠 Longest Continuous Character Substring in Java
This Java program finds and prints the longest continuous sequence of consecutive characters (in increasing ASCII order) in a given string.

📁 Package Structure

placement/
└── longest_continuous_substring.java

✅ What This Program Does
Given a string, the program:

Finds the longest substring where each character is exactly 1 greater than the previous character in terms of ASCII value.

Prints that longest continuous substring.

💡 Sample Input & Output
Input:

String s = "defpwsyijklpq";

Output:

ijkl

String s = "xpqrtws";

Output:

pqr
🔍 How It Works
Key Logic:

while (i < s.length() && (int)(s.charAt(i - 1) + 1) == (int)s.charAt(i)) {
    i++;
}

Checks whether each character is exactly one ASCII value higher than the previous.

Stores the substring using s.substring(j, i).

Tracks and updates the longest one found so far.

### 📈 Time and Space Complexity
Time Complexity: O(n) — each character is checked once.

Space Complexity: O(1) — only constant space is used (apart from the result string).