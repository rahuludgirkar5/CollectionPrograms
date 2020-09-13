package Question2to10;

public class TempMain {
	public static void main(String[] args) {
		
		Customer c1=new Customer(11,"Ajay",3);
		Customer c2=new Customer(15,"Roshan",2);
		Customer c3=new Customer(20,"Sumit",1);
		Customer c4=new Customer(11,"Ajay",2);
		Customer c5=new Customer(30,"Sandip",4);
		Customer c6=new Customer(20,"Sumit",2);
		Customer c7=new Customer(40,"Trupti",1);
		
		System.out.println(c1.hashCode());
		System.out.println(c4.hashCode());
		
	}

}
