package master_assignment.action;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import all_objects.CourseObject;
import master_assignment.bean.Course;
import master_assignment.bean.Student;

public class ShowCourse {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Course> al=CourseObject.cObject();
		ArrayList<Student> stu1=new ArrayList<>();
		stu1.add(new Student(11,"Roshan",984563,"ro@gmail.com"));
		stu1.add(new Student(12,"Santosh",223345,"san@gmail.com"));
		stu1.add(new Student(13,"Nikhil",853612,"niks@gmail.com"));
		
		ArrayList<Student> stu2=new ArrayList<>();
		stu2.add(new Student(14,"Rupesh",113622,"rup@gmail.com"));
		stu2.add(new Student(15,"Himanshi",976663,"him@gmail.com"));
		stu2.add(new Student(16,"Monika",942133,"monu@gmail.com"));
		
		ArrayList<Student> stu3=new ArrayList<>();
		stu3.add(new Student(17,"Kajal",754469,"kaj@gmail.com"));
		stu3.add(new Student(18,"Pranay",334533,"pn@gmail.com"));
		stu3.add(new Student(19,"Vinay",786542,"vinu@gmail.com"));
		stu3.add(new Student(22,"Renuka",786541,"renu@gmail.com"));
		
		ArrayList<Student> stu4=new ArrayList<>();
		stu4.add(new Student(20,"Sujit",914543,"sj@gmail.com"));
		stu4.add(new Student(21,"Akshay",542111,"ak@gmail.com"));
		
		
		HashMap<Integer, List<Student>> studentMap = new HashMap<Integer, List<Student>>();
		studentMap.put(al.get(0).getCourseId(), stu1);
		studentMap.put(al.get(1).getCourseId(), stu1);
		studentMap.put(al.get(2).getCourseId(), stu1);
		studentMap.put(al.get(3).getCourseId(), stu1);
		
		 int courseid=0;
		 int max=0;
		 String cname="";
		for(Integer id : studentMap.keySet()) {
		
			List<Student> l1=studentMap.get(id);
				
				if(l1.size()>max) {
					max=l1.size();
					courseid=id;
					for(Course c:al) {
						if(id==c.getCourseId()) {
							cname=c.getCourse_name();
						break;
						}
						
					}
				}
			}
		
		System.out.println("Course ID :"+courseid+"\nCourse Name : "+cname);
			
	}
		
	

}
