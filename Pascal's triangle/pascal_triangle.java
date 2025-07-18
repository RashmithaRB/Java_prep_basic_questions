package placement;

import java.util.*;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print pascal's triangle in somewhere middle of screen
		int n=7;
		ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<15-i-1;j++) {
				System.out.print("  ");
			}
			if(i==0) {
				
				ArrayList<Integer> res= new ArrayList<>();
				res.add(1);
				System.out.println(1+" ");
				arr.add(res);
				continue;
			}
			ArrayList<Integer> res=new ArrayList<>();
			for(int j=0;j<=i;j++) {
				
				
				if(j==0 || j==i) {
					res.add(1);
					System.out.print(1+"   ");
				}
				else {
					int num=arr.get(i-1).get(j-1)+arr.get(i-1).get(j);
					res.add(num);
					System.out.print(num+"   ");
				}
			}
			arr.add(res);
			System.out.println();
		}

	}

}
