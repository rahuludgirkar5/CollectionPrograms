package Question2to10;

public class Student6 {
	private int rollNo;
	private String name;
	private int marks;
	
	public Student6(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public Student6() {
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student6 [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
