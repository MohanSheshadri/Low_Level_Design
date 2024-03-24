import java.util.*;

class Library implements Aggregator {
  List<Book> booklist;

  Library(List<Book> booklist) {
    this.booklist = booklist;
  }

  public void add(Book book) {
    booklist.add(book);
  }

  public Iterator createIterator() {
    return new BookIterator(booklist);
  }

}