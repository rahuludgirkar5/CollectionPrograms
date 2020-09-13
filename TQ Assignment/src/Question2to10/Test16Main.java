package Question2to10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Test16Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<ExamTest16> testlist=new ArrayList<>();
		testlist.add(new ExamTest16(11,101,15));
		testlist.add(new ExamTest16(22,101,13));
		testlist.add(new ExamTest16(33,101,17));
		testlist.add(new ExamTest16(11,102,13));
		testlist.add(new ExamTest16(22,102,18));
		testlist.add(new ExamTest16(33,102,15));
		testlist.add(new ExamTest16(11,103,12));
		testlist.add(new ExamTest16(22,103,9));
		testlist.add(new ExamTest16(33,103,16));
		
		System.out.println("Student Marks on Each Test with ID");
		for(ExamTest16 et:testlist) {
			System.out.println("Test ID :"+et.getTid()+" SID :"+et.getSid()+" Marks :"+et.getMarks());
		}
		
		Student16 s1=new Student16(101,0);
		Student16 s2=new Student16(102,0);
		Student16 s3=new Student16(103,0);
		
		HashSet <Student16> hlist=new HashSet<>();
		hlist.add(s1);
		hlist.add(s2);
		hlist.add(s3);
		System.out.println("\nStudents :");
		for(Student16 s:hlist) {
			System.out.println(s);
		}
		
		for(Student16 s:hlist) {
			int tm=s.getTotalmarks();
			int sid1=s.getSid();
			for(ExamTest16 et:testlist) {
				int sid2=et.getSid();
				if(sid1==sid2) {
					int marks=et.getMarks();
					tm=tm+marks;
				}
			}
			s.setTotalmarks(tm);
		}
		
		TreeSet<Student16> slist=new TreeSet<>(hlist);
		
			System.out.println("\nTo check Total Marks of Student press Y");
			char ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				
			for(Student16 s:slist) {
				System.out.println(s);
			}
		}
		
		
	}

}


