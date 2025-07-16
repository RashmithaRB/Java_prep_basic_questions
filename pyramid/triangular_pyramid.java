package placement;

public class triangular_pyramid {

	public static void main(String[] args) {
		int n=5,space=20;
		//space is the variable just to make the pattern appear in middle
		// TODO Auto-generated method stub
        //print the following pattern in middle of screen
//		                           *
//		                         * * *
//		                       * * * * *
//		                     * * * * * * *
		//upper pyramid in middle of screen
		for(int i=0;i<n;i++) {
			for(int k=0;k<space-i-1;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
