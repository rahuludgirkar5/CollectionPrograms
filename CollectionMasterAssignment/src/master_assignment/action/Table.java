package master_assignment.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import all_objects.CourseObject;
import all_objects.TransacObject;
import master_assignment.bean.Course;
import master_assignment.bean.Student;
import master_assignment.bean.Transaction;

public class Table {
	
	public static void main(String[] args) {
		ArrayList<Course> colist=CourseObject.cObject();
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
		studentMap.put(colist.get(0).getCourseId(), stu1);
		studentMap.put(colist.get(1).getCourseId(), stu2);
		studentMap.put(colist.get(2).getCourseId(), stu3);
		studentMap.put(colist.get(3).getCourseId(), stu4);
		
		HashMap<Integer, List<Student>> slist=studentMap;
		
		ArrayList<Transaction> trans=TransacObject.transactOb();
		
		int totalrev=0;
		
		for(Course c: colist) {
			System.out.println("Course "+c.getCourse_name()+"\nStudents Count : "+slist.get(c.getCourseId()).size());
			int corevenue=0;
			for(Transaction t :trans) {
				
				for(Student s:slist.get(c.getCourseId())) {
				if(t.getStudId()==s.getStudent_id()) {
					corevenue=corevenue+t.getPaidfees();
				}
				}
			}
			int tempreve=c.getCourseFees()*slist.get(c.getCourseId()).size();
			System.out.println("Total Revenue "+tempreve);
			System.out.println("Course Collection till Date : "+corevenue);
			System.out.println("Not Collected : "+(tempreve-corevenue));
			int per=(corevenue/tempreve);
			per=per*100;
			System.out.println("Percentage Collection : "+per+"\n");
			totalrev=totalrev+tempreve;
		}
	}

}
