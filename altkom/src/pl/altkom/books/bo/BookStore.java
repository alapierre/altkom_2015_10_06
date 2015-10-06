package pl.altkom.books.bo;

import pl.altkom.books.model.Address;
import pl.altkom.books.model.Author;
import pl.altkom.books.model.Book;
import pl.altkom.books.model.BookType;
import pl.altkom.books.model.OrderItem;
import pl.altkom.books.model.Publication;

public class BookStore {

	private final int LIMIT = 100;
	private int no;
	
	private Book[] books = new Book[LIMIT]; 
	
	public void add(Book item) {
		books[no++] = item;
	}
	
	public OrderItem[] getItems() {
		OrderItem[] tmp = new OrderItem[no];
		System.arraycopy(books, 0, tmp, 0, no);
		return tmp;
	}
	
	
	public static void main(String[] args) {
		
		BookStore bookStore = new BookStore();
		
		Author author = new Author();
		author.setName("Jan");
		author.setLastName("Nowak");
		
		Address address = new Address();
		address.setCiti("Warszawa");
		address.setPostCode("01-962");
		address.setStreet("Marszalkowska 133");
		
		Publication publication = new Publication();
		publication.setName("KAW");
		publication.setAddress(address);
		
		Book book = new Book();
		book.setAuthor(author);
		book.setPages(100);
		book.setBookType(BookType.EBOOK);
		book.setPublication(publication);
		
		bookStore.add(book);
		
	}
}
