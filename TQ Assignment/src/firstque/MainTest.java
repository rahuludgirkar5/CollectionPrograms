package firstque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class MainTest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Book b=new Book(11,"Srinivas",120);
		Book b2=new Book(22,"R.K. Verma",150);
		Book b3=new Book(33,"Amish",80);
		Book b4=new Book(44,"Devraj",240);
		
		ArrayList<BookSale> al=new ArrayList<>();
		al.add(new BookSale(b,3));
		al.add(new BookSale(b2,6));
		al.add(new BookSale(b3,11));
		al.add(new BookSale(b4,9));
		
		HashMap<Integer, Float> hm =new HashMap<>();
		
		for(BookSale bk : al) {
			System.out.println("Book :\n"+bk.getB());
			float amt= bk.getCopiesSold() * bk.getB().getPrice();
			
			hm.put(bk.getB().getBid(),amt);
		}
		System.out.println("\n");
		for(Entry e:hm.entrySet()) {
			
			System.out.println("Book id : "+e.getKey());
			System.out.println("Book Bussiness Amount : "+e.getValue());
		}
		
		char ch='n';
		do {
			
			System.out.println("Want Update Bussiness Amount of Book Press Y or Want to Add New Book info Press 1");
			char c=sc.next().charAt(0);
			
			if(c=='y'||c=='Y') {
				
				System.out.println("Enter Book Id to update Book info");
				int id=sc.nextInt();
				
				for(BookSale bk1 : al) {
					int id1=bk1.getB().getBid();
					
					if(id==id1) {
						
						for(Integer i1 : hm.keySet()) {
							
							if(id1==i1) {
								System.out.println("Enter copies sold of book");
								int bcopy=sc.nextInt();
								
								float new_amt = hm.get(i1) * bcopy;
								hm.put(i1, new_amt);
								
								bcopy= bk1.getCopiesSold() + bcopy;
								bk1.setCopiesSold(bcopy);
								break;
							}
						}
						break;
						
					}
				
					}
				System.out.println("Want to Update More Book info Press Y or N");
				ch=sc.next().charAt(0);
				}
			else {
				Book bnew = new Book();
				
				System.out.println("Enter Book Id");
				int newbid=sc.nextInt();
				bnew.setBid(newbid);
				
				System.out.println("Enter Author name");
				String name=sc.next();
				bnew.setAuthor(name);
				
				System.out.println("Enter Book Price");
				float price=sc.nextFloat();
				bnew.setPrice(price);
				
				System.out.println("Enter Copies Sold of Book");
				int new_copy=sc.nextInt();
				
				al.add(new BookSale(bnew,new_copy));
				
				float new_amt= new_copy * price;
				
				hm.put(newbid, new_amt);
				
				System.out.println("Want to add another info Press Y and after then Press 1 \n Or\n Press N");
				
			}
			
			
		}while(ch=='Y'||ch=='y');
		
		
		for(BookSale bk : al) {
			System.out.println("Book :\n"+bk.getB());
			float amt= bk.getCopiesSold() * bk.getB().getPrice();
			
			hm.put(bk.getB().getBid(),amt);
		}
		System.out.println("\n");
		
		for(Entry e:hm.entrySet()) {
			
			System.out.println("Book id : "+e.getKey());
			System.out.println("Book Bussiness Amount : "+e.getValue());
		}
		
		
	}

}
