package firstque;

public class Book {
	private int bid;
	private String author;
	private float price;
	
	public Book(int bid, String author, float price) {
		super();
		this.bid = bid;
		this.author = author;
		this.price = price;
	}
	
	public Book() {
		
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", author=" + author + ", price=" + price + "]";
	}
}
