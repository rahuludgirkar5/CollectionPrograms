package Question2to10;

import java.util.ArrayList;
import java.util.HashMap;

public class Order11Main {

	public static void main(String[] args) {
		
		ArrayList<Order11> ol=new ArrayList<>();
		ol.add(new Order11(12,"Pav Bhaji",60,3));
		ol.add(new Order11(34,"Samosa",75,5));
		ol.add(new Order11(58,"Kaju Katli",50,7));
		ol.add(new Order11(42,"Pav Bhaji",65,2));
		ol.add(new Order11(22,"Samosa",70,3));
		ol.add(new Order11(13,"Dosa",80,4));
		
		System.out.println("Today's Order list");
		for(Order11 o:ol) {
			System.out.println(o);
		}
		System.out.println();
		
		HashMap<String , Float> hm=new HashMap<>();
		
		for(Order11 o:ol) {
			
			String oname=o.getMname();
			int p=o.getPrice();
			int q=o.getQty();
			if(hm.containsKey(oname)) {
				Float n=hm.get(oname);
				n=n+(p*q);
				hm.put(oname, n);
			}
			else
			{
				Float pr=(float) (p*q);
				hm.put(oname, pr);
			}
		}
		
		for(String s:hm.keySet()) {
			System.out.println("Today's Total Sale \n"+s+" : "+hm.get(s));
		}
	}
	
}
