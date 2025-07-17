package placement;

import java.util.Arrays;
import java.util.Scanner;

public class spiral_traversal {
	
	public static void main(String[] args) {
	int nums[][]= {{18,17,16},{5,4,3},{6,7,8}};
		
		
		
		int left=0,right=nums[0].length-1;
		int top=0,bottom=nums.length-1;
		while(left<=right && top<=bottom) {
			for(int i=left;i<=right;i++) {
				System.out.print(nums[top][i]+" ");
				
			}
			
			top++;
			
			
			for(int i=top;i<=bottom;i++) {
				System.out.print(nums[i][right]+" ");
				
			}
			
			right--;
			
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(nums[bottom][i]+" ");
					
				}
				
				bottom--;
			}
			
			if(left<=right) {
				for(int i=bottom;i>=top;i--){
					System.out.print(nums[i][left]+" ");
					
				}
				left++;
			}
			
		}

		}
	
}
