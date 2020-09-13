package Question2to10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student10Main {
	
	public static void main(String[] args) {
		
		HashMap<Student10, String> hm=new HashMap<>();
		hm.put(new Student10(31,"Roshan"), "Java");
		hm.put(new Student10(32,"Nitesh"), "C++");
		hm.put(new Student10(33,"Akshay"), "Angular");
		hm.put(new Student10(34,"Pranay"), "C++");
		hm.put(new Student10(35,"Mayur"), "Java");
		hm.put(new Student10(36,"Dinesh"), "Java");
		hm.put(new Student10(37,"Nutan"), "MySQL");
		hm.put(new Student10(38,"Bhaswa"), "Angular");
		hm.put(new Student10(39,"Sachin"), "C++");
		
		for(Student10 s:hm.keySet()) {
			System.out.println(s);
			System.out.println("Course : "+hm.get(s));
		}
		
		HashMap<String, List<Student10>> hm2=new HashMap<>();
		
		for(Student10 s:hm.keySet()) {
			String str=hm.get(s);
			if(hm2.containsKey(str)) {
				List<Student10> li=hm2.get(str);
				li.add(s);
			}
			else {
				ArrayList<Student10> al=new ArrayList<>();
				al.add(s);
				hm2.put(str, al);
			}
		}
		System.out.println();
		for(String s:hm2.keySet()) {
			System.out.println(s);
			System.out.println(hm2.get(s));
		}
	}

}
