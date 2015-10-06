package pl.altkom.books.model;

public class Order {

	private final int LIMIT = 100;
	
	private Custommer custommer;
	private OrderItem[] items = new OrderItem[LIMIT];
	
	private int no;
	
	public Custommer getCustommer() {
		return custommer;
	}
	public void setCustommer(Custommer custommer) {
		this.custommer = custommer;
	}
	
	public void add(OrderItem item) {
		items[no++] = item;
	}
	
	public OrderItem[] getItems() {
		OrderItem[] tmp = new OrderItem[no];
		System.arraycopy(items, 0, tmp, 0, no);
		return tmp;
	}
	
}
