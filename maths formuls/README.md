📐 Maths Formula String Compressor
This Java program compresses a given string by counting the frequency of each character and representing it in a compact form (similar to basic run-length encoding). For example, the string aaabcccdz becomes a3b1c3d1z1, and then simplifies it to a3bc3dz (i.e., omits count 1).

📁 Package Structure

placement/
└── maths_formula.java
🚀 How It Works
The main logic is:

Convert the input string into a character array.

Use a HashMap<Character, Integer> to store the frequency of each character.

Iterate over the map entries:

Append each character to a result string.

If the frequency is more than 1, also append the frequency.

Print the final result.

📦 Sample Input & Output
Input String:

```java

String s2 = "aaabcccdz";
```
Output:

```nginx

a3bc3dz
```
🔧 Technologies Used
Java 8+

HashMap from Java Collections Framework

🧠 Concepts Used
HashMap for frequency counting

Character iteration

String manipulation

Enhanced for-loops (for-each)

📝 Notes
This implementation only processes s2. The variable s is declared but unused.

If you'd like to apply this to multiple strings, consider wrapping the logic in a method.

📈 Possible Enhancements
Accept input from the user instead of hardcoding strings.

Sort characters alphabetically before displaying the compressed result.

Compress only alphabet characters (skip digits or symbols if needed).

Use StringBuilder instead of String for better performance.

👤 Author
Rashmitha R Bangera