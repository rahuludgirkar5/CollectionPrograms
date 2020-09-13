package Question2to10;

import java.util.ArrayList;

public class PlayerMain {
	
	public static void main(String[] args) {
		
		ArrayList<Player> plist=new ArrayList<>();
		plist.add(new Player(7,"M.S.Dhoni","India","CSK"));
		plist.add(new Player(10,"Maxwell","Australia","MI"));
		plist.add(new Player(3,"Stark","Australia","RCB"));
		plist.add(new Player(17,"Kane Williamson","New Zealand","SRH"));
		plist.add(new Player(9,"Rohit Sharma","India","MI"));
		plist.add(new Player(15,"Shane Watson","Australia","RCB"));
		plist.add(new Player(23,"Virat Kohli","India","RCB"));
		plist.add(new Player(15,"Chris Morris","South Africa","DD"));
		plist.add(new Player(24,"Ricky Ponting","Australia","KKR"));
		
		String team="";
		int max=0;
		
		for(Player p:plist) {
			int count=0;
			String t=p.getTeam();
			
			for(Player p2:plist) {
			if(p2.getTeam().equals(t) && p2.getCountry().equals("Australia")) {
				count++;
			}
			}
			if(count>max) {
				max=count;
				team=t;
			}
		}
		System.out.println(team+" has "+max+" Australian Players");
		
	}

}
