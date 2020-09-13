package Question2to10;

public class Customer implements Comparable<Customer>{
	
	int cid;
	String cname;
	int items;
	
	public Customer() {
	}
	public Customer(int cid, String cname, int items) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.items = items;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", items=" + items + "]";
	}
	@Override
	public int hashCode() {
		
		int result = 1;
		result = cid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Customer ob=(Customer)obj;
		if(this.cid==ob.cid)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Customer o) {
		
		return o.getItems()-this.items;
	}
	
	

}
