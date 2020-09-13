package all_objects;

import java.util.ArrayList;

import master_assignment.bean.Student;

public class StudentsObject {
	
	public static ArrayList<Student>  stuObject() {
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(11,"Roshan",984563,"ro@gmail.com"));
		al.add(new Student(12,"Santosh",223345,"san@gmail.com"));
		al.add(new Student(13,"Nikhil",853612,"niks@gmail.com"));
		al.add(new Student(14,"Rupesh",113622,"rup@gmail.com"));
		al.add(new Student(15,"Himanshi",976663,"him@gmail.com"));
		al.add(new Student(16,"Monika",942133,"monu@gmail.com"));
		al.add(new Student(17,"Kajal",754469,"kaj@gmail.com"));
		al.add(new Student(18,"Pranay",334533,"pn@gmail.com"));
		al.add(new Student(19,"Vinay",786542,"vinu@gmail.com"));
		al.add(new Student(20,"Sujit",914543,"sj@gmail.com"));
		al.add(new Student(21,"Akshay",542111,"ak@gmail.com"));
		al.add(new Student(22,"Renuka",786541,"renu@gmail.com"));
		
		return al;
	}

}
