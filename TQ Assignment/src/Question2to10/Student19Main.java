package Question2to10;

import java.util.ArrayList;
import java.util.HashSet;

public class Student19Main {
	
	
	public static void main(String[] args) {
		
	
	Student19 s1=new Student19(101,"Santosh","B.Sc",2018,false);
	Student19 s2=new Student19(103,"Gauri","B.E.",2017,true);
	Student19 s3=new Student19(105,"Kunal","BCA",2019,false);
	Student19 s4=new Student19(107,"Lokesh","B.E.",2018,true);
	Student19 s5=new Student19(109,"Renuka","MCA",2019,false);
	
	HashSet<Student19> stulist=new HashSet<>();
	stulist.add(s1);
	stulist.add(s2);
	stulist.add(s3);
	stulist.add(s4);
	stulist.add(s5);
	System.out.println("Students :");
	for(Student19 stu:stulist) {
		System.out.println(stu);
	}
	
	ArrayList<Student19> placed=new ArrayList<>();
	ArrayList<Student19> notplaced=new ArrayList<>();
	
	
	for(Student19 stu:stulist) {
		
		boolean b=stu.isPlaced();
		if(b) {
			placed.add(stu);
		}
		else {
			notplaced.add(stu);
		}	
	}
	System.out.println("\nPlaced Student :");
	for(Student19 stu: placed) {
		System.out.println(stu);
	}
	System.out.println("\nNot Placed Student :");
	for(Student19 stu: notplaced) {
		System.out.println(stu);
	}
	}
}
