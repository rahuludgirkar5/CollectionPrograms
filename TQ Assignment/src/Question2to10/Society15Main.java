package Question2to10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Society15Main {
	
	public static void main(String[] args) {
		
		ArrayList<Society15> al=new ArrayList<>();
		al.add(new Society15(101,"W2","S.K Verma"));
		al.add(new Society15(102,"W1","Rahul Dambare"));
		al.add(new Society15(107,"W2","Dinesh Saroj"));
		al.add(new Society15(111,"W3","Sayam Kodi"));
		al.add(new Society15(106,"W2","P.K.Salunke"));
		al.add(new Society15(108,"W3","Pratik Roy"));
		
		
		HashMap<String, List<String>> wingmembers=new HashMap<>();
		
		for(Society15 sc:al) {
			
			String wing=sc.getWing_flatno();
			String name=sc.getName();
			if(wingmembers.containsKey(wing)) {
				
				List<String> socList=wingmembers.get(wing);
				socList.add(name);
				wingmembers.put(wing, socList);
			}
			else {
				ArrayList<String> soclist=new ArrayList<>();
				soclist.add(name);
				wingmembers.put(wing, soclist);
			}
			
		}
		
		for(String s: wingmembers.keySet()) {
			System.out.println(s);
			System.out.println(wingmembers.get(s));
		}
		
	}

}
