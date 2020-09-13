package question7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieTheatre {
	
	public static void main(String[] args) {
		
		Movie m=new Movie(101,"BhoolBhulaiya",4);
		Movie m2=new Movie(102,"Mera Krodh",3);
		Movie m3=new Movie(103,"War",4);
		Movie m4=new Movie(104,"Haikyuu",5);
		Movie m5=new Movie(105,"Kali",2);
		
		Theatre th=new Theatre(11,"Adlabs","Chandrapur",m);
		Theatre th1=new Theatre(15,"Miraj Cinema","Nagpur",m3);
		Theatre th2=new Theatre(20,"Sapna Talkies","Pune",m2);
		Theatre th3=new Theatre(12,"Inox","Nagpur",m4);
		Theatre th4=new Theatre(11,"Carnival","Amravati",m5);
		
		ArrayList<Theatre> al =new ArrayList<>();
		al.add(th);
		al.add(th1);
		al.add(th2);
		al.add(th3);
		al.add(th4);
		
		for(Theatre t:al) {
			System.out.println(t.getTname()+"  "+t.getLoc()+"  "+t.getTid());
			System.out.println("Movie : "+t.getM());
		}
		
		Comparator<Theatre> c1=new Comparator<Theatre>() {
			public int compare(Theatre thr1,Theatre thr2) {
				if(thr1.getM().getRating()-thr2.getM().getRating()==0) {
					return thr1.getTname().compareTo(thr2.getTname());
				}
				else {
					return thr2.getM().getRating()-thr1.getM().getRating();
				}
			}
		};
		
		Collections.sort(al, c1);
		System.out.println();
		
		for(Theatre t:al) {
			System.out.println(t.getTname()+"  "+t.getLoc()+"  "+t.getTid());
			System.out.println("Movie : "+t.getM());
		}
	}

}
