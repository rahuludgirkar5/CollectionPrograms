package Thinkitive;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Rows");
	    int line = sc.nextInt();
	    int space = line;
	    for (int r = 1; r <= line * 2 - 1; r += 2) {
	    	int c;
	      for (int k = 1; k < space; k++)
	        System.out.print("_");
	      
	      for (c = 1; c <= r; c++)
	        System.out.print("*");
	      
	      int j=c;
	      if(j!=line*2) {
	    	  System.out.print("_");
	      }
	      System.out.println();
	      space--;
	    } 
	  
	sc.close();
	}

	
}
