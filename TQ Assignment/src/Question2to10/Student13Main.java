package Question2to10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Student13Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		LinkedHashSet<Student13> lhs=new LinkedHashSet<>();
		lhs.add(new Student13(101,"Rahul"));
		lhs.add(new Student13(102,"Hitesh"));
		lhs.add(new Student13(104,"Manoj"));
		lhs.add(new Student13(106,"Umal"));
		
		LinkedHashSet<Student13> lhs2=new LinkedHashSet<>();
		lhs2.add(new Student13(102,"Hitesh"));
		lhs2.add(new Student13(101,"Rahul"));
		lhs2.add(new Student13(104,"Suraj"));
		lhs2.add(new Student13(106,"Umal"));
		
		System.out.println("Enter Student id to check Position");
		int id=sc.nextInt();
		int c1=0,c2=0;
		String sname1="";
		String sname2="";
		
		
		for(Student13 stu:lhs) {
			if(id==stu.getSid()) {
				sname1=stu.getName();
				c1++;
				break;
			}
			c1++;
		}
		for(Student13 st:lhs2) {
			
			if(id==st.getSid()) {
				sname2=st.getName();
				c2++;
				break;
			}
			c2++;
		}
		
		System.out.println("First Set Student Position at :"+c1+"\n"+sname1);
		System.out.println("Second Set Student Position at :"+c2+"\n"+sname2);
		
	}

}
