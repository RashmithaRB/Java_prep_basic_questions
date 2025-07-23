package intereface_practice;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//treeSet returns sorted  set ,insertion order is not considered
		//treeset implements navigableSet
		
		//whatever element is added first- data type of that element is considered and it should be continued further when adding remaiaing elements
		//what id difference between treeSet and sorted set
//		TreeSet ts=new TreeSet();
//		ts.add("rama");
//		System.out.println(ts);
//		ts.add("anu");
//		System.out.println(ts);
//		ts.add("babu");
//		ts.add("cat");
//		System.out.println(ts);
//		System.out.println(ts.first());
//		System.out.println(ts.last());
//		System.out.println(ts.headSet("rama"));
//		System.out.println(ts.tailSet("cat"));
//		System.out.println(ts.subSet("babu","rama"));
		
//		//SortedSet methods
//		
//		SortedSet<E> st=new SortedSet();
//		st.add("hello");

		
		//Navigable set
//		TreeSet ts=new TreeSet();
//		ts.add(7.50);
//		ts.add(7.59);
//		ts.add(8.00);
//		ts.add(8.10);
//		ts.add(8.15);
//		ts.add(8.32);
//		ts.add(8.59);
//		ts.add(9.00);
//		System.out.println(ts.floor(7.58));  //7.50,7.59,8
//		System.out.println(ts.ceiling(8.151)); //8.32
//		System.out.println(ts.lower(7.59)); //7.59
//		System.out.println(ts.higher(8.00)); //8.10
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.pollLast());
//		System.out.println(ts.descendingSet());
		
		//Vectors 
		//enumeration is the least used cursor
//		Vector v=new Vector();
//		for(int i=0;i<10;i++) {
//			v.add(i);
//		}
//		Enumeration e=v.elements();
//		while(e.hasMoreElements()) {
//			Integer i=(Integer)e.nextElement();
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//HashSet- iterator
//		HashSet v=new HashSet();
//		for(int i=0;i<10;i++) {
//			v.add(i);
//		}
//		System.out.println(v);
//		Iterator itr=v.iterator();
//		
//		while(itr.hasNext()) {
//			Integer i=(Integer)itr.next();
//			if(i%2==0) {
//				System.out.println(i);
//			}
//			else {
//				itr.remove();
//			}
//		}
//		System.out.println(v);
		
		//ListIterator
		//It is a birectional cursor i.e we can move both
		
		LinkedList ls=new LinkedList();
		ls.add("ajay");
		ls.add("suman");
		ls.add("harish");
		ls.add("sunil");
		System.out.println(ls);
		ListIterator itr=ls.listIterator();
		while(itr.hasNext()) {
			String s=(String)itr.next();
			if(s.equals("ajay")) {
				System.out.println("The next index of ajay :"+itr.nextIndex());
			}
			if(s.equals("harish")) {
				itr.remove();
			}
			else if(s.equals("suman")) {
				itr.add("manoj");
			}
			else if(s.equals("sunil")) {
				itr.set("Meena");
				while(itr.hasPrevious()) {
					String s2=(String)itr.previous();
					System.out.println(s2);
					System.out.println("the previous index is="+itr.previousIndex());
					break;
				}
			}
			}
		System.out.println(ls);
		
	}

}
