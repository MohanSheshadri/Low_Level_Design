import java.util.*;

class BookIterator implements Iterator {
  List<Book> books;
  int pointer = 0;

  BookIterator(List<Book> books) {
    this.books = books;
  }

  public boolean hasNext() {
    return pointer < books.size();
  }

  public Book next() {
    return books.get(pointer++);
  }

}