package Question2to10;

import java.util.ArrayList;
import java.util.Scanner;

public class Question18 {
	
	public static int accept(String str) {
		ArrayList<String> al=new ArrayList<>();
		al.add("A+5");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		
		
		Integer num=0;
		for(String s:al) {
			String sarr[]=s.split("[+]");
			if(str.equalsIgnoreCase(sarr[0])) {
				num=Integer.parseInt(sarr[1]);
			}
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		String ch=sc.next();
		int value=accept(ch);
		System.out.println("Value :"+value);
		
		sc.close();
	}

}
