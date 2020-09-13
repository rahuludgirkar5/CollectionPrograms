package Question2to10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question14 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList<>();
		LinkedList<Integer> l2=new LinkedList<>();
		
		l1.add(2);l1.add(4);l1.add(16);l1.add(8);l1.add(23);
		l2.add(9);l2.add(10);l2.add(12);l2.add(7);l2.add(6);l2.add(25);l2.add(33);
		
		System.out.println(l1);
		System.out.println(l2+"\n");
		
		int a=0,b=0; 
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<l1.size()+l2.size();i++) {
			
			if(i%2==0 && a<l1.size()) {
				al.add(l1.get(a));
				a++;
			}
			else {
				al.add(l2.get(b));
				b++;
				if(b==l2.size()) {
					break;
				}
			}
		}
		
		System.out.println(al);
	}

}
