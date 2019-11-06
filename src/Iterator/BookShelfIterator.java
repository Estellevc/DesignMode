package Iterator;

public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index;
	public BookShelfIterator(BookShelf bookshelf) {
		this.bookShelf = bookshelf;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(this.bookShelf.getLength() > index) {
			return true;
		}
		else {
			return false;			
		}

	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book = this.bookShelf.getBookAt(this.index);
		index++;
		return book;
	}
	
}
