package Question2to10;

public class Student16 implements Comparable<Student16> {
	
	private int sid;
	private int totalmarks;
	public Student16() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student16(int sid, int totalmarks) {
		super();
		this.sid = sid;
		this.totalmarks = totalmarks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	
	@Override
	public String toString() {
		return "Student16 [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}
	@Override
	public int compareTo(Student16 o) {
		if(o.getTotalmarks()-this.totalmarks==0) {
			return o.getSid()-this.sid;
		}
		return o.getTotalmarks()-this.totalmarks;
		//if(this.totalmarks-o.getTotalmarks()>0)
//		return 1;
//		else if(this.totalmarks-o.getTotalmarks()<0)
//			return -1;
//		else
//			return 0;
	}
	
	
	

}
