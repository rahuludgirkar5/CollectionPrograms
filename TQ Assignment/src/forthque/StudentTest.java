package forthque;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentTest {
		HashSet<Student> hs=new HashSet<>();
		HashSet<Student> hs2=new HashSet<>();
	public void passedStu(HashMap<Student,Integer> hm) {
		 
		Set<Student> s1=hm.keySet();
		
		for(Student s : s1) {
			if(s.getCourse().equals("Java")) {
				int mk = hm.get(s);
				if(mk>=50) {
					hs.add(s);
				}
			}
			else {
				int mk=hm.get(s);
				if(mk>=60) {
					hs2.add(s);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		StudentTest s=new StudentTest();
		
		Student st1=new Student(101,"Rahul","Java");
		Student st2=new Student(102,"Lokesh","Java");
		Student st3=new Student(103,"Nikita","Angular");
		Student st4=new Student(104,"Hitesh","Java");
		Student st5=new Student(105,"Ajay","Angular");
		Student st6=new Student(106,"Sudesh","Angular");
		
		HashMap<Student, Integer> hm = new HashMap<>();
		
		hm.put(st1, 70);
		hm.put(st2, 45);
		hm.put(st3, 57);
		hm.put(st4, 63);
		hm.put(st5, 52);
		hm.put(st6, 75);
		
		
		for(Student stu:hm.keySet()) {
			System.out.println("Student :\n"+stu);
			System.out.println("Marks "+hm.get(stu));
		}
		
		s.passedStu(hm);
		
		System.out.println("\n\nPassed Student in Java"+s.hs);
		System.out.println("Passed Student in Angular"+s.hs2);
		
	}

}
