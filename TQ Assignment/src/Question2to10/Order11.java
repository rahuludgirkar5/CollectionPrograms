package Question2to10;

public class Order11 {
	private int oid;
	private String mname;
	private int price;
	private int qty;
	public Order11() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order11(int oid, String mname, int price, int qty) {
		super();
		this.oid = oid;
		this.mname = mname;
		this.price = price;
		this.qty = qty;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Order11 [oid=" + oid + ", mname=" + mname + ", price=" + price + ", qty=" + qty + "]";
	}
	
	

}
