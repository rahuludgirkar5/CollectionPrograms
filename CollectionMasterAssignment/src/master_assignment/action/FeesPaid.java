package master_assignment.action;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import all_objects.StudentsObject;
import all_objects.TransacObject;
import master_assignment.bean.Student;
import master_assignment.bean.Transaction;

public class FeesPaid {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> stulist=StudentsObject.stuObject();
		ArrayList<Transaction> trlist=TransacObject.transactOb();
		
		LinkedHashMap<Student, Integer> lhm=new LinkedHashMap<>();
		
		int total=0;
		for(Student st : stulist) {
			int sid=st.getStudent_id();
			total=0;
			
			for(Transaction t : trlist) {
				if(t.getStudId()==sid) {
					total=total+t.getPaidfees();
					
				}
			}
			
			lhm.put(st, total);
		}
		
		for(Student st: lhm.keySet()) {
			
			int fee=lhm.get(st);
//			if(fee>=50000 ||)
		}
		
//		for(Student st:lhm.keySet()) {
//			System.out.println(lhm.get(st));
//		}
	}

}
