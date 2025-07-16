package placement;

public class four_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //print the following pattern in middle of screen
//		                  2
//		                1   3
//		                  4
//		                             for n=3
		int n=3;
		int var=2;
		for(int i=0;i<n;i++) {
			int a=0;
			while(a<20) {
				System.out.print(" ");
				a++;
			}
			if(i%2==0) {
				System.out.println(" "+var);
			}
			else {
				System.out.println((var-1)+" "+(var+1));
				var+=2;
			}
		}
	}
}


