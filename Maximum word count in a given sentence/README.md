🧠 Maximum Word Count in a Sentence (Top 2 Words)
This Java program analyzes a given sentence and prints the top two most frequently occurring words along with their respective counts.

📁 Package Structure

placement/
└── Maximun_word_count.java
✅ Note: There's a typo in the class name — it should be Maximum_word_count.java. Consider renaming for clarity.

📝 Program Objective
Given a sentence, the program performs the following tasks:

Removes punctuation (specifically periods).

Splits the sentence into words.

Counts the frequency of each word using a HashMap.

Identifies the first and second most frequent words.

Prints the top 2 words along with their frequency.

💡 Sample Input & Output
Input:

String sen = "I am in Banglore. I am in Nitte. Nitte college is a very good college. Nitte is nice place. Nitte is near to Manglore.";

Output:

Nitte count 4  
is count 3
🔍 How It Works
Step-by-Step Logic:
Remove periods:


sen = sen.replace(".", " ");
Split sentence by space:


String[] s_arr = sen.split("[\\s]");
Count frequency:


HashMap<String, Integer> hp = new HashMap<>();
for (String s : s_arr) {
    hp.put(s, hp.getOrDefault(s, 0) + 1);
}
Find first and second max:


if (entry.getValue() > large) {
    sec_large = large;
    sec_large_string = large_string;
    large = entry.getValue();
    large_string = entry.getKey();
} else if (entry.getValue() < large && entry.getValue() > sec_large) {
    sec_large = entry.getValue();
    sec_large_string = entry.getKey();
}
🧠 Concepts Used
HashMap for counting word frequency.

String manipulation (replace, split).

Iteration over map entries.

Simple max value comparison.

📈 Time & Space Complexity
Time Complexity: O(n), where n is the number of words.

Space Complexity: O(k), where k is the number of unique words.