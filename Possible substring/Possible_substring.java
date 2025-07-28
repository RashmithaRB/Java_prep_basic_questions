package placement;

import java.util.ArrayList;
import java.util.HashSet;

public class Possible_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabaac";
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				ArrayList<String> al=new ArrayList<>();
				String res=s.substring(i,j);
				hs.add(res);
			}
			
		}
		for(String s1:hs) {
			System.out.print(s1+" ");
		}
	}

}
