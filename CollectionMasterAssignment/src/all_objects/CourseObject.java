package all_objects;

import java.util.ArrayList;
import java.util.Date;

import master_assignment.bean.Course;

public class CourseObject {
	
	public static ArrayList<Course> cObject(){
		
		ArrayList<Course> al=new ArrayList<>();
			
		al.add(new Course(101,"Java",new Date(20/8/2020),"Java",45000,"3 Months"));
		al.add(new Course(103,"Angular",new Date(20/8/2020),"Angular",40000,"3 Months"));
		al.add(new Course(107,"Full Stack",new Date(20/8/2020),"Java and MySQL",50000,"3 Months"));
		al.add(new Course(109,"PHP",new Date(20/8/2020),"PHP",35000,"3 Months"));
		
		return al;
		
		}
	
}
