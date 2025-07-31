package placement;

public class character_reordering_in_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test case1:
		//i/p: Hi Nitte o/p: Ni tteHi
		//test case2:
		//i/p: Hello Friends o/p: Frien dsHello
		//test case3:
		//i/p: I am Bad o/p: B ad amI
		
		String s="I am Bad";
		String[] res=s.split("[\\s]");
		StringBuilder sb=new StringBuilder();
		
		
		for(int i=res.length-1;i>=0;i--) {
			sb.append(res[i]);
		}
		
		int k=0;
		for(String ss:res) {
			
			System.out.print(sb.substring(k,k+ss.length())+" ");
			
			k+=ss.length();
			
		}
		
		
	}

}
