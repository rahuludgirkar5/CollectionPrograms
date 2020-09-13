package Question2to10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		
		Customer c1=new Customer(11,"Ajay",3);
		Customer c2=new Customer(15,"Roshan",2);
		Customer c3=new Customer(20,"Sumit",1);
		Customer c4=new Customer(11,"Ajay",2);
		Customer c5=new Customer(30,"Sandip",4);
		Customer c6=new Customer(20,"Sumit",2);
		Customer c7=new Customer(40,"Trupti",1);
		
		
		ArrayList<Customer> al=new ArrayList<>();
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		al.add(c6);
		al.add(c7);
		for(Customer c:al) {
			System.out.println(c);
			
		}
		for(int i=0;i<al.size();i++) {
			for(int j=0;j<al.size();j++) {
				
				if(al.get(i).getCid()==al.get(j).getCid()&&i<j) {
					int a=al.get(i).getItems();
					a=a+al.get(j).getItems();
					al.get(i).setItems(a);
				}
			}
		}
		
//		
		TreeSet<Customer> hs=new TreeSet<>(al);
//		
//		for(int i=0;i<al.size();i++) {
//			
//			
//			int id1=al.get(i).getCid();
//			String cn1=al.get(i).getCname();
//			int it=al.get(i).getItems();
//			
//			for(int j=0;j<al.size();j++) {
//				int id2=al.get(j).getCid();
//				String cn2=al.get(j).getCname();
//				int it2=al.get(i).getItems();
//				
//				if((id1==id2 && cn1.equals(cn2)) && j>i) {
//					
//					 it=it+it2; 
//					 al.get(i).setItems(it);
//				}
//			}
//			
//			
//		}
		System.out.println("\n");
		for(Customer c:hs) {
			System.out.println(c);
		}
	}

}
