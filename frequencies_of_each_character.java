package placement;
import java.util.*;
import java.util.Map.Entry;
public class frequencies_of_each_character {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the city name to count the numbers of unique characters");
		Scanner sc=new Scanner(System.in);
		
		String city=sc.next();	
		//optimal
//		HashMap<Character,Integer> hp=new HashMap<>();
//		for(char ch:city.toCharArray()) {
//			hp.put(ch,hp.getOrDefault(ch, 0)+1);
//		}
//		for(Entry<Character,Integer> entry:hp.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		
		//using arrays
		int [] arr=new int[26];

		for(int i=0;i<city.length();i++) {
			arr[city.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]!=0) {
				System.out.println(((char)(i+'a'))+":"+arr[i]);
			}
		}
		
		

	}

}
