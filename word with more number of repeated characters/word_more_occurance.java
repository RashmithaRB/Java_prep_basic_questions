package placement;

import java.util.HashMap;

public class word_more_occurance {
	int max;
	static int maxOccur(String st) {
		HashMap<Character,Integer>hp=new HashMap<>();
		for(char ch:st.toCharArray()) {
			hp.put(ch, hp.getOrDefault(ch,0)+1);
		}
		int cnt=0;
		for(int val:hp.values()) {
			if(val>1) {
				cnt+=val;
			}
		}
		return cnt;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		String connect="";
		StringBuilder final_result=new StringBuilder();
		String t="Cameron Blue";
		String q="aabb ccdd xyz";
		String s="google google Microsoft are big companies";
		String[] res=s.split("[\\s]");
		for(String st:res) {
			int n= maxOccur(st);
			if(n>max) {
				max=n;
				
				connect=st;
				
			}
			else if(n==max) {
				final_result.append(" " +st+" ");
			}
			
		}
		final_result.append(connect);
		if(final_result.isEmpty()) {
			System.out.println("Final result: -1");
			return;
		}
		if(max==0) {
			System.out.println("Final result: -1");
			return;
		}
		System.out.println("Final result: "+final_result.toString());
				
	}

}
