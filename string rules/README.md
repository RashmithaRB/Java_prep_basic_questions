🔠 String Rule Validator using Regular Expressions (Regex)
This Java program validates whether a given string follows a specific set of rules using regular expressions.

📜 Rules Defined
The string must follow these strict formatting rules:

The first character must be 'a'.

'a' can be followed by:

another 'a'

a 'bb'

or nothing

Every 'bb' must be followed by an 'a'.

📁 Package Structure

placement/
└── String_rules.java

✅ Sample Valid Strings
"a"

"aa"

"abb"

"abba"

"aabba"

❌ Sample Invalid Strings
"bba" (doesn't start with a)

"abbb" (bb not followed by a)

"abbabb" (last bb is not followed by a)

"aab" (b alone is invalid)

💡 Working of code
The program uses a regular expression to match the string pattern:

```java

String regex = "^a(a|bb)*$";

```
Breakdown of Regex:
^ → Start of string

a → Must start with 'a'

(a|bb)* → Followed by 0 or more occurrences of either 'a' or 'bb'

$ → End of string

This ensures all rules are enforced, especially the 'bb' being followed only by 'a' indirectly by the regex grouping.



🧠 Regex Brackets Quick Reference
Bracket Type	Usage
[] (Square)	Character set: [abc] matches 'a' or 'b' or 'c'
() (Parentheses)	Grouping or alternation: `(a)
{} (Curly)	Quantifiers: a{2} matches exactly two 'a's
^ and $	Anchors: ^a...z$ ensures string starts with 'a' and ends with 'z'

🧪 Sample Run
```java

String s = "aabba";
```

Output:



👤 Author
Rashmitha R Bangera