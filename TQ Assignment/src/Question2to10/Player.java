package Question2to10;

public class Player {
	
	private int pid;
	private String pname;
	private String country;
	private String team;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int pid, String pname, String country, String team) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.country = country;
		this.team = team;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", country=" + country + ", team=" + team + "]";
	}
	

}
