package placement;

import java.util.Arrays;

public class triplets_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,1,0,7,8,5,6,3,9};
		
		Arrays.sort(a);
		int target_sum=13;
		int k=a.length-1;
		int i=0;
		while( i<k-1) {
			int j=i+1;
			while(a[i]+a[j]+a[k]>target_sum) {
				k--;
			}
			if(a[i]+a[j]+a[k]==target_sum) {
				System.out.println("Triplets exists for:"+"i="+i+"j="+j+"k="+k);
				return;
			}
			i++;
			
			
		}
		System.out.println("NO triplets exist");
	}

}
