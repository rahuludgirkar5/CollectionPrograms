package Question2to10;

import java.util.ArrayList;

public class Employee9Main {

	public static void main(String[] args) {
		Employee9 e1=new Employee9("Devraj",1,1);
		Employee9 e2=new Employee9("Ashok",2,1);
		Employee9 e3=new Employee9("Bhupesh",3,1);
		Employee9 e4=new Employee9("Sangam",4,2);
		Employee9 e5=new Employee9("Rupesh",5,3);
		
		ArrayList<Employee9> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.println("All Employees");
		for(Employee9 e:al) {
			System.out.println(e);
		}
		
		System.out.println("\nEmployees with Manager\n");
		for(Employee9 e:al) {
			if(e.getEid()==e.getMgrid()) {
				System.out.println("Manager \n"+e+"\n");
			}
			else {
				System.out.println("Employee :"+e);
				for(Employee9 em:al) {
					if(em.getEid()==e.getMgrid()) {
						System.out.println("Manager : "+em.getName());
					}
				}
			}
		}
		
		
	}
}
