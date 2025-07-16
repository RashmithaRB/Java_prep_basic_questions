package placement;

public class inverted_left_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Pattern to be printed in middle of screen
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*

		for(int i=0;i<5;i++) {
			int space=0;
			while(space<20) {
				System.out.print(" ");
				space++;
			}
			for(int j=i;j<5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
