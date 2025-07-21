package placement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="silentrh";
		String s2="listenhr";
		
		if(s1.length()!=s2.length()) {
			System.out.println("NO it is not anagram");
			return;
		}
		
		//sorting method
//		char ch1[]=s1.toCharArray();
//		char ch2[]=s2.toCharArray();
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		int i=0;
//		for(char ch:ch1) {
//			if(ch!=ch2[i]) {
//				System.out.println("NO it is not anagram");
//				return;
//			}
//			i++;
//		}
		
//		System.out.println("Yes it is anagram");
		
		
		//hashmap method
		HashMap<Character,Integer> hp1=new HashMap<>();
		

		for(char ch: s1.toCharArray()) {
			hp1.put(ch, hp1.getOrDefault(ch, 0)+1);
		}
		for(char ch:s2.toCharArray()) {
			hp1.put(ch, hp1.getOrDefault(ch, 0)-1);
		}
		for(Entry<Character,Integer> entry:hp1.entrySet()) {
			if(entry.getValue()!=0) {
				System.out.println("NOt an anagram");
				return;
			}
		}
			System.out.println("Yes it is anagram");
		
		

	}

}
