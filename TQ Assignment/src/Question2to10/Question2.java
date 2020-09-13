package Question2to10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<String, Integer> lhm =new LinkedHashMap<>();
		lhm.put("pqr",12);
		lhm.put("rst", 43);
		lhm.put("abc", 4);
		lhm.put("mno", 2);
		
		ArrayList<String> al2=new ArrayList<>();
		
		System.out.println("String List");
		for(String s :lhm.keySet()) {
			
			System.out.println("\t"+s);
			al2.add(s);	
		}
		
		
		ArrayList<String> al=new ArrayList<>();
		int i=1;
		System.out.println("Enter two String For Compare");
		while(i<=2) {
			String s=sc.next();
			al.add(s);
			i++;
		}
		
		for(int j=0;j<1;j++)
		 {
			for(int k=0;k<al2.size();k++) {
				if(al.get(j).equals(al2.get(k))) {
					
					if(al.get(1).equals(al2.get(k+1))) {
						System.out.println("True");
						break;
					}
					else {
						System.out.println("False");
						break;
					}
					
				}
				
			}
		}
		
	}

}
