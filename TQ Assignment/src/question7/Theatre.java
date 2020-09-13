package question7;

public class Theatre {
	
	private int tid;
	private String tname;
	private String loc;
	Movie m;
	
	public Theatre() {
		
	}
	public Theatre(int tid, String tname, String loc, Movie m) {
		
		this.tid = tid;
		this.tname = tname;
		this.loc = loc;
		this.m = m;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Movie getM() {
		return m;
	}
	public void setM(Movie m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Theatre [tid=" + tid + ", tname=" + tname + ", loc=" + loc + ", m=" + m + "]";
	}
	
	

}
