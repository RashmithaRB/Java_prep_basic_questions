package placement;
import java.util.*;
public class print_patterns {
//print the series which is of the form 12233444555566666777777..
  //if the given no is 4 output would be --> 1122
  // "---------------" 9 output would be -->122334445
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of series to print");

			Scanner sc=new Scanner(System.in);
		int given_cnt=sc.nextInt();
		if(given_cnt==1) {
			System.out.println(1);
			return;
		}
		if(given_cnt==2) {
			System.out.println(1+" "+2);
			return;
		}
		else {
			System.out.print(1+" "+2+" ");
			int cnt=2;
			for(int i=2;i<10;i++) {
				int j=0;
				while(j<i-1 && cnt<given_cnt) {
					System.out.print(i+" ");
					cnt++;
					j++;
				}
				if(cnt>=given_cnt) {
					return;
				}
			}
		}
	}

}
