package Question2to10;

import java.util.List;

public class Student8 {
	
	int sid;
	String name;
	List<String> hobby;
	
	
	public Student8() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student8(int sid, String name, List<String> hobby ) {
		super();
		this.sid = sid;
		this.name = name;
		this.hobby = hobby;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getL() {
		return hobby;
	}


	public void setL(List<String> hobby) {
		this.hobby = hobby;
	}


	@Override
	public String toString() {
		return "Student8 [sid=" + sid + ", name=" + name + ", hobby=" + hobby + "]";
	}
	
	

}
