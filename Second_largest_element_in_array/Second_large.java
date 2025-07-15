package placement;

public class Second_large {
	public static int second(int[] arr) {
		int largest=arr[0];
		int second_largest= -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>second_largest) {
				second_largest=arr[i];
			}
		}
		return second_largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {48,6,23,706,88,13,65,91,100};
		System.out.println(second(arr));

	}

}
