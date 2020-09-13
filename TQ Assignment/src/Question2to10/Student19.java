package Question2to10;

public class Student19 {
	
	private int sid;
	private String sname;
	private String qual;
	private int passYear;
	private boolean placed;
	public Student19() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student19(int sid, String sname, String qual, int passYear, boolean placed) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.qual = qual;
		this.passYear = passYear;
		this.placed = placed;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public int getPassYear() {
		return passYear;
	}
	public void setPassYear(int passYear) {
		this.passYear = passYear;
	}
	public boolean isPlaced() {
		return placed;
	}
	public void setPlaced(boolean placed) {
		this.placed = placed;
	}
	@Override
	public String toString() {
		return "Student19 [sid=" + sid + ", sname=" + sname + ", qual=" + qual + ", passYear=" + passYear + ", placed="
				+ placed + "]";
	}
	

}
