package question7;

public class Movie {

	private int mid;
	private String mname;
	private int rating;
	
	public Movie() {
		
	}

	public Movie(int mid, String mname, int rating) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.rating = rating;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", rating=" + rating + "]";
	}
	
	
}
