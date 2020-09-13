package Question2to10;

import java.util.List;

public class Movie {
	
	private int mid;
	private String mname;
	private List<String> actor;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int mid, String mname, List<String> actor) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.actor = actor;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public List<String> getActor() {
		return actor;
	}
	public void setActor(List<String> actor) {
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", actor=" + actor + "]";
	}
	

}
