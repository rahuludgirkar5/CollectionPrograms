package Question2to10;

public class ExamTest16 {
	
	private int tid;
	private int sid;
	private int marks;
	public ExamTest16() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExamTest16(int tid, int sid, int marks) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "ExamTest16 [tid=" + tid + ", sid=" + sid + ", marks=" + marks + "]";
	}
	

}
