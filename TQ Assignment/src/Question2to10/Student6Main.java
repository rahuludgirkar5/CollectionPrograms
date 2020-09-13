package Question2to10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Student6Main {
	public static void main(String[] args) {
		
		Student6 s1=new Student6(101,"Rahul",70);
		Student6 s2=new Student6(102,"Ajay",80);
		Student6 s3=new Student6(103,"Sumit",70);
		Student6 s4=new Student6(104,"Shubham",70);
		Student6 s5=new Student6(106,"Akshay",75);
		Student6 s6=new Student6(107,"Varu",75);
		
		HashSet<Student6> hs=new HashSet<>();
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		
		for(Student6 s:hs) {
			System.out.println(s);
		}
		
		HashMap<Integer, List<Integer>> hm=new HashMap<>();
		
		for(Student6 s:hs) {
			
			if(hm.containsKey(s.getMarks())) {
				
				List<Integer> ls=hm.get(s.getMarks());
				ls.add(s.getRollNo());
				hm.put(s.getMarks(), ls);
				
			}
			else {
				ArrayList<Integer> al=new ArrayList<>();
				al.add(s.getRollNo());
				hm.put(s.getMarks(), al);
			}
				
		}
		System.out.println("\n");
		
		for(Integer i:hm.keySet()) {
		System.out.println("Marks : "+i);
		System.out.println("Roll No : "+hm.get(i));
		}
		
	}

}
