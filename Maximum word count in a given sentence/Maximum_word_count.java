package placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Maximun_word_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print the first 2 maximum occured words along with the count
		String sen="I am in Banglore. I am in Nitte. Nitte college is a very good college.Nitte is nice place.Nitte is near to Manglore.";
		sen=sen.replace(".", " ");
		
		
		String[] s_arr=sen.split("[\\s]");
		
		HashMap<String,Integer>hp=new HashMap<>();
		for(String s:s_arr) {
			hp.put(s,hp.getOrDefault(s, 0)+1);
		}
		int large=0,sec_large= -1;
		String large_string="",sec_large_string="";
		for(Entry<String,Integer> entry:hp.entrySet()) {
			
			
			if(large<entry.getValue()) {
				sec_large=large;
				sec_large_string=large_string;
				large=entry.getValue();
				large_string=entry.getKey();
				
				
			}
			else if(entry.getValue()<large && entry.getValue()>sec_large) {
				sec_large=entry.getValue();
				sec_large_string=entry.getKey();
				
			}
			
		}
		System.out.println(large_string+" count "+large);
		System.out.println(sec_large_string+" count "+sec_large);
		
	}

}
