package Iterator;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	public void appendBook(Book book) {
		this.books[this.last] = book; 
		last++;
	}
	public Book getBookAt(int index) {
		return books[index];
	}
	public int getLength() {
		return last;
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}
	
}
