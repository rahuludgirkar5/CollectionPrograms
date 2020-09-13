package all_objects;

import java.util.ArrayList;
import java.util.Date;

import master_assignment.bean.Transaction;

public class TransacObject {
	
	public static ArrayList<Transaction> transactOb() {
		
		ArrayList<Transaction> al=new ArrayList<>();
		al.add(new Transaction(20000, 11, new Date(15 / 8 /2020)));
		al.add(new Transaction(30000, 12, new Date(17 / 8 /2020)));
		al.add(new Transaction(45000, 13, new Date(17 / 8 /2020)));
		
		al.add(new Transaction(30000, 14, new Date(16 / 8 /2020)));
		al.add(new Transaction(20000, 15, new Date(17 / 8 /2020)));
		al.add(new Transaction(10000, 16, new Date(19 / 8 /2020)));
		
		al.add(new Transaction(50000, 17, new Date(16 / 8 /2020)));
		al.add(new Transaction(40000, 18, new Date(16 / 8 /2020)));
		al.add(new Transaction(35000, 19, new Date(17 / 8 /2020)));
		
		al.add(new Transaction(10000, 20, new Date(18 / 8 /2020)));
		al.add(new Transaction(25000, 21, new Date(16 / 8 /2020)));
		al.add(new Transaction(30000, 22, new Date(15 / 8 /2020)));
		
		al.add(new Transaction(15000, 11, new Date(21 / 8 /2020)));
		al.add(new Transaction(15000, 12, new Date(19 / 8 /2020)));
		al.add(new Transaction(10000, 14, new Date(20 / 8 /2020)));
		al.add(new Transaction(10000, 15, new Date(22 / 8 /2020)));
		al.add(new Transaction(30000, 16, new Date(22 / 8 /2020)));
		al.add(new Transaction(10000, 18, new Date(20 / 8 /2020)));
		al.add(new Transaction(10000, 20, new Date(22 / 8 /2020)));
		al.add(new Transaction(10000, 21, new Date(19 / 8 /2020)));
		al.add(new Transaction( 5000, 22, new Date(17 / 8 /2020)));
		
		return al;
	}

}
