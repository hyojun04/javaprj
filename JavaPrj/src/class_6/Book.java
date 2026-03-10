package class_6;

public class Book {
	String title;
	String author;
	int pageCount;
	
	public Book() {
		this("Unknown Title","Unknown Author");
	}
	
	public Book(String title, String author) {
		this(title, author, 0);
	}
	
	public Book(String title, String author, int pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}
	
	public void getBookinfo() {
		System.out.println("title: " + title);
		System.out.println("author: " + author);
		System.out.println("pageCount: " + pageCount);
	}

}
