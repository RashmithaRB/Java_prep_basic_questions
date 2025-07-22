package placement;

import java.util.Arrays;

public class chocolate_distribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,2,5,1};
		int sum=0;
		int[] res=new int[a.length];
		res[0]=1;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1]) {
				res[i]=res[i-1]+1;
			}
			else {
				res[i]=1;
			}
		}
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]>a[i+1]) {
				res[i]=Math.max(res[i],res[i+1]+1 );
			}
		}
		for(int num:res) {
			sum+=num;
		}
		System.out.println(sum);
	}

}
