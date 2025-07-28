🔍 Extract Substring Starting from Special Character in Java
This Java program finds the first occurrence of a special character in a string and prints the substring from that character to the end of the string.

📁 Package Structure

placement/
└── Print_string_from_occurance_of_special_character.java
✅ Note: You might want to rename the class to PrintStringFromOccurrenceOfSpecialCharacter to follow standard Java naming conventions.

📝 Program Objective
Given a string, this program:

Uses a regular expression to identify non-alphanumeric characters.

Finds the position where the first special character appears.

Prints the substring starting from that character to the end of the string.

💡 Sample Input & Output
Input:

String s = "Nittec@fe";

Output:

@fe

If multiple special characters exist, it prints each matching substring (from their positions to the end).

🔍 How It Works
Regex Pattern Used:

String regex = "\\W"; // Equivalent to: "[^a-zA-Z0-9]"

\W matches any character that is not a word character (i.e., not a-z, A-Z, 0-9, or underscore _).

Matcher Logic:

Matcher m = p.matcher(s);

while (m.find()) {
    System.out.println(s.substring(m.start()));
}

m.find() locates each special character in the string.

s.substring(m.start()) prints the substring from that special character to the end of the string.

✅ Additional Example
Input:

String s = "abc#def@123";

Output:

#def@123  

🧠 Concepts Used

Regular expressions with Pattern and Matcher

String manipulation using substring()

Looping over matched patterns

📈 Time & Space Complexity

Time Complexity: O(n), where n is the length of the string

Space Complexity: O(1) (excluding output)