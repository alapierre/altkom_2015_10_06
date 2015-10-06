package pl.altkom.books.bo;

import pl.altkom.books.model.Address;
import pl.altkom.books.model.Author;
import pl.altkom.books.model.Book;
import pl.altkom.books.model.BookType;
import pl.altkom.books.model.Custommer;
import pl.altkom.books.model.Order;
import pl.altkom.books.model.OrderItem;
import pl.altkom.books.model.Price;
import pl.altkom.books.model.Publication;

public class BookStore {

	private final int LIMIT = 100;
	private int no;
	
	private int orderNo;
	
	private Book[] books = new Book[LIMIT]; 
	
	private Order[] orders = new Order[LIMIT];
	
	public void add(Book item) {
		books[no++] = item;
	}
	
	public OrderItem[] getItems() {
		OrderItem[] tmp = new OrderItem[no];
		System.arraycopy(books, 0, tmp, 0, no);
		return tmp;
	}
	
	public void sell(Custommer custommer, OrderItem... items) {
		
		Order order = new Order();
		
		for(OrderItem item : items) {
			order.add(item);
		}
		order.setCustommer(custommer);
		
		orders[orderNo++] = order; 
		
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
		
		Price price = new Price();
		price.setValue(124);
		price.setCurrency("PLN");
		
		Book book = new Book();
		book.setAuthor(author);
		book.setPages(100);
		book.setBookType(BookType.EBOOK);
		book.setPublication(publication);
		book.setPrice(price);
		
		bookStore.add(book);
		
		Custommer custommer = new Custommer();
		
		OrderItem item = new OrderItem();
		item.setBook(book);
		item.setVolume(1);
		item.setPrice(book.getPrice());
				
		bookStore.sell(custommer, item);
		
	}
}
