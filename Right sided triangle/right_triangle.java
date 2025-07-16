package placement;

public class right_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pattern to be printed as follows in middle of screen
//		      *
//		    * *
//		  * * *
//		* * * *
//	  * * * * *

		int n=5;
		for(int i=0;i<n;i++) {
			int space=0;
			while(space<20) {
				System.out.print(" ");
				space++;
			}
			for(int j=i;j<n-1;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
