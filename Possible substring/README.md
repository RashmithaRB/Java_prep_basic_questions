🔡 Unique Substrings Generator in Java
This Java program calculates and prints all unique substrings of a given input string using nested loops and a HashSet.

📁 Package Structure

placement/
└── Possible_substring.java

✅ What This Program Does
Takes a string (e.g., "aabaac").

Finds all possible substrings using two nested loops.

Stores them in a HashSet to automatically eliminate duplicates.

Prints the unique substrings.

💡 Sample Input & Output
Input:

String s = "aabaac";

Output (order may vary due to HashSet nature):
```
a aa aab aaba aabaa aabaac ab aba abaa abaac b ba baa baac c ac
```
These are all the distinct substrings that can be formed from "aabaac".

🧠 How It Works
Code Walkthrough:
```
for(int i = 0; i < s.length(); i++) {
    for(int j = i + 1; j <= s.length(); j++) {
        String res = s.substring(i, j);
        hs.add(res); // HashSet ensures uniqueness
    }
}
```
The outer loop selects the starting index.

The inner loop selects the ending index.

s.substring(i, j) generates each possible substring.

HashSet<String> ensures no duplicate substrings are added.

All values in the HashSet are printed.