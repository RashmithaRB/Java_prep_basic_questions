package placement;

import java.util.Scanner;

public class loop {
	public static int ways(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		return (ways(n-1)+ways(n-2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of ways");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(ways(num));
	}

}
