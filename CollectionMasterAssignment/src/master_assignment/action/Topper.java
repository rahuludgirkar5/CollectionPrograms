package master_assignment.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import all_objects.CourseObject;
import all_objects.TestResultObject;
import master_assignment.bean.Course;
import master_assignment.bean.TestResult;

public class Topper {
	
	public static void main(String[] args) {
		
		ArrayList<TestResult> tl=TestResultObject.testOb();
		ArrayList<Course> cl=CourseObject.cObject();
		
		HashMap<Integer, List<TestResult>> test_map = new HashMap<Integer, List<TestResult>>();
		
		
		int tid=301;
	
		for(Course c : cl) {
			ArrayList<TestResult> trs=new ArrayList<>();
			for(TestResult tr : tl) {
				if(tr.getTestid()==tid) {
					trs.add(tr);
					test_map.put(c.getCourseId(), trs);
				}
				
			}
			tid++;
		}
		
		TreeMap<Integer, List<TestResult>> tm=new TreeMap<>(test_map);
		
		for(Integer in :tm.keySet()) {
			System.out.println("Course Id :"+in);
			List<TestResult> list =tm.get(in);
			Collections.sort(list);
			for(TestResult t:tm.get(in)) {
				System.out.println("Test Id : "+t.getTestid()+" Stud Id : "+t.getStudentId()+" Marks :"+t.getMarks());
			}
			
		}
	}

}
