package placement;
import java.util.*;
public class prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range:");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int cnt=0;
		int n=(int)Math.sqrt(range);
		int[] res=new int[range];
		Arrays.fill(res,1);
		res[0]=0;
		res[1]=0;
		for(int i=2;i<=n;i++) {
			if(res[i]==0) {
				continue;
			}
			
			
			else {
				for(int j=2;j<range;j++) {
					if(j>i) {
						if(j%i==0) {
							res[j]=0;
						}
					}
					
				}
			}
		}
	
		for(int i=0;i<res.length;i++) {
			if(res[i]!=0) {
				System.out.println(i);
				cnt++;
			}
		}
		System.out.println("count:"+cnt);
		
		

	}

}
