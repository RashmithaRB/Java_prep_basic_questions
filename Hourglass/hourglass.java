package placement;

public class hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print the pattern of hour glass in somewhat middle of screen
		                           
		
//		
//		                     * * * * * * *
//		                       * * * * *
//		                         * * *
//		                           *
//		                         * * *
//		                       * * * * *
//		                     * * * * * * *
		
		int n=4;
		//inverted pyramid logic
		for(int i=n-1;i>=0;i--) {
			int space=0;
			while(space<20) {
				System.out.print(" ");
				space++;
			}
			//space logic
			for(int j=n-1;j>i;j--) {
				System.out.print("  ");
			}
			//star logic
			for(int j=2*i+1;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//upper pyramid logic with eliminated 1st row to match the pattern
		for(int i=1;i<n;i++) {
			int space=0;
			while(space<20) {
				System.out.print(" ");
				space++;
			}
			//space logic
			for(int j=i;j<n-1;j++) {
				System.out.print("  ");
			}
			//star logic
			for(int j=0;j<2*i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
