package placement;

public class string_reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi Nitte";
		StringBuilder sb=new StringBuilder();
		String[] res=s.split("[\\s]");
		for(String ss: res) {
			sb.append(ss);
		}
		sb.reverse();
		int k=0;
		for(String ss: res) {
			System.out.print(sb.substring(k,k+ss.length())+" ");
			k+=ss.length();
		}
	}

}
