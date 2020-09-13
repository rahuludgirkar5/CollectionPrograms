package Thinkitive;

import java.util.Scanner;

public class Work2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A's Work Completion Days");
		int a=sc.nextInt();
		System.out.println("Enter B's Work Completion Days");
		int b=sc.nextInt();
		System.out.println("Enter C's Work Completion Days");
		int c=sc.nextInt();
		System.out.println("Enter how many days B and C Work Together and Left");
		int d=sc.nextInt();
		
		
		int greater= a>b?a>c?a:c:b>c?b:c;
		int i=1;
		while(true) {
			if(greater%a==0 && greater%b==0 && greater%c==0) {
				int bwork=greater/b;
				int cwork=greater/c;
				int awork=greater/a;
				
				d=(bwork+cwork)*d;
				int remainwork=greater-d;
				remainwork=remainwork/awork;
				
				System.out.println("A Complete work in : "+remainwork);
				break;
			}
			else {
				i++;
				greater=greater*i;
			}
		}
		
		sc.close();
	}

}
