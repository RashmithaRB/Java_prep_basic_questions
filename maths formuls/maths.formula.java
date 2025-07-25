package placement;

import java.util.HashMap;
import java.util.Map.Entry;

public class maths_formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abbccccc";
		String s2="aaabcccdz";
		String result="";
		HashMap<Character,Integer> hp=new HashMap<>();
		for(char ch: s2.toCharArray()) {
			hp.put(ch, hp.getOrDefault(ch, 0)+1);
		}
		for(Entry<Character,Integer> entry:hp.entrySet()) {
			String var=(entry.getKey()).toString();
			String num=(entry.getValue().toString());
			
			result=result+var;
			if(!num.equals("1")) {
				result+=num;
			}
		}
		
		System.out.println(result);
	}

}
