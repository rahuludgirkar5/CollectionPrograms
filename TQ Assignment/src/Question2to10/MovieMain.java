package Question2to10;


import java.util.ArrayList;
import java.util.List;

public class MovieMain {
	
	public static void main(String[] args) {
		
		ArrayList<String> sholay=new ArrayList<>();
		sholay.add("Amitabh Bachchan");
		sholay.add("Dharmendra");
		sholay.add("Hema Malini");
		ArrayList<String> baghban=new ArrayList<>();
		baghban.add("Salman Khan");
		baghban.add("Hema Malini");
		baghban.add("Amitabh Bachchan");
		ArrayList<String> pink=new ArrayList<>();
		pink.add("Amitabh Bachchan");
		pink.add("Tapsee Pannu");
		ArrayList<String> fastfive=new ArrayList<>();
		fastfive.add("Paul Walker");
		fastfive.add("Vin Diesel");
		
		ArrayList<Movie> mlist=new ArrayList<>();
		mlist.add(new Movie(110,"Sholay",sholay));
		mlist.add(new Movie(121,"Baghban",baghban));
		mlist.add(new Movie(131,"Pink",pink));
		mlist.add(new Movie(110,"Fast and Furious",fastfive));
		
		System.out.println("Movies And actors");
		for(Movie m:mlist) {
			System.out.println("Movie :"+m.getMname()+"\nActors :");
			for(String s:m.getActor()) {
				System.out.println(s+"");
			}
			System.out.println();
		}
		
		int count=0;
		
		for(Movie m:mlist) {
			List<String> actor=m.getActor();
			for(String str:actor) {
				if("Amitabh Bachchan".equals(str)) {
					count++;
				}
			}
		}
		
		System.out.println("Amitabh Bachchan Worked in : "+count+" movies");
		
	}

}
