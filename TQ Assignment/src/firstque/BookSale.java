package firstque;

public class BookSale {
	
	Book b;
	int copiesSold;
	
	public BookSale(Book b, int copiesSold) {
		super();
		this.b = b;
		this.copiesSold = copiesSold;
	}
	
	public BookSale() {
		
	}

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public int getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	
	
	

}
