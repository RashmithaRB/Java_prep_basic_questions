package placement;

public class longest_continuos_substring {
 public static void main(String[] args) {
	 // task is to print the longest continous sequence of characters string in a given string
	 String s="defpwsyijklpq";
	 //String s="xpqrtws";
	 String final_res="";
	 
	 int i=1,len=0,j=0;
	 while(i<s.length()) {
		j=i-1;
		 while( i<s.length() && (int)(s.charAt(i-1)+1)==(int)s.charAt(i) ) {
			 i++;
		 }
		 
		 String res=s.substring(j,i);
		 if(res.length()>len) {
			 len=res.length();
			 final_res=res;
			 
		 }
		 i++;
		 
		 
	 }
	 System.out.println(final_res);
}
}
