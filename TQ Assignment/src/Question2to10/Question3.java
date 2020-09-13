package Question2to10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		LinkedList<Integer> l1= new LinkedList<>();

		l1.add(2);
		l1.add(5);
		l1.add(7);
		l1.add(10);
		
		
		System.out.println(l1+"\n");
		
		ArrayList<Integer> al=new ArrayList<>();
		
		
		int c=0,m=1;
		
		for(int i=0;i<l1.size();) {
			
			if((i+m)!=l1.size()) {
				
			if(l1.get(i+m)-l1.get(i)==1 )
			{
				
				i++;
				
			}
			else {
				if(l1.contains(l1.get(i)+c+1))
				{
					c=0;
					i++;
					
				}
				else {
				al.add(l1.get(i)+c+1);
				c++;
				}
			}
		}
		else
			break;
		}
		
		System.out.println("Missing No \n"+al);
		
	}

}
