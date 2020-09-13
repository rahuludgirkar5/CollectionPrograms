package Thinkitive;

import java.util.Scanner;

public class Walk4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Raj Walks East 7km then South 5km then East 5km then North 10km");
		System.out.println("See th Result from his Starting Point");
		
		int total=0,sub=0;
		for(int i=1;i<=4;i++) {
			int j=sc.nextInt();
			total=total+j;
			if(i==4)
				sub=j;
		}
		total=total-sub;
		System.out.println("Raj is "+total+"km far from starting point");
		
		
		
	}

}
