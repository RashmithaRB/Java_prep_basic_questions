package placement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_rules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rules
		// starting character should be 'a'
		// 'a' can be followed by  an 'a' or 'bb' or nothing
		// 'bb' should be followed by an 'a'
		String s="aabba";
		if(s.charAt(0)!='a') {
			System.out.println("NO");
			return;
		}
		String regex="^a(a|bb)*$";
		/**
		 * ============================
		 * REGEX BRACKETS QUICK REFERENCE
		 * ============================
		 *
		 * 1. Square Brackets: []
		 * --------------------------
		 * Purpose:
		 *   - Defines a Character Class.
		 *   - Matches exactly one character from the set.
		 *
		 * Usage:
		 *   [abc]       → Matches 'a' or 'b' or 'c'
		 *   [a-z]       → Matches any lowercase letter from 'a' to 'z'
		 *   [^abc]      → Matches any character except 'a', 'b', or 'c'
		 *
		 * Example:
		 *   Pattern.matches("[aeiou]", "e")     → true
		 *   Pattern.matches("[^aeiou]", "b")    → true
		 *
		 *
		 * 2. Parentheses: ()
		 * --------------------------
		 * Purpose:
		 *   - Groups expressions.
		 *   - Supports alternation (OR) using `|`.
		 *   - Captures matched groups (used with Matcher).
		 *
		 * Usage:
		 *   (abc)       → Matches the exact sequence "abc"
		 *   (a|b|c)     → Matches either 'a', 'b', or 'c'
		 *   (ab)+       → Matches one or more occurrences of "ab"
		 *
		 * Example:
		 *   Pattern.matches("a(bc)*", "abcbc")  → true
		 *   Pattern.matches("(a|bb)*", "abb")   → true
		 *
		 *
		 * 3. Curly Braces: {}
		 * --------------------------
		 * Purpose:
		 *   - Specifies the number of repetitions (quantifiers).
		 *
		 * Usage:
		 *   a{2}        → Matches exactly two 'a's (i.e., "aa")
		 *   a{2,4}      → Matches between 2 and 4 'a's (i.e., "aa", "aaa", "aaaa")
		 *   a{2,}       → Matches 2 or more 'a's
		 *
		 * Example:
		 *   Pattern.matches("a{3}", "aaa")      → true
		 *   Pattern.matches("a{2,4}", "aaaa")   → true
		 *
		 *
		 * ============================
		 * Notes:
		 * - Use ^ (caret) at the beginning of a pattern to anchor it to the start.
		 * - Use $ at the end to anchor it to the end of the string.
		 * - Escaping (e.g., \\d, \\w, \\. etc.) works the same across all brackets.
		 *
		 * References:
		 * - java.util.regex.Pattern
		 * - java.util.regex.Matcher
		 */

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		if(m.matches()) {
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}

}
