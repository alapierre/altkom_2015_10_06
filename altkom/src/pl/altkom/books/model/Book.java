package pl.altkom.books.model;

public class Book {
	
	private String title;
	private Author author;
	private int pages;
	private Publication publication;
	private BookType bookType;
	
	public BookType getBookType() {
		return bookType;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	public Publication getPublication() {
		return publication;
	}
	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author.getName() + " " + author.getLastName();
	}
	
	public Author getAuthorAsObject() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setAuthor(String author) {
		
		if(this.author == null) {
			this.author = new Author();
		}
		
		String res[] = author.split(" ",2);
		this.author.setName(res[0]);
		this.author.setLastName(res[1]);
		
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}

	
	
}
