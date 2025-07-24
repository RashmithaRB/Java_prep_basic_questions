package placement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class factor_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=32;
		int n=32;
		String s="";
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		ArrayList a=new ArrayList();
		int sq=(int)Math.sqrt(n);
		
		for(int i=2;i<=sq+1;i++) {
			
			while(n%i==0 ) {
				s=s+i+" ";
				
				a.add(i);
				n=n/i;
			}
		}
		res.add(a);

		ArrayList<Integer> dupli= (ArrayList)a.clone();
		for(int i=a.size()-2;i>0;i--) {
			int j=0;
			ArrayList<Integer> adder=new ArrayList();
			while(j<i) {
				adder.add(dupli.get(j));
				j++;
			}
			if(j==i) {
				int multi=1;
				while(j<dupli.size()) {
					multi*=(int)dupli.get(j);
					j++;
				}
				adder.add(multi);
				
			}
			
			res.add(adder);
		}
		int original_size=res.size();
		for(int i=0;i<original_size;i++) {
			ArrayList<Integer> adder=new ArrayList();
			int var=res.get(i).size()-1;
			int k=1;
			while(var>k) {
				adder.add(res.get(i).get(var));
				var--;
				
			}
			if(var-1>=0) {
				adder.add((int)(res.get(i).get(var)*res.get(i).get(var-1)));

			}
			res.add(adder);
		}
		
		
		
		//to remove duplicate elements
		Set<List<Integer>> set=new HashSet<>();
		for(ArrayList<Integer> inner:res) {
			if(inner.size()==1) {
				continue;
			}
			Collections.sort(inner);
			set.add(new ArrayList<>(inner));
			}
		
		for(List<Integer> list:set) {
			System.out.println(list);
		}
	}

}
