package placement;

public class split_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,5,10};
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		int res=sum/2;
		int s=0,j=0;
		for(int i=0;i<arr.length;i++) {
			if(s==res) {
				j=i;
				break;
			}
			else {
				s+=arr[i];
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		while(j<arr.length) {
			System.out.print(arr[j]+" ");
			j++;
		}

	}

}
