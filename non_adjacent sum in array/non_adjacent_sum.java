package placement;

public class non_adjacent_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,5,7,8,6,7};
		int sum1=0;
		int sum2=0;
		
			System.out.println("odd loop");
			for(int i=0,j=1;i<a.length && j<a.length-1;i+=2,j+=2) {
				
				sum1+=a[i];
				
				sum2+=a[j];
				
			}
			if(a.length%2!=0) {
				sum1=sum1+a[a.length-1];
			}
		
		System.out.println(Math.max(sum1, sum2));

	}

}
