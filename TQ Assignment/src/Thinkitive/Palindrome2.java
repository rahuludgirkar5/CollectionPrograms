package Thinkitive;

import java.util.Scanner;

public class Palindrome2 {
	
		
		public static String reverse(String s) {
			String ch="";
			for(int i=0;i<s.length();i++)
			{
				 ch=ch+s.charAt(s.length()-i-1);
			}
			return ch;
		}
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a String To Check Palindrome or Not");
			
			String s=sc.next();
			String ch=reverse(s);
				
			if(s.equalsIgnoreCase(ch)) {
			
				System.out.println("Longest Palindrome :"+ch);
				
			}
			else {
				int e;
				String palin="";
				for(int i=0;i<s.length();i++) {
					
					String st1=s;
					
					
					for(int j=0;j<st1.length();j++) {
						e=st1.length()-j;
			
						String st2=st1.substring(i,e);
						String str1=reverse(st2);
						if(st2.length()<2) {
							break;
						}
						if(st2.equalsIgnoreCase(str1)) {
							palin=st2;
							break;
						}
						
					}
					
					if(palin.equalsIgnoreCase("")) {
						int st=0;
						int end=st1.length()-i;
						for(int j=0;j<st1.length();j++) {
							
							String st2=st1.substring(st,end);
							String str1=reverse(st2);
							if(st2.length()<2) {
								break;
							}
							if(st2.equalsIgnoreCase(str1)) {
								palin=st2;
								break;
							}
							st++;
							
						}
					}
					else if(palin.equalsIgnoreCase("")) {
						System.out.println("Not Palindrome ");
						break;
					}
					else {
						
						System.out.println("Longest Palindrome :"+palin);
						break;
						
					}
					
				}
				
				if(palin.equals("")) {
					System.out.println("Not Palindrome");
				}
				
				}
			
			
			
				sc.close();
		}


}

