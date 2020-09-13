package Question2to10;

public class Employee9 {
	String name;
	int eid;
	int mgrid;
	
	public Employee9(String name, int eid, int mgrid) {
		super();
		this.name = name;
		this.eid = eid;
		this.mgrid = mgrid;
	}
	public Employee9() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getMgrid() {
		return mgrid;
	}
	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	@Override
	public String toString() {
		return "Employee9 [name=" + name + ", eid=" + eid + ", mgrid=" + mgrid + "]";
	}
	
	

}
