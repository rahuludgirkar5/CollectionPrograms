package Question2to10;

import java.util.HashMap;

public class Voting12 {
	public static void main(String[] args) {
		
		HashMap<String, String> hm=new HashMap<>();
		hm.put("12351", "BJP");hm.put("12352", "Shivsena");
		hm.put("12353", "Congress");hm.put("12354", "BJP");
		hm.put("12355", "NCP");hm.put("12356", "Shivsena");
		hm.put("12357", "Other");hm.put("12358", "BJP");
		hm.put("12359", "Congress");hm.put("12351", "NCP");
		
		HashMap<String, Integer> hm2=new HashMap<>();
		
		
		for(String str:hm.keySet()) {
			String party=hm.get(str);
			
			if(hm2.containsKey(party)) {
				
				Integer count=hm2.get(party);
				count=count+1;
				hm2.put(party, count);
				
			}
			else {
				
				Integer count=1;
				hm2.put(party, count);
			}
		}
		
		for(String s: hm2.keySet()) {
			System.out.println(s+" Votes : "+hm2.get(s));
		}
		
	}

}
