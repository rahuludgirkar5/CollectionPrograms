package Question2to10;

public class Society15 {
	
	private int memberid;
	private String wing_flatno;
	private String name;
	public Society15() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Society15(int memberid, String wing_flatno, String name) {
		super();
		this.memberid = memberid;
		this.wing_flatno = wing_flatno;
		this.name = name;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getWing_flatno() {
		return wing_flatno;
	}
	public void setWing_flatno(String wing_flatno) {
		this.wing_flatno = wing_flatno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Society15 [memberid=" + memberid + ", Wing_flatno=" + wing_flatno + ", Name=" + name + "]";
	}
	
	

}
