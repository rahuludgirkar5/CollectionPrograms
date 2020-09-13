package master_assignment.action;

import java.util.ArrayList;
import java.util.HashMap;

import all_objects.StudentsObject;
import all_objects.TestResultObject;
import master_assignment.bean.Student;
import master_assignment.bean.TestResult;

public class PoorPerformance {
	
	public static void main(String[] args) {
		
		ArrayList<TestResult> tlist=TestResultObject.testOb();
		ArrayList<Student> slist=StudentsObject.stuObject();
		HashMap<Student, Integer> hm=new HashMap<>();
		
		for(int i=0;i<tlist.size();i++) {
				int mk=tlist.get(i).getMarks();
				
			for(int j=0;j<tlist.size();j++) {
				if(tlist.get(i).getStudentId()==tlist.get(j).getStudentId() && i<j) {
					
					mk=mk+tlist.get(j).getMarks();
					mk=mk/2;
					if(mk<40) {
						
						for(Student st: slist) {
							if(st.getStudent_id()==tlist.get(i).getStudentId()) {
								hm.put(st, mk);
							}
						}
					
				
					}
				}
			}
			
		}
		
		
		for(Student st : hm.keySet()) {
			System.out.print(st);
			System.out.println("Marks : "+hm.get(st)+"\n");
		}
	}

}
