package Question2to10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student8Main {
	
	public static void main(String[] args) {
		
		ArrayList<String > al1=new ArrayList<>();
		al1.add("Playing");
		al1.add("Coding");
		
		ArrayList<String > al2=new ArrayList<>();
		al2.add("Dancing");
		al2.add("Coding");
		al2.add("Swimming");
		
		ArrayList<String > al3=new ArrayList<>();
		al3.add("Playng");
		al3.add("Swimming");
		al3.add("Karate");
		
		Student8 s1=new Student8(10,"Roshan",al1);
		Student8 s2=new Student8(11,"Nutan",al2);
		Student8 s3=new Student8(12,"Chetan",al3);
		Student8 s4=new Student8(13,"Akshay",al1);
		
		ArrayList<Student8> sl=new ArrayList<>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		
		for(Student8 s:sl) {
			System.out.println(s);
		}
		
		HashMap<String, List<Student8>> hm=new HashMap<>();
		
		for(Student8 stu1: sl) {
			
			List<String> l1=stu1.getL();
			
			for(String str:l1) {
				
				if(hm.containsKey(str)) {
					List<Student8> stulist=hm.get(str);
					stulist.add(stu1);
					hm.put(str, stulist);
				}
				else
				{
					ArrayList<Student8> stulist=new ArrayList<>();
					stulist.add(stu1);
					hm.put(str, stulist);
				}
			}
		}
		
		for(String s:hm.keySet()) {
			System.out.println("Hobby \n"+s);
			for(Student8 st: hm.get(s)) {
				System.out.println(st);
			}
			
		}
		
		
	}

}
