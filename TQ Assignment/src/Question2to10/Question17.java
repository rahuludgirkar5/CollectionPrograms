package Question2to10;

import java.util.ArrayList;
import java.util.HashMap;

public class Question17 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("A+5");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		al.add("A+5");
		System.out.println("List");
		for(String s:al) {
			System.out.println(s);
		}
		
		HashMap<String, Integer> alpha=new HashMap<>();
		
		for(String s:al) {
			String str[]=s.split("[+]");
			if(alpha.containsKey(str[0])) {
				Integer value=alpha.get(str[0]);
				value=value+Integer.parseInt(str[1]);
				alpha.put(str[0], value);
			}
			else {
				Integer value=Integer.parseInt(str[1]);
				alpha.put(str[0],value);
			}
			
		}
		System.out.println();
		
		for(String str:alpha.keySet()) {
			System.out.println("Key :"+str+"\nValue :"+alpha.get(str));
		}
	}

}
