package placement;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am in Panama: canalan,ac amanap nImai";
		
		s=(s.replaceAll("[\\s@:,-]","")).toLowerCase().trim();
		StringBuilder sb=new StringBuilder(s);
	
		if(s.equals(sb.reverse().toString())) {
			System.out.println("yes it is the pallindrome");
		}
		else {
			System.out.println("NO it is not the pallindrome");
		}
		
		
//		System.out.println("Output string: "+s);
//		int l=0,r=s.length()-1;
//		while(l<r) {
//			if(s.charAt(l)!=s.charAt(r)) {
//				System.out.println("No it is not the pallindrome string");
//				return;
//			}
//			else {
//				l++;
//				r--;
//			}
//		}
//		System.out.println("Yes ,it is the pallindrome");
	}

}
