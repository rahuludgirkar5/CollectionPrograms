package Thinkitive;

import java.util.HashMap;
import java.util.Scanner;

public class Days1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, String> days=new HashMap<>();
		days.put(1, "Wednesday");
		days.put(2, "Thursday");
		days.put(3, "Friday");
		days.put(4, "Saturday");
		days.put(5, "Sunday");
		days.put(6, "Monday");
		days.put(7, "Tuesday");
		
		System.out.println("Enter a Day No Want to check in a Month");
		int i=sc.nextInt();
		
		if(i<=30) {
			
			if(i<=7) {
				for(Integer n:days.keySet()) {
					if(i==n) {
						System.out.println(days.get(n));
						break;
					}
				}
			}
			else {
				int day=i%7;
				for(Integer n:days.keySet()) {
					if(day==n) {
						System.out.println(days.get(n));
						break;
					}
				}
			}
			
		}
		else {
			System.out.println("Invalid No Enter Digit Under 30 ");
		}
		sc.close();
	}

}
