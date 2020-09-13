package Question2to10;

public class Student10 {
	
	private int sid;
	private String sname;
	
	public Student10() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student10(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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

	@Override
	public String toString() {
		return "Student10 [sid=" + sid + ", sname=" + sname + "]";
	}
	
	

}
